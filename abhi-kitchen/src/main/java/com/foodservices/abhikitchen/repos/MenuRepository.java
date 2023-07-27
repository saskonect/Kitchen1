package com.foodservices.abhikitchen.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodservices.abhikitchen.entities.Menu;

public interface  MenuRepository extends JpaRepository<Menu, Integer> {

}
