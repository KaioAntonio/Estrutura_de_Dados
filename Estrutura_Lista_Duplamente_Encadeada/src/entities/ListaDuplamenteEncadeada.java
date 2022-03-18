package entities;

public class ListaDuplamenteEncadeada<T> {

	private Celula inicio, fim;
	private int tamanho;

	public ListaDuplamenteEncadeada() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
	}

	public ListaDuplamenteEncadeada(T elemento) {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
		this.adicionaInicio(elemento);

	}

	public void adiciona(T elemento, int posicao) {
		
		if(posicao == 0) {
			adicionaInicio(elemento);

		}
		else if (posicao == Tamanho()) {
			adicionaFim(elemento);
			
		}
		else {
			if (existeDado(elemento)) {
				System.out.println("Já existe dado na posição!");
			}
			else {
				if ((posicao  < 0 || posicao > this.tamanho)) {
					System.out.println("Posição inválida!");
				}
				else {
					Celula anterior = (Celula) recuperaDuplamente(posicao - 1);
					Celula proxima = (Celula) recuperaDuplamente(posicao);
					Celula nova = new Celula(proxima,elemento, anterior);
					anterior.setProximo(nova);
					proxima.setAnterior(nova);
					this.tamanho +=1;
				}
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
			nova.setAnterior(null);
			nova.setAnterior(inicio.getAnterior());
			inicio.setAnterior(nova);
			inicio = nova;
			this.tamanho += 1;
		}
	}

	public void adicionaFim(T elemento) {
		Celula nova = new Celula(elemento);
		if (this.tamanho == 0) {
			inicio = fim = nova;
			this.tamanho++;
		} else {
			nova.setAnterior(fim);
			fim.setProximo(nova);
			nova.setProximo(null);
			fim = nova;
			this.tamanho++;
		}
	}

	public boolean existeDado(T elemento) {
		if(this.tamanho == 0) {
    		System.out.println("Lista Vazia!");
    	}
    	else {
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
           
        }
		return false;
    }
	
	public T Recupera(int posicao) {

		if (this.tamanho == 0) {

			System.out.println("A lista está vazia!");
			return null;

		} else if (posicao < 0 || posicao >= this.tamanho) {
			System.out.println("A Posição " + posicao + " é Invalida");
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
	
	public Celula recuperaDuplamente(int posicao) {
		if ((posicao  < 0 || posicao > this.tamanho)) {
			System.out.println("Posição inválida!");
		}
		else {
			Iterador<Object> iterador = new Iterador<Object>(this.inicio);
			int indice = 0;
			while (iterador.hasNext()) {
				if (indice != posicao) {
					iterador.next();
					indice ++;
				} else {
					break;
				}
			}
			return (Celula) iterador.getAtual();
		}
		return fim;
		
	}
	
	public void remove(T elemento, int posicao) {
		if (this.tamanho == 0) {
			System.out.println("A lista está vazia");
		}

		else if (posicao == tamanho) {
			removeFim();
		} else if (posicao == 0 || tamanho == 0) {
			removeInicio();
		} else {
				if ((posicao  < 0 || posicao > this.tamanho)) {
					System.out.println("Posição inválida!");
				}
				else {
					Celula anterior = (Celula) recuperaDuplamente(posicao - 1);
					Celula proxima = (Celula) recuperaDuplamente(posicao + 1);
					anterior.setProximo(proxima);
					proxima.setAnterior(anterior);
					this.tamanho -= 1;
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
			System.out.println("A lista está vazia! ");
		} else if (inicio == fim) {
			inicio = fim = null;
			this.tamanho -= 1;
		} else {
			fim.getAnterior();
			fim.setProximo(null);
			
			this.tamanho -= 1;
		}
	}

	
	public int Tamanho() {
		return tamanho;
	}



	public void limpa() {
		inicio = fim = null;
		tamanho = 0;

	}

}
