package com.example.cabezeras.service.impl;

import com.example.cabezeras.model.Producto;
import com.example.cabezeras.service.ProductoService;

import java.util.Arrays;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "notebook", "computacion",
                        175000.0),

                new Producto(2L, "mesa escritorio", "oficina", 100000.0),
                new Producto(3L, "teclado mecanico", "computacion", 40000.0));

    }
}
