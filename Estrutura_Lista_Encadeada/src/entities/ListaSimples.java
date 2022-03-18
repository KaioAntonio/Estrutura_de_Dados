package entities;

public class ListaSimples<T> {

    private Celula inicio, fim;
    private int tamanho;

    public ListaSimples() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public ListaSimples(T elemento){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        this.adicionaInicio(elemento);
    
    }
    
    public void adiciona(T elemento, int posicao) {
    	Celula nova = new Celula(elemento);
    	
    	if(this.tamanho == 0 || posicao == 0) {
    		adicionaInicio(elemento);
    	} else if (posicao == tamanho) {
    		adicionaFim(elemento);
    	}
    	
    	else {
    		Celula atual = new Celula(elemento);
    		Celula antes = (Celula) Recupera(posicao - 1);
    		Celula proximo = antes.getProximo();
    		
    		antes.setProximo(nova);
    		nova.setProximo(proximo);
    		this.tamanho += 1;{
    	}
    		
    	}
    	
    }

    public void adicionaInicio(T elemento) {
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
    
    public void adicionaFim(T elemento) {
    	Celula nova = new Celula(elemento);
    	if(this.tamanho == 0) {
    		inicio = fim = nova;
    		this.tamanho += 1;
    	}
    	else {
    		nova.setProximo(fim);
    		fim = nova;
    		this.tamanho += 1;
    	}
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
    
    public void remove(int posicao){
        if (this.tamanho == 0) {
            throw new ArrayIndexOutOfBoundsException("Lista vazia");
        } else if (!existePosicao(posicao)) {
            throw new ArrayIndexOutOfBoundsException("A posição " + posicao + " é inválida!");
        } else {
            if (posicao == 0) {
                removeInicio();
            } else {

                Celula anterior = (Celula) Recupera(posicao - 1);
                Celula atual = anterior.getProximo();
                Celula proxima = atual.getProximo();
                anterior.setProximo(proxima);
                tamanho--;
            }
        }
    }

    public void removeInicio() {
        
        if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            
        } else if (inicio == fim) {
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {
            
            inicio = inicio.getProximo();
            this.tamanho -= 1;
        }
    }
    
    public void removeFim(){
        if (this.tamanho == 0) {
            throw new ArrayIndexOutOfBoundsException("Lista vazia");
        } else {
            fim = null;
            this.tamanho -= 1;
        }
    }
    
    
    
    public int Tamanho() {
    	return tamanho;
    }
    
    public boolean existeDado(T elemento){
        if (this.tamanho == 0) {
            throw new ArrayIndexOutOfBoundsException("Não existe dados na lista");
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
    
    private boolean existePosicao(int posicao){
        return posicao >= 0 && posicao < this.tamanho;
    }
    
}
