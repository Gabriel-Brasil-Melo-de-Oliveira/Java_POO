/*Criar a subclasse ContaCorrente, com atributo
limite e método debitarAnuidade, que debita 50
reais do saldo. */

public class ContaCorrente extends Conta {
    private double limite;

    public double getLimite(){return this.limite;}
    public void setLimite(double limite){this.limite = limite;}

    public ContaCorrente(String nomeCliente,int numeroDaConta ,double saldoCliente,double limite){
        super(nomeCliente,numeroDaConta,saldoCliente);
        this.limite = limite;
    }

    public void debitarAnuidade(){
        double saldoAntesDebito = super.getSaldoCliente();
        super.setSaldoCliente((saldoAntesDebito-50));
    }

    public void aumentarSaldo(double valor){
        double novoSaldo = super.getSaldoCliente();
        super.setSaldoCliente((novoSaldo+valor));
    }

    public String toString(){
        return super.toString() + "\nO limite do cliente " + super.getNomeCliente() + " é de " + this.limite;
    }

    @Override
    public boolean sacarSaldo(double valorDoSaque){
        if(super.getSaldoCliente() == 0 && this.limite >= valorDoSaque){
            this.limite = (this.limite-valorDoSaque);
            System.out.println("\nSaque do limite realizado com sucesso");
            return true;
        }
        System.out.println("\nLimite para o saque insuficiente.");
        return false;
    }
}
