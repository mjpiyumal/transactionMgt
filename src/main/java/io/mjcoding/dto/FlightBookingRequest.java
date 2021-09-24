package io.mjcoding.dto;

import io.mjcoding.entity.PassengerInfo;
import io.mjcoding.entity.PaymentInfo;
import io.mjcoding.entity.RegistrationDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
    private RegistrationDetails registrationDetails;

}
