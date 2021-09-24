package io.mjcoding.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "regDetails")
@Component
public class RegistrationDetails {

    @Id
    private  String pnrNo;
    private String status;
    private double totalFare;
    private Long passengerId;

}
