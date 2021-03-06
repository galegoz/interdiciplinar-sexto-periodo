package com.aisoftware.aisoftware.entidade;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Data
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private String cep;

    @Column
    private ZonedDateTime dataEntrega;

    @OneToMany(mappedBy = "entrega")
    private List<Compra> compra;
}
