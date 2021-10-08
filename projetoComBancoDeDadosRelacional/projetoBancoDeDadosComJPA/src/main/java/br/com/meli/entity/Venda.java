package br.com.meli.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //estamos informando ao RDBMS que o id será gerado automaticamente
	private Long id;
	private LocalDate data;
	private BigDecimal valorTotal;
	@Enumerated(EnumType.STRING)
	private FormaPagamento formaPagamento; //a vista ou a prazo
	@ManyToOne
	private Vendedor vendedor;

	public Venda(LocalDate data, BigDecimal valorTotal, FormaPagamento formaPagamento) {
		this.data = data;
		this.valorTotal = valorTotal;
		this.formaPagamento = formaPagamento;
	}
}
