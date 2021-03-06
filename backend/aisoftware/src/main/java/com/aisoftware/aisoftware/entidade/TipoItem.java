package com.aisoftware.aisoftware.entidade;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class TipoItem {
    public enum Valores {
        PROCESSADOR(1, "PROCESSADOR"),
        MEMORIA_RAM(2, "MEMORIA_RAM"),
        SSD(3, "SSD"),
        HD(4, "HD"),
        PLACA_MAE(5, "PLACA_MAE");

        private long id;
        private String nome;

        Valores(int id, String nome) {
            this.nome = nome;
            this.id = id;
        }

        public long obtemId() {
            return this.id;
        }
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

}
