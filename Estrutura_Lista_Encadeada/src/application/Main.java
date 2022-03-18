package application;

import entities.Aluno;
import entities.ListaSimples;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Anderson", 42);
		Aluno a2 = new Aluno("Ana", 31);
		Aluno a3 = new Aluno("José", 23);
		Aluno a4 = new Aluno("Kaio", 23);

	    ListaSimples lista = new ListaSimples();
	    
	   
        lista.adicionaInicio(a1);
        lista.adicionaInicio(a2);
        lista.adicionaFim(a3);
        lista.adiciona(a4,0);
        
        
        System.out.println(lista.Tamanho());
        
        
        a1 = (Aluno) lista.Recupera(0);
        a2 = (Aluno) lista.Recupera(1);
        a3 = (Aluno) lista.Recupera(2);
        a4 = (Aluno) lista.Recupera(3);
       
        
        System.out.println(a1.getNome() + " - " + a1.getIdade()); 
        System.out.println(a2.getNome() + " - " + a2.getIdade()); 
        System.out.println(a3.getNome() + " - " + a3.getIdade());     
        System.out.println(a4.getNome() + " - " + a4.getIdade());   
        
        
        

	}

}
