import java.util.ArrayList;
public class SetorPessoal {
    private ArrayList<Funcionario> listaFuncionario;

    public SetorPessoal(){
        listaFuncionario = new ArrayList<Funcionario>();

    }

    public void adicionarFuncionario(Funcionario pessoa){
        this.listaFuncionario.add(pessoa);
    }

    public void folhaDePagamento(){
        double valorFinal = 0;
        for(Funcionario pessoa: this.listaFuncionario){
            System.out.println(pessoa);
            valorFinal += pessoa.getSalario();
        }
        System.out.println("\nValor final: " + valorFinal);
    }

    public void maiorSalario(){
        double maior = this.listaFuncionario.get(0).getSalario();
        Funcionario aux = listaFuncionario.get(0);
        for(Funcionario pessoa: this.listaFuncionario){
            if(pessoa.getSalario() > maior){
                maior = pessoa.getSalario();
                aux = pessoa;
            }
        }
        System.out.println("\nMaior salario:\n" + aux);
    }
}
