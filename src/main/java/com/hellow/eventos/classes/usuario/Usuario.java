package com.hellow.eventos.classes.usuario;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;

import java.util.Date;

public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id_usuario;

    private String nome;

    private String sobrenome;

    private String login;

    private String senha;

    private Date dt_nascimento;

    private Date dt_criacao;

    private Date dt_filiacao;

    private String email;

    private String telefone;

    private String cpf;

    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo;



}
