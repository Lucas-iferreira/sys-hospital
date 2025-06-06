package io.github.lucasiferreira.sys_hos.model;

import io.github.lucasiferreira.sys_hos.model.enums.Doc;
import io.github.lucasiferreira.sys_hos.model.enums.Especialista;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    @Enumerated(EnumType.STRING)
    @Column(name = "especialidade_medica")
    private Especialista especialista;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_documento")
    private Doc doc;
}
