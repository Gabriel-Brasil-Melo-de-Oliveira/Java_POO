import javax.management.NotCompliantMBeanException;

import java.util.ArrayList;

public class Banco {
    private String nomeBanco;
    private ArrayList<Conta> listaDeContas;

    public ArrayList<Conta> getListDeConta(){return listaDeContas;}

    public Banco(String nomeBanco){
        this.nomeBanco = nomeBanco;
        this.listaDeContas = new ArrayList<Conta>();
    }

    public Conta procurarConta(int numeroDaConta){
        for(Conta c: listaDeContas){
            if(c.getNumeroDaConta() == numeroDaConta){
                System.out.println("\nConta encontrada: " + c + "\n");
                return c;
            }
        }
        System.out.println("\nConta não encontrada!");
        return null;
    }

    public void adicionarConta(Conta novaConta) {
        this.listaDeContas.add(novaConta);
        System.out.println("\nNova conta adicionada " + novaConta);
    }

    public void removerListaDeContas(){
        this.listaDeContas.clear();
    }

}
