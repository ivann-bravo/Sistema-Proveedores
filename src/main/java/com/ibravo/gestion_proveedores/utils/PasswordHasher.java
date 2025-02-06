package com.ibravo.gestion_proveedores.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashedPassword = encoder.encode("1234");
        System.out.println("Hashed Password: " + hashedPassword);
    }
}