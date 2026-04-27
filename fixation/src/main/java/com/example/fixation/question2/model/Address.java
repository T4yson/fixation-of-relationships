package com.example.fixation.question2.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "employee")
@EqualsAndHashCode(exclude = "employee")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String number;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
