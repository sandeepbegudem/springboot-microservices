package com.intellikoder.resturant.service.application.controller;

import com.intellikoder.resturant.service.application.entity.Restaurant;
import com.intellikoder.resturant.service.application.entity.Restaurant;
import com.intellikoder.resturant.service.application.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.retrieveAllRestaurants();
    }

    @GetMapping("/{restaurant_id}")
    public Optional<Restaurant> getAllRestaurants(@PathVariable Long restaurant_id){
        Optional<Restaurant> opt = restaurantService.retrieveRestaurant(restaurant_id);
        return opt;
        }

    @PostMapping("/save")
    public ResponseEntity<Restaurant> saveRestaurant(@RequestBody Restaurant restaurant){

         Restaurant rest = restaurantService.saveRestaurant(restaurant);
        return new ResponseEntity<>(rest, HttpStatus.CREATED);
    }
}
