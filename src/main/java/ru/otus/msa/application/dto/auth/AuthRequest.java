package ru.abcsolutions.wfm.cpa.application.dto.auth;

import lombok.Data;

import jakarta.validation.constraints.NotNull;

@Data
public class AuthRequest {

    @NotNull
    private String username;

    @NotNull
    private String password;

}