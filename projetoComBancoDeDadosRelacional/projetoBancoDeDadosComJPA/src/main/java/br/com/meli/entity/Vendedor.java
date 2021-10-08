package br.com.meli.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@ToString
public class Vendedor {

	@Id
	private String codigo;
	private String cpf;
	private String nome;

	@OneToMany(mappedBy = "vendedor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Endereco> enderecos;

	public Vendedor(String codigo, String cpf, String nome) {
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
	}
}
