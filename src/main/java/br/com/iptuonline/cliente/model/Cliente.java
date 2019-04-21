package br.com.iptuonline.cliente.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.iptuonline.imovel.model.Imovel;

@Entity
@Table(name="Cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 4416165564982107160L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "Email")
	private String email;
	
	public Cliente() {
		
	}

	@Column(name = "Telefone")
	private String telefone;
	
	@ManyToMany
	@JoinTable(
	  name = "cliente_imovel", 
	  joinColumns = {@JoinColumn(name = "cliente_id", referencedColumnName = "id")}, 
	  inverseJoinColumns = {@JoinColumn(name = "imovel_id", referencedColumnName = "id")}
	  )
	private Set<Imovel> imoveis = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Set<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(Set<Imovel> imoveis) {
		this.imoveis = imoveis;
	}
	

	
}
