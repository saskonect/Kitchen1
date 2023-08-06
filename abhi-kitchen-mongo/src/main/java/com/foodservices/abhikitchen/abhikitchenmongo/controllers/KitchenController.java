package com.foodservices.abhikitchen.abhikitchenmongo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.foodservices.abhikitchen.abhikitchenmongo.entities.Menu;
import com.foodservices.abhikitchen.abhikitchenmongo.services.MenuService;





@RestController
@CrossOrigin("http://localhost:3000/")
public class KitchenController {
	@Autowired
	MenuService service;

	@RequestMapping(value = "/Menu/", method = RequestMethod.GET)
	public List<Menu> getAllMenus() {
		return service.getAllMenus();
	}

	@RequestMapping(value = "/Menu/{id}", method = RequestMethod.GET)
	public Menu getMenuById(@PathVariable("id") String menuId) {
		return service.getMenuById(menuId).get();
	}
}
