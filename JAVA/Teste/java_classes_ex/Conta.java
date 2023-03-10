//1) Crie uma classe que represente uma conta
//bancária. Toda conta possui um titular, um número
//e um saldo. Crie um método para depositar um
//valor e outro para realizar um saque (lembre que
//saldo não pode ser negativo)

public class Conta{
    private String nome;
    private int numero_conta = 0;
    private double saldo = 0;

    public String get_Nome(){ return nome;}
    public void set_Nome(String nome){this.nome = nome;}

    public int get_Numero_Conta(){return numero_conta;}
    public void set_Numero_Conta(int numero_conta){this.numero_conta = numero_conta;}

    public double get_Saldo(){return saldo;}
    public void set_Saldo(double saldo){this.saldo = saldo;}

    public Conta(String nome,int numero_conta,double saldo){
        this.nome = nome;
        this.numero_conta = numero_conta;
        this.saldo = saldo;
    }

    public void depositar(double valor_depositado){
        this.set_Saldo(valor_depositado);
    }

    public double sacarDinheiro(double valor_saque){
        if(saldo < valor_saque){
            System.out.println("Saldo insuficiente!");
            return 0;
        }else{
            this.saldo = (saldo-valor_saque);
            return valor_saque;
        }

    }




}
