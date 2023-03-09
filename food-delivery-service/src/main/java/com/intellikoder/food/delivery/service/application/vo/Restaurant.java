package com.intellikoder.food.delivery.service.application.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurant {

    private Integer restaurantId;

    private String restaurantName;

    private String cuisineRegion;
}
