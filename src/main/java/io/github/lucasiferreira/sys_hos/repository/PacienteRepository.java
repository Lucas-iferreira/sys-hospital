package io.github.lucasiferreira.sys_hos.repository;

import io.github.lucasiferreira.sys_hos.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
