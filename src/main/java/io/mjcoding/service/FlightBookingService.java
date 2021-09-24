package io.mjcoding.service;

import io.mjcoding.dto.FlightAcknoledgementRequest;
import io.mjcoding.dto.FlightBookingRequest;
import io.mjcoding.entity.PassengerInfo;
import io.mjcoding.entity.PaymentInfo;
import io.mjcoding.entity.RegistrationDetails;
import io.mjcoding.repository.PassengerRepository;
import io.mjcoding.repository.PaymentRepository;
import io.mjcoding.repository.RegistrationDetailsRepository;
import io.mjcoding.util.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;



public class FlightBookingService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    RegistrationDetailsRepository registrationDetailsRepository;

    @Autowired
    RegistrationDetails registrationDetails;

    @Transactional
    public FlightAcknoledgementRequest bookingTicket(FlightBookingRequest request) {

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPid());
        paymentRepository.save(paymentInfo);


        registrationDetails.setPnrNo(paymentInfo.getPaymentId().split("-")[0]);
        registrationDetails.setStatus("Success");
        registrationDetails.setTotalFare(paymentInfo.getAmount());
        registrationDetails.setPassengerId(passengerInfo.getPid());

        registrationDetailsRepository.save(registrationDetails);

        return new FlightAcknoledgementRequest("Successfully", paymentInfo.getAmount(),
                paymentInfo.getPaymentId().split("-")[0],
                passengerInfo);

    }
}
