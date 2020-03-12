package br.fai.colection3;

public abstract class Animal {
	
	
	public void som() {
	System.out.println("Este é som padrão de um animal: zzzz");	
	}
	
	public void dizerMeuNome() {
		System.out.println("O nome do animal: xxx");
		
	}
	
	private void dizerMinhaIdade() {
		System.out.println("mainha idade é:");
	}
	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	private int idade = 5;
	private String nome = "não definido";
	private String cor = "preto";

}
