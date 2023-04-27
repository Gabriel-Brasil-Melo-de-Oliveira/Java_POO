public class ItemDeCompra {
    private int codigoProduto;
    private String nomeProduto;
    private double precoUnitario;
    private int quantidadeDeProdutos;

    public int getCodigoProduto(){return this.codigoProduto;}
    public void setCodigoProduto(int codigoProduto){this.codigoProduto = codigoProduto;}

    public String getNomeProduto(){return this.nomeProduto;}
    public void setNomeProduto(String nomeProduto){this.nomeProduto = nomeProduto;}

    public double getPrecoUnitario(){return this.precoUnitario;}
    public void setPrecoUnitario(double precoUnitario){this.precoUnitario = precoUnitario;}

    public int getQuantidadeDeProdutos(){return this.quantidadeDeProdutos;}
    public void setQuantidadeDeProdutos(int quantidadeDeProdutos){this.quantidadeDeProdutos = quantidadeDeProdutos;}

    public ItemDeCompra(int codigoProduto,String nomeProduto,double precoUnitario,int quantidadeDeProdutos){
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public double calcularTotal(){
        return this.quantidadeDeProdutos*this.precoUnitario;
    }

    public String toString(){
        return "\nCodigo: " + this.codigoProduto + "\nNome: " + this.nomeProduto + "\nPreço: " + this.precoUnitario + "\nQuantidade: " + this.quantidadeDeProdutos;
    }
}
