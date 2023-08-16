package com.jpa.trainings.repository;

import com.jpa.trainings.oneToManyBiModel.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
