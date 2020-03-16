package br.fai.colection3;

import java.util.ArrayList;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub
		Cachorro primeiroCachorro = new Cachorro ("Tiburssinho");
		Cachorro segundoCachorro = new Cachorro ("Aroldo");
		
		primeiroCachorro.setCor("Azul");
		
		List<Cachorro> listaDeCachorro = new ArrayList<Cachorro>();
		listaDeCachorro.add(primeiroCachorro);
		listaDeCachorro.add(segundoCachorro);
		
		for(Cachorro cachorro: listaDeCachorro) {
			cachorro.som();
			cachorro.dizerMeuNome();
			cachorro.oQueGostoDeFazer();
			
			System.out.println("Cor do cachorro" +cachorro.getCor());
			System.out.println("-------");
		}
		
		Gato primeiroGato = new Gato();
		primeiroGato.setNome("yury");
		
		Gato segundoGato = new Gato("vermelho");
		segundoGato.setNome("Venus");
		
		List<Gato> listaDeGato = new ArrayList<Gato>();
		listaDeGato.add(primeiroGato);
		listaDeGato.add(segundoGato);
		
		for(Gato gato: listaDeGato){
			gato.som();
			gato.dizerMeuNome();
			gato.oQueFacoDuranteANoite();
			
			System.out.println("A cor do gato: " +gato.getCor());
			System.out.println("-------");
		}
	}
}
