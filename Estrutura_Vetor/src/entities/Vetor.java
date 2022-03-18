package entities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor<T>{
	
	private T[] vetor;
	private int  qntElementos = 0;
	
	public Vetor() {
		
	}
	
	public Vetor(int tam) {
		vetor = (T[]) new Object[tam];
		this.qntElementos = tam;
	}
	
	public void adiciona(T elemento, int posicao) throws ArrayIndexOutOfBoundsException {
		redimensionar();
		
		vetor[posicao] = null;
		vetor[posicao] = (T) elemento;
		qntElementos ++;
	}
	
	public void adicionaInicio(T elemento) {
		redimensionar();
		
		for(int i = Tamanho(); i >= 0; i --) {
			vetor[i+1] = vetor[i];
		}
		vetor[0] = elemento;
		qntElementos ++;
	}
	
	public void adicionaFim(T elemento) {
		if (Tamanho() == vetor.length) {
			
			redimensionar();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == null) {
				vetor[i] = (T) elemento;
				
				qntElementos++;
				break;
			}
		}
	}
	
	public boolean vazio() {
		return Tamanho() == 0;
	}
	
	public boolean existeDado(T elemento) {
		for (int i = 0; i < vetor.length; i++ ) {
			if(elemento.equals(vetor[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int Tamanho() {
		return qntElementos;
	}
	
	private void redimensionar() {
		if (this.qntElementos == vetor.length) {
			T[] novoVetor = (T[]) new Object[vetor.length * 2];
			for(int i = 0; i < this.vetor.length; i++ ) {
				novoVetor[i] = this.vetor[i];
			}
			this.vetor = novoVetor;
		}
	}
	
	public void Remove(T elemento) {
		if(existeDado(elemento) == false) {
			System.out.println("Elemento não existe");
			
		}
		
		for (int i = 0; i < vetor.length; i ++) {
			if (vetor[i].equals(elemento)) {
				vetor[i] = null;
				break;
			}
		}
	}
	
	public void RemoveInicio() {
		if(vazio()) {
			System.out.println("Vetor está vazio!");
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				vetor[i] = null;
				break;
			}
			qntElementos --;
		}
	}
	
	public void RemoverFim() {
	    if (vazio()) {
	        System.out.println("Vetor vazio!");
	    }
	    for (int i = 0; i < vetor.length; i++) {
	        if (vetor[i] == null) {
	            vetor[i - 1] = null;
	        }
	        qntElementos--;
	        break;
	    }
	    vetor[Tamanho()] = null;
	}
	
	public void limpa() {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				vetor[i] = null;
				qntElementos --;
			}
		}
		
	}
	
	
	public T Recupera(int pos) {
		if(existePosicao(pos) ) {
			throw new IllegalArgumentException("Posição não existe");

		}
		return  (T) vetor[pos];
	}
	
	private boolean existePosicao(int posicao){
        return posicao >= 0 && posicao < this.qntElementos;
    }
}
