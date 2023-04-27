import java.util.ArrayList;
public abstract class Pessoa {
    private String nome;
    private int matricula;
    private ArrayList<Livro> listaLivrosEmprestados;

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public int getMatricula(){return this.matricula;}
    public void setMatricula(int matricula){this.matricula = matricula;}

    public ArrayList<Livro> getLista(){return this.listaLivrosEmprestados;}

    public Pessoa(String nome,int matricula){
        this.nome = nome;
        this.matricula = matricula;
        listaLivrosEmprestados = new ArrayList<Livro>();
    }

    public abstract void pedirEmprestado(Livro livro);
    public abstract double devolverLivro(Livro livro, int diasAtrasados);
    public abstract double devolverLivro(int diasAtrasados);

   
}
