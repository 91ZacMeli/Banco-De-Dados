package br.com.meli.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Anuncio {

    @Id
    private String codigo;
    private String titulo;
    private String vendedorCodigo;
    private BigDecimal preco;
    private LocalDate dataDoAnuncio;
    private Integer numeroDeVendas;

}
