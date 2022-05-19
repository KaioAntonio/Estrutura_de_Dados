package application;

import entities.Aluno;
import entities.Desque;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Anderson", 42);
		Aluno a2 = new Aluno("Ana", 31);
		Aluno a3 = new Aluno("José", 23);
		Aluno a4 = new Aluno("Leonardo", 23);
		Aluno inicio = new Aluno();
		Aluno fim = new Aluno();
		Aluno alterado = new Aluno("Kaio de capela", 30);

	    Desque deque = new Desque();
	   
        deque.InserirNoInicio(a1);
        deque.InserirNoFim(a2);
        deque.InserirNoInicio(a3);
        deque.InserirNoFim(a4);
        
        System.out.println("Tamanho do Deck: " + deque.Tamanho());
        
        System.out.println("\nPrimeira Inserção:");
        
        a1 = (Aluno) deque.Recupera(0);
        a2 = (Aluno) deque.Recupera(1);
        a3 = (Aluno) deque.Recupera(2);
        a4 = (Aluno) deque.Recupera(3);
        
        inicio = (Aluno) deque.RecuperarInicio();
        fim = (Aluno) deque.RecuperarFim();
       
        System.out.println("Primeiro: " +  inicio.getNome());
        System.out.println("Ultimo: " +  fim.getNome());
        
        deque.AlterarInicio(alterado);
        System.out.println("\nAlteração do Inicio:");
        a1 = (Aluno) deque.Recupera(0);
        a2 = (Aluno) deque.Recupera(1);
        a3 = (Aluno) deque.Recupera(2);
        a4 = (Aluno) deque.Recupera(3);
        
        deque.AlterarFim(alterado);
        System.out.println("\nAlteração Do último:");
        a1 = (Aluno) deque.Recupera(0);
        a2 = (Aluno) deque.Recupera(1);
        a3 = (Aluno) deque.Recupera(2);
        a4 = (Aluno) deque.Recupera(3);
        
        
       

	}

}
