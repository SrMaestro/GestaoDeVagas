package br.com.SrMaestro.gestao_vagas.modules.Enditys;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEndity {

    private UUID id;
    private String name ;
    @Pattern(regexp = "^(?!\\s*$.+)" , message = "O campo [username] nao deve conter espacos")
    private String username;
    @Email(message = "O campo deve conter um email valido")
    private String email;
    @Length(min = 10, max = 100)
    private String password;
    private String description;
    private String curriculo;
}
