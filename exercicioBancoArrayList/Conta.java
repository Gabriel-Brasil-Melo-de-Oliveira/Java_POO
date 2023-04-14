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

    public void depositarSaldo(double valorDepositado){
        this.saldoCliente += valorDepositado;
    }

    public boolean sacarSaldo(double valorDoSaque){
        if(this.saldoCliente < valorDoSaque){
            return false;
        }else{
            this.saldoCliente = (this.saldoCliente - valorDoSaque);
            return true;
        }
    }

    public boolean transferirSaldo(double valorTransferido,Conta conta2){
        if(this.saldoCliente < valorTransferido){
            System.out.println("\nSaldo insuficiente!");
            return false;
        }else{
            this.saldoCliente = (saldoCliente - valorTransferido);
            conta2.setSaldoCliente((conta2.getSaldoCliente()+valorTransferido));
            System.out.println("\nSaldo transferido com sucesso!");
            return true;
        }
    }

    public String toString(){
        return "\nO cliente é " + this.nomeCliente + " \nSeu número de conta é " + this.numeroDaConta +" \nSeu saldo é de " + this.saldoCliente + "\n";
    }
    
}
