import java.util.ArrayList;
public class Universidade implements teste {
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

    public void maiorSalario(){
        Funcionario aux;
        Funcionario aux2;
        for(int i = 0; i < listaFuncionario.size();i++){
            for(int j = 0; j < listaFuncionario.size(); j++){
                if(this.listaFuncionario.get(i).getSalarioMinimo() > this.listaFuncionario.get(j).getSalarioMinimo()){
                    aux = this.listaFuncionario.get(i);
                    aux2 = this.listaFuncionario.get(j);
                    this.listaFuncionario.remove(i);
                    this.listaFuncionario.add(i, aux2);
                    this.listaFuncionario.remove(j);
                    this.listaFuncionario.add(j,aux);
                }
            }
        }
    }
}
