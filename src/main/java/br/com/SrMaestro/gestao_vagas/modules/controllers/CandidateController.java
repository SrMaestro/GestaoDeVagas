package br.com.SrMaestro.gestao_vagas.modules.controllers;


import br.com.SrMaestro.gestao_vagas.modules.Enditys.CandidateEndity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEndity candidateEndity){
        System.out.println("Candidate");
        System.out.println(candidateEndity.getName());




    }
}
