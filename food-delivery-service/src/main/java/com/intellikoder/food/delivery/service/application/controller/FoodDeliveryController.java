package com.intellikoder.food.delivery.service.application.controller;

import com.intellikoder.food.delivery.service.application.entity.FoodDelivery;
import com.intellikoder.food.delivery.service.application.service.FoodDeliveryService;
import com.intellikoder.food.delivery.service.application.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/delivery")
public class FoodDeliveryController {

    @Autowired
    private FoodDeliveryService foodDeliveryService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/create-order")
    public ResponseEntity<FoodDelivery> saveDeliveryDetails(@RequestBody FoodDelivery foodDelivery){
        FoodDelivery food = foodDeliveryService.saveFoodDelivery(foodDelivery);
        return new ResponseEntity<>(food, HttpStatus.CREATED);
    }

    @GetMapping("/order-stats/{deliveryId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseTemplateVO getOrderDelivery(@PathVariable Integer deliveryId){
      return foodDeliveryService.getRestaurantWithFoodDelivery(deliveryId);
    }


}
