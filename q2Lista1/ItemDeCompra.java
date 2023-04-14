public class ItemDeCompra {
    private int codigoDoItem;
    private String nomeDoProduto;
    private double valorDoProduto;
    private int quantidadeComprada;

    public ItemDeCompra(int codigoDoItem,String nomeDoProduto,double valorDoProduto,int quantidadeComprada){
        this.codigoDoItem = codigoDoItem;
        this.nomeDoProduto = nomeDoProduto;
        this.valorDoProduto = valorDoProduto;
        this.quantidadeComprada = quantidadeComprada;
    }

    //get e set ------------------------------------------------------------------------------------------------- TA OK!

    public int getCodigoDoItem(){return this.codigoDoItem;}
    public void setCodigoDoItem(int codigoDoItem){this.codigoDoItem = codigoDoItem;}

    public String getNomeDoProduto(){return this.nomeDoProduto;}
    public void setNomeDoProduto(String nomeDoProduto){this.nomeDoProduto = nomeDoProduto;}

    public double getValorDoProduto(){return this.valorDoProduto;}
    public void setValorDoProduto(double valorDoProduto){this.valorDoProduto = valorDoProduto;}

    public int getQuantidadeComprada(){return this.quantidadeComprada;}
    public void setQuantidadeComprada(int quantidadeComprada){this.quantidadeComprada = quantidadeComprada;}

    //------------------------------------------------------------------------------------------------------------

    //calcular total TA OK!
    public double calcularTotal(){
        double valorTotal = (this.valorDoProduto*this.quantidadeComprada);
        return valorTotal;
    }


    //imprimir a classe TA OK!
    public String toString(){
        return "\nO item é: " + this.nomeDoProduto + "\nSeu código é: " + this.codigoDoItem + "\nSeu valor é: " + this.valorDoProduto + "\nA quantidade comprada foi: " + this.quantidadeComprada + "\nO preço total foi: " + this.calcularTotal();
    }

}
