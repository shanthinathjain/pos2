package com.cruds.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.service.StoreBeanService;

@Controller 
public class StoreBeanController {

	@Autowired
	private StoreBeanService storeBeanService;

	@RequestMapping(value="store.html", method= RequestMethod.GET)
	public String showStorePage(Model model){
		
	//storeBeanService.addStore(new StoreBean( 2, "Hassan", "9481684710", "shanthinath", "573201", "Karnataka", "BH Road"));
	model.addAttribute("command", new StoreBean());
	model.addAttribute("STORELIST", storeBeanService.viewAllStore());
	return "store";		
	}	
	
	@RequestMapping(value="store.html", method=RequestMethod.POST)
	public String dostore(@ModelAttribute("StoreBean") StoreBean s)
	{
		storeBeanService.addStore(s);
		//System.out.println(s);
		return "redirect:store.html";
	}
	
		
	/*@RequestMapping(value = "/store-del-{id}", method= RequestMethod.GET)
	public String DeleteStore(@PathVariable("id") Long id)
	{
		storeBeanService.removeStore(id);
		return "redirect:store.html";
	}*/
	
	@RequestMapping(value = "/store-edit-{storeId}", method= RequestMethod.GET)
	public String EditStore(@PathVariable("storeId") String storeId, Model model)
	{
		model.addAttribute("command", storeBeanService.edit(storeId));
				return "modifyStore";
	}
	
	@RequestMapping(value="modifyStore.html", method=RequestMethod.POST)
	public String updateStore(@ModelAttribute("storeBean") StoreBean s) throws POSException 
	{	
		System.out.println("Hi......");
		storeBeanService.modifyStore(s);
		return "redirect:store.html"; 
	}
	
	@RequestMapping(value= "/store-search-{storeId}", method= RequestMethod.GET)
	public String Search(@PathVariable("storeId") String storeId, Model model)
	{
		System.out.println(storeId);
		model.addAttribute("command", storeBeanService.searchStore(storeId));
		return "searchStore";
	}
	
	@RequestMapping(value="searchStore.html", method=RequestMethod.POST)
	public String viewStore(@ModelAttribute("storeBean") StoreBean storeBean) 
	{	
		storeBeanService.viewStore(storeBean);
		return "view.html";
	}
	
}
