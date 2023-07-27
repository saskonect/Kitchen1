package com.foodservices.abhikitchen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodservices.abhikitchen.entities.Menu;
import com.foodservices.abhikitchen.repos.MenuRepository;

@Component
public class MenuService {

	@Autowired
	MenuRepository menuRepository;
	
	public List<Menu> getAllMenus(){		
		return menuRepository.findAll();
		
	}
	
	public Menu getMenuById(int menuId) {
		return menuRepository.findById(menuId).get();
	}
}
