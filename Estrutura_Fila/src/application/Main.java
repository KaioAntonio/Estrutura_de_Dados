package application;

import entities.Aluno;
import entities.Fila;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Anderson", 42);
		Aluno a2 = new Aluno("Ana", 31);
		Aluno a3 = new Aluno("José", 23);
		Aluno a4 = new Aluno("Kaio", 23);

	    Fila<Aluno> fila = new Fila<Aluno>();
	    
	   
	    fila.Inserir(a3);
        fila.Inserir(a1);
        fila.Inserir(a4);
        fila.Inserir(a2);
 
        
        
        System.out.println("Total de pessoas na fila: " + fila.Tamanho());
        
        
        a1 = (Aluno) fila.Recupera(0);
        a2 = (Aluno) fila.Recupera(1);
        a3 = (Aluno) fila.Recupera(2);
        a4 = (Aluno) fila.Recupera(3);

        System.out.println("------------------------");
        System.out.println("Fila do banco: \n");
        System.out.println(a1.getNome() + " - " + a1.getIdade()); 
        System.out.println(a2.getNome() + " - " + a2.getIdade()); 
        System.out.println(a3.getNome() + " - " + a3.getIdade());     
        System.out.println(a4.getNome() + " - " + a4.getIdade());   
        
        fila.Remover();
        
        a1 = (Aluno) fila.Recupera(0);
        a2 = (Aluno) fila.Recupera(1);
        a3 = (Aluno) fila.Recupera(2);
        a4 = (Aluno) fila.Recupera(3);
        
        System.out.println("------------------------");
        System.out.println("Fila do banco com o primeiro saindo: \n");
        System.out.println(a1.getNome() + " - " + a1.getIdade()); 
        System.out.println(a2.getNome() + " - " + a2.getIdade()); 
        System.out.println(a3.getNome() + " - " + a3.getIdade());     
       
        

	}

}
