package com.intellikoder.food.delivery.service.application.service;

import com.intellikoder.food.delivery.service.application.entity.FoodDelivery;
import com.intellikoder.food.delivery.service.application.repository.FoodDeliveryRepository;
import com.intellikoder.food.delivery.service.application.vo.ResponseTemplateVO;
import com.intellikoder.food.delivery.service.application.vo.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class FoodDeliveryService {
    @Autowired
    private FoodDeliveryRepository foodDeliveryRepository;

    @Autowired
    private RestTemplate restTemplate;

    private static final String BASEURL = "http://RESTAURANT-SERVICE/restaurants/";

    public List<FoodDelivery> activeDeliveries(){
        return foodDeliveryRepository.findAll();
    }

    public FoodDelivery saveFoodDelivery(FoodDelivery foodDelivery){
        return foodDeliveryRepository.save(foodDelivery);
    }

    public ResponseTemplateVO getRestaurantWithFoodDelivery(Integer deliveryId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        FoodDelivery foodDelivery = foodDeliveryRepository.findByDeliveryId(deliveryId);

        Restaurant restaurant = restTemplate.getForObject( BASEURL + foodDelivery.getDeliveryId(), Restaurant.class);

        vo.setFoodDelivery(foodDelivery);
        vo.setRestaurant(restaurant);
        return vo;
    }
}
