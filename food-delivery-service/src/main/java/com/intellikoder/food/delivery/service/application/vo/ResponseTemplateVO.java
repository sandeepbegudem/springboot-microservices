package com.intellikoder.food.delivery.service.application.vo;

import com.intellikoder.food.delivery.service.application.entity.FoodDelivery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Restaurant restaurant;
    private FoodDelivery foodDelivery;
}
