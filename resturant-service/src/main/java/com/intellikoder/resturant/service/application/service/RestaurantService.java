package com.intellikoder.resturant.service.application.service;

import com.intellikoder.resturant.service.application.entity.Restaurant;
import com.intellikoder.resturant.service.application.entity.Restaurant;
import com.intellikoder.resturant.service.application.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;
    public List<Restaurant> retrieveAllRestaurants(){
        return restaurantRepository.findAll();
    }

    public Restaurant saveRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

    public Optional<Restaurant> retrieveRestaurant(Long restaurant_id){
        return restaurantRepository.findById(restaurant_id);
    }
}
