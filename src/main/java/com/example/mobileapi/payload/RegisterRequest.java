package com.example.mobileapi.payload;

import lombok.Data;

@Data

public class RegisterRequest {
    private String nama;
    private String email;
    private String password;
    private String noHp;
}