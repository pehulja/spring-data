package com.aci.pilot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aci.pilot.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {
	 
}