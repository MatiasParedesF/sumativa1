package com.everis.data.services;

import org.springframework.stereotype.Service;

import com.everis.data.repositories.ProductoRepository;

@Service
public class ProductoService {
	
	private final ProductoRepository productoRepository;
	
	public ProductoService(ProductoRepository productoRepository){
		this.productoRepository=productoRepository;
	}
}
