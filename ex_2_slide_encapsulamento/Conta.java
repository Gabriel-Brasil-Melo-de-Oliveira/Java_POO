public class Conta {
    private String nomeCliente;
    private int numeroDaConta;
    private double saldoCliente;

    void setSaldoCliente(double saldoCliente){ this.saldoCliente = saldoCliente;}
    double getSaldoCliente(){return this.saldoCliente;}

    void setNomeCliente(String nomeCliente){this.nomeCliente = nomeCliente;}
    String getNomeCliente(){return this.nomeCliente;}

    void setNumeroDaConta(int numeroDaConta){this.numeroDaConta = numeroDaConta;}
    int getNumeroDaConta(){return this.numeroDaConta;}

    Conta(String nomeCliente,int numeroDaConta ,double saldoCliente){
        this.nomeCliente = nomeCliente;
        this.numeroDaConta = numeroDaConta;
        this.saldoCliente = saldoCliente;
    }

    Conta(){
        this.nomeCliente = "Usuário não encontrado";
        this.numeroDaConta = 0;
        this.saldoCliente = 0;
    }

    public String toString(){
        return "\nO cliente é " + this.nomeCliente + " \nSeu número de conta é " + this.numeroDaConta +" \nSeu saldo é de " + this.saldoCliente + "\n";
    }
}
