package com.foodservices.abhikitchen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.foodservices.abhikitchen.entities.Menu;
import com.foodservices.abhikitchen.repos.MenuRepository;
import com.foodservices.abhikitchen.services.MenuService;

@RestController
public class KitchenController {

	@Autowired
	MenuService service;

	@RequestMapping(value = "/Menu/", method = RequestMethod.GET)
	public List<Menu> getAllMenus() {
		return service.getAllMenus();
	}

	@RequestMapping(value = "/Menu/{id}", method = RequestMethod.GET)
	public Menu getMenuById(@PathVariable("id") int menuId) {
		return service.getMenuById(menuId);
	}
}
