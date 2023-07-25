package menu;

import java.time.LocalDate;

public class Manifestacao {
	// Variaveis
	
	private String nome;
	private String descricao;
	private LocalDate dataDeCriacao = LocalDate.now();
	private int protocolo;
	private Categoria categoria;
	
	

	// Atributos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(LocalDate dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public int getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(int protocolo) {
		this.protocolo = protocolo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Manifestacao [nome=" + nome + ", descricao=" + descricao + ", dataDeCriacao=" + dataDeCriacao
				+ ", protocolo=" + protocolo + ", categoria=" + categoria + "]";
	}


}