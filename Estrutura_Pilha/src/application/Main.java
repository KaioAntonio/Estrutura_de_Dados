package application;

import entities.Aluno;
import entities.Pilha;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Anderson", 42);
		Aluno a2 = new Aluno("Ana", 31);
		Aluno a3 = new Aluno("José", 23);
		Aluno a4 = new Aluno("Kaio", 23);

	    Pilha<Aluno> pilha = new Pilha<Aluno>();
	    
	   
	    pilha.Push(a3);
        pilha.Push(a1);
        pilha.Push(a4);
        pilha.Push(a2);

        System.out.println("Total de pessoas na Pilha: " + pilha.Tamanho());
        
        a1 = pilha.Top();
        
        a1 = (Aluno) pilha.Recupera(0);
        a2 = (Aluno) pilha.Recupera(1);
        a3 = (Aluno) pilha.Recupera(2);
        a4 = (Aluno) pilha.Recupera(3);
        
        System.out.println("------------------------");
        System.out.println("Topo da pilha: ");
        System.out.println(a1.getNome());

        System.out.println("------------------------");
        System.out.println("Pilha do banco: \n");
        System.out.println(a1.getNome() + " - " + a1.getIdade()); 
        System.out.println(a2.getNome() + " - " + a2.getIdade()); 
        System.out.println(a3.getNome() + " - " + a3.getIdade());     
        System.out.println(a4.getNome() + " - " + a4.getIdade());   
        
        pilha.Pull(a4);
        a1 = pilha.Top();
        System.out.println("------------------------");
        System.out.println("Alterando o topo da pilha: ");
        System.out.println(a1.getNome());

        System.out.println("------------------------");
        System.out.println("Pilha do banco: \n");
        System.out.println(a1.getNome() + " - " + a1.getIdade()); 
        System.out.println(a2.getNome() + " - " + a2.getIdade()); 
        System.out.println(a3.getNome() + " - " + a3.getIdade());     
        System.out.println(a4.getNome() + " - " + a4.getIdade());   
        
        pilha.Pop();
  
        a1 = (Aluno) pilha.Recupera(0);
        a2 = (Aluno) pilha.Recupera(1);
        a3 = (Aluno) pilha.Recupera(2);
        a4 = (Aluno) pilha.Recupera(3);
        
        System.out.println("------------------------");
        System.out.println("Pilha do banco com o primeiro saindo: \n");
        System.out.println(a1.getNome() + " - " + a1.getIdade()); 
        System.out.println(a2.getNome() + " - " + a2.getIdade()); 
        System.out.println(a3.getNome() + " - " + a3.getIdade());     
      

	}

}
