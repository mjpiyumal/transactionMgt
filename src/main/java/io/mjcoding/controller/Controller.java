package io.mjcoding.controller;

import io.mjcoding.dto.FlightAcknoledgementRequest;
import io.mjcoding.dto.FlightBookingRequest;
import io.mjcoding.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Controller {

    @Autowired
    FlightBookingService flightBookingService;

    @PostMapping("/save")
    public FlightAcknoledgementRequest saveFlightTicket(@RequestBody FlightBookingRequest bookingRequest) {
        return flightBookingService.bookingTicket(bookingRequest);
    }

}
