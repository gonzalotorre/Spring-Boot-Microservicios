package com.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.productos.models.entity.Producto;
import com.springboot.app.productos.models.repository.ProductosRepository;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private ProductosRepository productosRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productosRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productosRepository.findById(id).orElse(null);
	}

}
