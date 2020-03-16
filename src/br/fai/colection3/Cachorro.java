package br.fai.colection3;

public class Cachorro extends Animal{
	
	
	public Cachorro(String nome) {
	  setNome(nome);
	}
	
	public void oQueGostoDeFazer() {
		System.out.println("Gosto de morder carteiros");
	}
	
	@Override
	public void som() {
		System.out.println("Eu gosto de latir");	
	}

}
