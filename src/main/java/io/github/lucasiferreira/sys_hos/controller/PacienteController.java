package io.github.lucasiferreira.sys_hos.controller;

import io.github.lucasiferreira.sys_hos.model.Paciente;
import io.github.lucasiferreira.sys_hos.model.dto.PacienteDTO;
import io.github.lucasiferreira.sys_hos.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("pacientes")
public class PacienteController {

    private final PacienteService service;


    @GetMapping("{id}")
    public ResponseEntity<PacienteDTO> retornarPorId(@PathVariable("id") Long id) {
        Optional<Paciente> pacienteOptional = service.retornarPorId(id);

        if (pacienteOptional.isPresent()) {

            Paciente paciente = pacienteOptional.get();
            PacienteDTO dto = new PacienteDTO(paciente.getId(), paciente.getNome(), paciente.getEspecialista());

            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}
