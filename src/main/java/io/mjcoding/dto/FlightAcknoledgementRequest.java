package io.mjcoding.dto;

import io.mjcoding.entity.PassengerInfo;
import io.mjcoding.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightAcknoledgementRequest {

    private String status;
    private double totalFare;
    private  String pnrNo;
    private PassengerInfo passengerInfo;

}
