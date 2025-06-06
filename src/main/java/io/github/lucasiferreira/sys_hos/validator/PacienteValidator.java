package io.github.lucasiferreira.sys_hos.validator;

import io.github.lucasiferreira.sys_hos.model.Paciente;
import io.github.lucasiferreira.sys_hos.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PacienteValidator {

    private final PacienteRepository repository;

    public void validar(Paciente paciente){
    }

}
