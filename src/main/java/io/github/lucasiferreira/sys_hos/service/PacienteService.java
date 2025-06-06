package io.github.lucasiferreira.sys_hos.service;

import io.github.lucasiferreira.sys_hos.model.Paciente;
import io.github.lucasiferreira.sys_hos.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository repository;

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    public Optional<Paciente> retornarPorId(Long id){
        return repository.findById(id);
    }
}
