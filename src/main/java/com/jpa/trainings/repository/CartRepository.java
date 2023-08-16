package com.jpa.trainings.repository;

import com.jpa.trainings.oneToManyBiModel.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long>{
}
