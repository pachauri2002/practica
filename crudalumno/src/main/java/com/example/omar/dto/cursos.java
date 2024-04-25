package com.example.omar.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class cursos {

    private Long id;

    private String nombre;

    private String descripcion;

    private int duracion;
}
