package br.fai.colection3;

public class Gato extends Animal{
	
	public Gato(){
		setCor("branco");
	}
	
    public Gato( String Cor) {
		setCor(Cor);
	}
    
    @Override
	public void som() {
		super.som();
		System.out.println("Eu gosto de miar");	
	}
	
	public void oQueFacoDuranteANoite() {
		System.out.println("Gosto de pular a cerca todas as noites");
	}

}
