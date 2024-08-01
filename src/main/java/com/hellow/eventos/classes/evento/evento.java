package com.hellow.eventos.classes.evento;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name="evento")
@Table(name="evento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class evento {

    private Integer id;
    private String nome;
    private Date data;
    private String descricao;
    private Integer lotacao;
    @ManyToOne
    @JoinColumn(name="id_endereco")
    private Endereco endereco;
    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo;






}
