package com.aci.pilot.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aci.pilot.model.Shop;
import com.aci.pilot.service.ShopService;

@Component
public class Client {
	
	@Autowired
	ShopService shopService;
	
	
	public void create(){
		Shop shop = new Shop();
		shop.setName("Shop 1");
		shop.setEmplNumber(5);
		System.out.println("Before creating");
		shopService.create(shop);
		System.out.println("After creating");
	}
	
	public void read(){
		List<Shop> shops = shopService.findAll();
		for(Shop shop : shops){
			System.out.println(shop.getName());
		}
				
	}
	
	
}
