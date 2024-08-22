package com.hellow.eventos.classes.ingresso;

import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="ingresso")

@Entity(name="ingresso")
@Table(name="ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingresso {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id_ingresso;

    private Float valor_base;

    private Boolean meia;

    private Boolean social;

    private Float valor_pago;

    private Boolean pago;

    private Boolean vip;


    @ManyToOne
    @JoinColumn(name="tipo_id")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name="evento_id")
    private Evento evento;




}
