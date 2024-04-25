package org.example.mscurso.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Array;
import java.util.ArrayList;

@Entity
@Data
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    private int duracion;

}

