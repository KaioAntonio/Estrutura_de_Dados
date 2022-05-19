package entities;

public class Aluno {
    private String nome;


    public Aluno(){
        this.nome =" ";
    }

    public Aluno(String nome, int idade){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

	@Override
	public String toString() {
		return "[nome=" + nome + "]";
	}

    
}
