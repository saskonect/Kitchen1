package com.foodservices.abhikitchen.abhikitchenmongo.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.foodservices.abhikitchen.abhikitchenmongo.entities.Menu;

@Repository
public interface MenuRepository extends  MongoRepository<Menu, String>{

}
