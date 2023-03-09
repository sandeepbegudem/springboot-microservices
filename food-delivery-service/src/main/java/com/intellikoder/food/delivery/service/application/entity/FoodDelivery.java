package com.intellikoder.food.delivery.service.application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "food_delivery_party")
public class FoodDelivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "delivery_id")
    private Integer deliveryId;

    @Column(name = "food_del_party_name")
    private String delPtyName;

    @Column(name = "del_driver_name")
    private String delDrName;
    @Column(name = "restaurant_id")
    private Long restaurantId;
}
