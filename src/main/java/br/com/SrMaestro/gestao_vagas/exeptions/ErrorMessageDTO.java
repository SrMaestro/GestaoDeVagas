package br.com.SrMaestro.gestao_vagas.exeptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {
    private String message;
    private  String field;
}
