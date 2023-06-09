package com.example.cabezeras.service;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Optional;

public interface LoginService {
    abstract Optional<String> getUsername(HttpServletRequest req);
}
