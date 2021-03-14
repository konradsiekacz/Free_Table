package com.freetable.freetable.repository;

import com.freetable.freetable.model.Restaurant;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
}
