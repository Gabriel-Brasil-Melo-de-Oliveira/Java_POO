import java.util.ArrayList;

public class DepartamentoCC extends Departamento {   
    private ArrayList<Colaboradores> listaColaboradoresComissionados;

    public DepartamentoCC(int codigo, String nome){
        super(codigo,nome);
        this.listaColaboradoresComissionados = new ArrayList<Colaboradores>();
        
    }

    //public ArrayList<ColaboradorComissionado> getListaCC(){return this.listaColaboradoresComissionados;}
    /*
    public void adicionarColaboradorComissionado(ColaboradorComissionado pessoa){
        listaColaboradoresComissionados.add(pessoa);
    } 
    */
   


    //os comissionados devem receber o valor total de vendas multiplicado pela percentagem, independentemente do número de horas trabalhadas;
     public void calcularSalario(){
        for(ColaboradorComissionado pessoa: listaColaboradoresComissionados){
            pessoa.setSalario((pessoa.getValorVendasMes()*pessoa.getValorPercentualComissao()));
        }
    } 

    //Crie um método para gerar folha salarial, que mostre o nome e salário de cada funcionário ao
    //final do mês, o valor total de salários daquele departamento.

    public void relatorio(){
        for(ColaboradorComissionado pessoa: listaColaboradoresComissionados){
            System.out.println(pessoa);
        }
    } 

 

} 
