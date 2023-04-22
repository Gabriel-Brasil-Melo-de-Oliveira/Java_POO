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

    public void ordenarOrdemAlfabetica(){
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUWVXYZ";
        Funcionario aux;
        for(int i = 0; i < listaFuncionario.size();i++){
            for(int w = i+1; w < listaFuncionario.size();w++){
                String nome = listaFuncionario.get(i).getNome();
                String primeiraLetra = nome.substring(0,1).toUpperCase();
                int posicao = alfabeto.indexOf(primeiraLetra);

                String nome2 = listaFuncionario.get(w).getNome();
                String primeiraLetra2 = nome2.substring(0,1).toUpperCase();
                int posicao2 = alfabeto.indexOf(primeiraLetra2);

                if(posicao2 < posicao){
                aux = listaFuncionario.get(i);
                listaFuncionario.set(i, listaFuncionario.get(w));
                listaFuncionario.set(w, aux);
                }
            }
        }
    }

    public void outraFormaDeOrdenar(){//IMPORTANTE
        for(int i = 0; i < listaFuncionario.size();i++){
            for(int w = i +1; w < listaFuncionario.size();w++){
                String nome1 = listaFuncionario.get(i).getNome();
                String nome2 = listaFuncionario.get(w).getNome();
                if(nome1.compareTo(nome2) > 0){
                    Funcionario aux = listaFuncionario.get(i);
                    listaFuncionario.set(i, listaFuncionario.get(w));
                    listaFuncionario.set(w, aux);
                }
            }
        }
    }
}
