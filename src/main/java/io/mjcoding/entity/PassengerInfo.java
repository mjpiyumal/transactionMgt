package io.mjcoding.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "passengerInfo")
public class PassengerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;
    private String name;
    private String email;
    private String source;
    private String destination;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern= "dd-MM-yyyy")
    private Date travelDate;
    private String pickupTime;
    private String arrivalTime;
    private double fare;
}
