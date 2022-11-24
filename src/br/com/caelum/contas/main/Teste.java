package br.com.caelum.contas.main;

import java.io.FileNotFoundException;

public class Teste {

	public static void main(String[] args) {

		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (java.io.FileNotFoundException e) {
			System.out.println("Nao foi possivel abrir o arquivo para leitura");
			e.printStackTrace();
		}

	}
	/*
	 * public static void main(String[] args) throws FileNotFoundException { /* try
	 * { new java.io.FileInputStream("arquivo.txt"); } catch
	 * (java.io.FileNotFoundException e) {
	 * System.out.println("Nao foi possivel abrir o arquivo para leitura"); }
	 */

	// new java.io.FileInputStream("arquivo.txt");

//	}

}
