package com.cruds.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.service.FoodBeanService;

@Controller
public class FoodBeanController {

	@Autowired
	private FoodBeanService foodBeanService;
	
	@RequestMapping(value="food.html", method= RequestMethod.GET)
	public String showFoodPage(Model model){
		
		//foodBeanService.addfood(new foodBean( 2, "Hassan", "9481684710", "shanthinath", "573201", "Karnataka", "BH Road"));
	model.addAttribute("command", new FoodBean());
	model.addAttribute("FOODLIST", foodBeanService.viewAllFood());
		return "food";		
	}
	
	@RequestMapping(value="food.html", method=RequestMethod.POST)
	public String dofood(@ModelAttribute("FoodBean") FoodBean f)
	{
		foodBeanService.addFood(f);
		//System.out.println(s);
		return "redirect:food.html";
	}

	/*@RequestMapping(value = "/food-del-{id}", method= RequestMethod.GET)
	public String DeleteFood(@PathVariable("id") String foodId, String storeId)
	{
		foodBeanService.removeFood(storeId, foodId);
		return "redirect:food.html";
	}*/
	
	@RequestMapping(value = "/food-edit-{foodId}", method= RequestMethod.GET)
	public String EditFood(@PathVariable("foodId") String foodId, Model model)
	{
		model.addAttribute("command", foodBeanService.edit(foodId));
				return "modifyFood";
	}
	
	@RequestMapping(value="modifyFood.html", method=RequestMethod.POST)
	public String updateFood(@ModelAttribute("foodBean") FoodBean f) throws POSException 
	{	
		foodBeanService.modifyFood(f);
		return "redirect:food.html";
	}
	
	/*@RequestMapping(value = "/store-search-{storeId}", method= RequestMethod.GET)
	public String EditStore(@PathVariable("storeId") String storeId, Model model)
	{
		model.addAttribute("command", storeBeanService.edit(storeId));
				return "modifyStore";
	}
	
	@RequestMapping(value="modifyStore.html", method=RequestMethod.POST)
	public String updateStore(@ModelAttribute("storeBean") StoreBean s) throws POSException 
	{	
		storeBeanService.modifyStore(s);
		return "redirect:store.html";
	}*/
	
	
}
