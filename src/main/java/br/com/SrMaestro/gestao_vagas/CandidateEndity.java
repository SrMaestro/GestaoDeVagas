package br.com.SrMaestro.gestao_vagas;

import lombok.Data;

import java.util.UUID;

@Data
public class CandidateEndity {

    private UUID id;
    private String name ;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculo;
}
