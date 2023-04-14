public class ColaboradorComissionado extends Colaboradores {
    private double valorPercentualComissao;
    private double valorVendasMes;

    public double getValorPercentualComissao(){return this.valorPercentualComissao;}
    public void setValorPercentualComissao(double valorPercentualComissao){this.valorPercentualComissao = valorPercentualComissao;}

    public double getValorVendasMes(){return this.valorVendasMes;}
    public void setValorVendasMes(double valorVendasMes){this.valorVendasMes = valorVendasMes;}

    public ColaboradorComissionado(String nome, int horasTrabalhadas, double valorPercentualComissao,double valorVendasMes){
        super(nome, horasTrabalhadas);
        this.valorPercentualComissao = valorPercentualComissao;
        this.valorVendasMes = valorVendasMes;
    }
    public String toString(){
        return super.toString() + "\nO valor percentual da comissao foi de: " + this.valorPercentualComissao + "\nO valor de vendas do mes foi de: " + this.valorVendasMes;
    }
}
