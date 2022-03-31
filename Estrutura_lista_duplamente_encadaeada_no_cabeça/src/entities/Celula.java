package entities;

public class Celula {
	
	
    private Celula proximo;
    private Celula anterior;
    private Object elemento;
    private Celula cabeca;


    public Celula() {
    }

    public Celula(Object elemento) {
        this.elemento = elemento;
    }
    
    public Celula(Celula cabeca) {
        this.cabeca = cabeca;
    }

    public Celula(Celula proximo, Object elemento, Celula anterior, Celula cabeca) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.elemento = elemento;
        this.cabeca = cabeca;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Celula getCabeca() {
		return cabeca;
	}

	public void setCabeca(Celula cabeca) {
		this.cabeca = cabeca;
	}


    
    
}
