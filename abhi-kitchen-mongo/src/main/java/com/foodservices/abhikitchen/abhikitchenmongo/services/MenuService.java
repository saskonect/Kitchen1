package com.foodservices.abhikitchen.abhikitchenmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.foodservices.abhikitchen.abhikitchenmongo.entities.Menu;
import com.foodservices.abhikitchen.abhikitchenmongo.repos.MenuRepository;


@Service
public class MenuService {
	
	
	  @Autowired
	  MenuRepository menuRepository; 
	  
	  public List<Menu> getAllMenus() { return menuRepository.findAll();
	  
	  }
	  
	  public Optional<Menu> getMenuById(String menuId) { return
	  menuRepository.findById(menuId);
	  
	  }
	 
}
