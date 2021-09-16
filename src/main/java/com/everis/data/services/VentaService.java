package com.everis.data.services;

import org.springframework.stereotype.Service;

import com.everis.data.repositories.VentaRepository;

@Service
public class VentaService {

	private final VentaRepository ventaRepository;
	
	public VentaService(VentaRepository ventaRepository) {
		this.ventaRepository=ventaRepository;
	}
}
