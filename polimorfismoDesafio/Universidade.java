import java.util.ArrayList;
public class Universidade {
    private String nome;
    private ArrayList<Funcionario> listaFuncionario;

    public String getNome(){
        return this.nome;
    }
    public ArrayList<Funcionario> getLista(){
        return this.listaFuncionario;
    }

    public Universidade(String nome){
        this.nome =  nome;
        listaFuncionario = new ArrayList<Funcionario>();
    }
}
