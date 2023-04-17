package com.example.cabezeras.model;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Producto {
    private long id;
    private String nombre;
    private String tipo;
    private Double precio;

}
