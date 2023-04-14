//Crie uma classe Compra que possui um array de itens de venda (por simplicidade, considere que
//uma compra possui no máximo 5 itens). Crie os seguintes métodos:
import java.util.ArrayList;

public class Compra {
    private ArrayList<ItemDeCompra> listaDeCompras;
    private double desconto = 0;
    private double valorFinal = 0;

    public ArrayList<ItemDeCompra> getListaDeCompras(){return this.listaDeCompras;}

    public Compra(){
        listaDeCompras = new ArrayList<ItemDeCompra>();
    }

    //inserirItem: insere um item de compra no array TA OK!

    public boolean inserirItem(ItemDeCompra itemInserido){
        for(ItemDeCompra item: listaDeCompras){
            if(itemInserido.getNomeDoProduto().equals(item.getNomeDoProduto())){
                System.out.println("\nO item " + itemInserido.getNomeDoProduto() + " já está na lista.");
                return false;
            }
        }
        listaDeCompras.add(itemInserido);
        System.out.println("\nItem " + itemInserido.getNomeDoProduto() + " inserido com sucesso.");
        return true;
    }

    //calcularTotalCompra: calcula e retorna o valor total da compra TA OK!

    public double calcularTotalCompra(){
        double valorTotalDaCompraAntesDoDesconto = 0;
        for(ItemDeCompra item: listaDeCompras){
            valorTotalDaCompraAntesDoDesconto += item.calcularTotal();
        }
        return valorTotalDaCompraAntesDoDesconto;
    }

    //darDesconto: recebe como parâmetro a porcentagem de desconto e calcula o valor real do desconto TA OK!

    public double darDesconto(double porcentagemDesconto){
        double descontoDado = this.calcularTotalCompra()*porcentagemDesconto;
        this.desconto = descontoDado;
        return descontoDado;
    }

    //calcularTotalFinal: retorna o valor final da compra, após o desconto. TA OK!

    public double calcularTotalFinal(){
        double valorTotalFinal = this.calcularTotalCompra() - this.desconto;
        this.valorFinal = valorTotalFinal;
        return valorTotalFinal;
    }

    //gerarRelatório: mostra o cupom fiscal da compra com informação de todos os itens
    //comprado, desconto, tipo de pagamento e valor final e prestações.

    public void gerarRelatorio(){
        System.out.println("\nEssa é a lista de produtos comprados:\n");
        for(ItemDeCompra item: listaDeCompras){
            System.out.println(item);
        }
        System.out.println("\n\n");
        System.out.println("\nEsse foi o valor de desconto: " + this.desconto);
        System.out.println("\nEsse foi o valor final: " + this.valorFinal);
    }

}