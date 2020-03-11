package br.fai.collections02;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	private Map<String, String> mapa = new HashMap<String, String>();
	//private Map<String, String> mapa = null;

	private void start() {
		adicionarItensNoMapa();
		exibirValorDoMapaPelaChave("SRS");
		exibirValorDoMapaPelaChave("Valor Q nao existe");
		interarMapa();
		
	}
	
	private void adicionarItensNoMapa() {
		
		try {
			mapa.put("SRS", "Santa Rita do Sapucaí");
			mapa.put("PA", "Pouso Alegre");
			mapa.put("ITA", "Itajuba");
			mapa.put("ZORO", "Conçeicao dos Ouros");
			mapa.put("CAXU", "Cachoeira de Minas");
			
			System.out.println("cheguei no fim to try");
		} catch (Exception e) {
			System.out.println("ocorreu uma exceção");
		} finally {
			System.out.println("Cheguei no finally");
		}
		
		
	}

	private void exibirValorDoMapaPelaChave(String chave) {
		
		String valorDoItemDoMapa = mapa.get(chave);
		if(valorDoItemDoMapa == null || valorDoItemDoMapa.isEmpty()) {
			System.out.println("Esta chave nao " + "esta presente no mapa:" + chave);
		}else {
		System.out.println("O valor essa chave e:" + mapa.get(chave));
		}
		
	}
	
	private void interarMapa() {
		
		System.out.println("----------");
		
		for(String chave: mapa.keySet()) {
			System.out.println("Chave:" + chave + "|Valor:" + mapa.get(chave));
		}
	}
}
