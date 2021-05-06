package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.repositories.*;
import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.*;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;

	public List<SellerDTO> findAll() {
		List<Seller> sellers = repository.findAll();

		return sellers.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
	}
}
