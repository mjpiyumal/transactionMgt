package io.mjcoding.config;

import io.mjcoding.service.FlightBookingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FlightBookingService flightBookingService() {
        return new FlightBookingService();
    }

}
