package application;


import entities.Aluno;
import entities.ListaDuplamenteEncadeadaNoCabeca;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Anderson", 42);
		Aluno a2 = new Aluno("Ana", 31);
		Aluno a3 = new Aluno("José", 23);
		Aluno a4 = new Aluno("Kaio", 23);
	
	    ListaDuplamenteEncadeadaNoCabeca lista = new ListaDuplamenteEncadeadaNoCabeca();
	    
	    // Teste dos metodos de Adicionar
	   
	    
	    lista.adicionaInicio(a2);
	    lista.adicionaInicio(a1);
	    lista.adicionaInicio(a3);
	    
	   
        
       
        
        a1 = (Aluno) lista.Recupera(0);
        a2 = (Aluno) lista.Recupera(1);
        a3 = (Aluno) lista.Recupera(2);
        
        System.out.println("Adicionados");
        System.out.println("----------------------------------");
        System.out.println("0°: " + a1.getNome() + " - " + a1.getIdade());  
        System.out.println("1°: " + a2.getNome() + " - " + a2.getIdade());  
        System.out.println("2°: " + a3.getNome() + " - " + a3.getIdade()); 
        
        System.out.println("----------------------------------");
        
        //Teste dos metodos de Remover
        
       
        
        System.out.println("Removidos");
        System.out.println("----------------------------------");
        
        
        System.out.println("Tamanho: "+lista.Tamanho());
        
        System.out.println("Limpando a lista ...");
        lista.limpa();
        
        System.out.println("Tamanho: "+lista.Tamanho());
       
        System.out.println("----------------------------------");

	}

}
