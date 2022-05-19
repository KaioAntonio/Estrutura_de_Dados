package entities;

public class Desque<T> {

    private Celula inicio, fim;
    private int tamanho;

    public Desque() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public Desque(T elemento){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        this.InserirNoInicio(elemento);
    
    }

    public void InserirNoInicio(T elemento) {
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
    
    public void InserirNoFim(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.Tamanho() == 0) {
			this.inicio = nova;
			this.fim = nova;
		} else {
			this.fim.setProximo(nova);
			this.fim = nova;
		}
		this.tamanho ++;
	}
    
    public void AlterarInicio(T elemento) {
    	Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            System.out.println("lista vazia!");
        }
        else {     	
        
        	nova.setProximo(inicio);
        	inicio = nova;
        }
    }
    
    public void AlterarFim(T elemento) {
    	Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            System.out.println("lista vazia!");
        }
        else {
        	Celula penultima = RecuperaAtual(tamanho - 2);
        	penultima.setProximo(nova);
        	nova.setProximo(fim);
        	fim = nova;
        }
    }
    
    @SuppressWarnings("unchecked")
	public T RecuperarInicio() {
		if (this.Tamanho() == 0) {
			throw new ArrayIndexOutOfBoundsException("A fila está vazia!");
		} else {
			return (T) this.inicio.getElemento();
		}
	}
    
    @SuppressWarnings("unchecked")
   	public T RecuperarFim() {
   		if (this.Tamanho() == 0) {
   			throw new ArrayIndexOutOfBoundsException("A fila está vazia!");
   		} else {
   			return (T) this.fim.getElemento();
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
            System.out.println(it.getAtual().getElemento());
            
            return (T) it.getAtual().getElemento();
        }
    }

    public void removeInicio() {
        
    	if (this.tamanho == 0) {
            throw new ArrayIndexOutOfBoundsException("Lista vazia");
        } 
    	else if (inicio == fim) {
            inicio = fim = null;
            this.tamanho -= 1;
            
        } 
    	else {
            
            inicio = inicio.getProximo();
            this.tamanho -= 1;
        }
    }
    
    public void removeFim(){
        if (this.tamanho == 0) {
            throw new ArrayIndexOutOfBoundsException("Lista vazia");
        } 
        else {
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
    
    public void limpa() {
    	inicio = null;
    	fim = null;
    	tamanho = 0;
    }
    
    public Celula RecuperaAtual(int posicao) {
        
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
            System.out.println(it.getAtual().getElemento());
            
            return (Celula) it.getAtual();
        }
    }
}
