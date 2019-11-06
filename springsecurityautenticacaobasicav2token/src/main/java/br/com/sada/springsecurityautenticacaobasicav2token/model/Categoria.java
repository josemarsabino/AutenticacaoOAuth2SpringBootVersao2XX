package br.com.sada.springsecurityautenticacaobasicav2token.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long codigo;

	@NotNull(message = "O título é obrigatório")
	@Length(min = 3, max = 50, message = "Nome da Categoria deve conter  entre 3 e 50 caracteres")
	private String nome;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(Long codigo,
			@NotNull(message = "O título é obrigatório") @Length(min = 3, max = 50, message = "Nome da Categoria deve conter  entre 3 e 50 caracteres") String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	
	
}
