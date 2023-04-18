package com.example.cabezeras.service;

import com.example.cabezeras.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listar();
    Boolean validateExistence(Long id);
}
