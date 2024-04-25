package com.example.omar.dto;


import lombok.Data;

public class clientDto {


    @Data
    public class ClientDto {
        private Integer id;
        private String name;
        private String age;
        private String email;
        private String gender;
    }
}