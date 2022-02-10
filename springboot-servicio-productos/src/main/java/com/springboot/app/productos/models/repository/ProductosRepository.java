package com.springboot.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.productos.models.entity.Producto;

public interface ProductosRepository extends CrudRepository<Producto, Long> {

}
