public class ColaboradorComissionado extends Colaborador {
    private double valorPercentualComissao;
    private double valorTotalDeVendas;

    public double getValorPercentualComissao(){
        return this.valorPercentualComissao;
    }
    public void setValorPercentualComissao(double parValorPercentualComissao){
        this.valorPercentualComissao =  parValorPercentualComissao;
    }

    public double getValorTotalDeVendas(){
        return this.valorTotalDeVendas;
    }
    public void setValorTotalDeVendas(double parValorTotalDeVendas){
        this.valorTotalDeVendas = parValorTotalDeVendas;
    }

    public ColaboradorComissionado(String parNome,int parNumeroDeHorasTrabalhadas,double parValorPercentualComissao,double parValorTotalDeVendas){
        super(parNome,parNumeroDeHorasTrabalhadas);
        this.valorPercentualComissao = parValorPercentualComissao;
        this.valorTotalDeVendas = parValorTotalDeVendas;
    }

    public String toString(){
        return super.toString() + "\nValor percentual Comissao: " + this.valorPercentualComissao + "\nValor total das vendas: " + this.valorTotalDeVendas;
    }
    
    //os comissionados registram o valor do percentual de comissão e o valor total
    //de vendas acumuladas no mês;

}
