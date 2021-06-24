package com.amran.dynamic.multitenant.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ByCryptUtils {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode(""));
    }
}
