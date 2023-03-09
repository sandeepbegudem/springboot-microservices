package com.intellikoder.food.delivery.service.application.repository;

import com.intellikoder.food.delivery.service.application.entity.FoodDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodDeliveryRepository extends JpaRepository<FoodDelivery, Integer> {
     FoodDelivery findByDeliveryId(Integer food_del_pid);

}
