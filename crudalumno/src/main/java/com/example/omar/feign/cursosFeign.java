package com.example.omar.feign;

import feign.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient (name ="ms-client-service",path = "/cursos")
public interface cursosFeign {
    @GetMapping("/{id}")
    public ResponseEntity<cursosFeign> listarById(@PathVariable(required = true) Integer id);
}
