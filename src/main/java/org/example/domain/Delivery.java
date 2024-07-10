package org.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Delivery {

    @Id @GeneratedValue
    private Long id;
    private String city;
    private String street;
    private String zipcode;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    private DeliveryStatus status;
}
