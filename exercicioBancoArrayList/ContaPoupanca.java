public class ContaPoupanca extends Conta {
    private double taxaDeRendimento;

    public double getTaxaDeRendimento(){return this.taxaDeRendimento;}
    public void setTaxaDeRendimento(double taxaDeRendimento){this.taxaDeRendimento = taxaDeRendimento;}

    public ContaPoupanca(String nomeCliente,int numeroDaConta ,double saldoCliente, double taxaDeRendimento){
        super(nomeCliente,numeroDaConta,saldoCliente);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public double render(){
        double valor = super.getSaldoCliente();
        valor += (valor*taxaDeRendimento);
        super.setSaldoCliente(valor);
        return valor;
    }

    public String toString(){
        return super.toString() + "A taxa de rendimento de: " + this.taxaDeRendimento;
    }

}
