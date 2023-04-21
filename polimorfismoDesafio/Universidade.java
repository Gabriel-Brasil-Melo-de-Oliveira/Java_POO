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

    public void adicionarFuncionario(Funcionario pessoa){
        this.listaFuncionario.add(pessoa);
    }

    public void folhaDePagamento(){
        double valorFinal = 0;
        System.out.println("\nUniverdade: " + this.nome + "\n\n\n\n\n");
        for(Funcionario pessoa: listaFuncionario){
            System.out.println(pessoa);
            valorFinal += pessoa.getSalarioMinimo();
        }
        System.out.println("\nVALOR FINAL PAGO: " + valorFinal);
    }
}
