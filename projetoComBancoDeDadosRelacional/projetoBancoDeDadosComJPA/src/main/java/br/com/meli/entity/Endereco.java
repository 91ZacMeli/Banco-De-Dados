package br.com.meli.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Vendedor vendedor;
	private String cep;
	private String logradouro;
	private String complemento;
	private int numero;
	private String uf;
	private String cidade;


	public Endereco(String cep, String logradouro, String complemento, int numero, String uf, String cidade, Vendedor vendedor) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.uf = uf;
		this.cidade = cidade;
		this.vendedor = vendedor;
	}
}
