package entities;

public class Pilha<T> {

    private Celula inicio, fim;
    private int tamanho;

    public Pilha() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public Pilha(T elemento){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    
    }

    
    public void Push(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            inicio = fim = nova;
            this.tamanho += 1;
        } else {
            nova.setProximo(inicio);
            inicio = nova;
            this.tamanho += 1;
        }
    }
    
    public T Top() {
    	return (T) inicio.getElemento();
    }

	public T Recupera(int posicao) {
	        
	        if (this.tamanho == 0) {
	            
	            System.out.println("A lista está vazia!!");
	            return null;
	            
	        } else if (posicao < 0 || posicao >= this.tamanho) {
	            
	            System.out.println("A Posição " + posicao + " é invalida!");
	            return null;
	            
	        } else {
	            
	            Iterador it = new Iterador(this.inicio);
	            int i = 0;
	            while (it.hasNext()) {
	                if (i != posicao) {
	                    it.next();
	                    i++;
	                } else {
	                    break;
	                }
	            }
	            
	            return (T) it.getAtual().getElemento();
	        }
	    }

    public void Pop() {
        
    	 if  (isEmpty() == true) {
             System.out.println("A Fila está vazia!!");
             
             
         } else if (inicio == fim) {
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {
            inicio = inicio.getProximo();
            this.tamanho -= 1;
        }
    }
   
    
    public boolean isEmpty() {
    	if(tamanho == 0) {
    		return true;	
    	}
    	else {
    		return false;
    	}
    	
    }
    
    public int Tamanho() {
    	return tamanho;
    }
    
    public boolean existeDado(T elemento){
        if (isEmpty() == true) {
            throw new ArrayIndexOutOfBoundsException("Não existe dados na fila");
        } else {
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                Celula celula = it.getAtual();
                if (celula.getElemento() != elemento) {
                    it.next();
                    i++;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
    
    public void Pull(T elemento) {
    	Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            System.out.println("lista vazia!");
        }
        else {
        	nova.setProximo(inicio);
        	inicio = nova;
        }
    }
    
    public void limpa() {
    	tamanho = 0;
    }
    
    private boolean existePosicao(int posicao){
        return posicao >= 0 && posicao < this.tamanho;
    }
    
}
