package application;

import entities.Aluno;
import entities.Vetor;

public class Main {

	public static void main(String[] args) {
		Vetor<Aluno> vetor = new Vetor<Aluno>(2);

		// Instanciando um aluno
		Aluno a = new Aluno("ANA", 30);
		Aluno b = new Aluno("Kaio", 20);
		Aluno c = new Aluno("Kaio", 20);
		// Adicionando o aluno no vetor
		vetor.adicionaInicio(a);
		vetor.adicionaInicio(b);
		vetor.adicionaInicio(c);
		
		
		// imprimindo os dados do aluno
		System.out.println("Nome: " + vetor.Recupera(0).getNome());
		System.out.println("Nome: " + vetor.Recupera(1).getNome());
		System.out.println("Nome: " + vetor.Recupera(2).getNome());
		vetor.limpa();
		vetor.RemoverFim();
		System.out.println(vetor.Tamanho());
	}

}
