package io.github.lucasiferreira.sys_hos.model.dto;

import io.github.lucasiferreira.sys_hos.model.Paciente;
import io.github.lucasiferreira.sys_hos.model.enums.Especialista;

public record PacienteDTO(
        Long id,
        String nome,
        Especialista especialista
) {

    public Paciente mapearParaPaciente(){
        Paciente paciente = new Paciente();
        paciente.setId(this.id);
        paciente.setNome(this.nome);
        paciente.setEspecialista(this.especialista);
        return paciente;
    }
}
