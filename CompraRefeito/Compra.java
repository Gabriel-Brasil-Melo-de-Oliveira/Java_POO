import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDate;
public class Compra {
    private ArrayList<ItemDeCompra> listaDeCompra;
    private double desconto = 0;
    private LocalDate dataAtual;


    public ArrayList<ItemDeCompra> getListaDeCompra(){return this.listaDeCompra;}

    public Compra(){
        this.listaDeCompra = new ArrayList<ItemDeCompra>();
        dataAtual = LocalDate.now();
    }

    public boolean inserirItem(ItemDeCompra item){
        if(this.listaDeCompra.size() >= 5){
            System.out.println("\nCapacidade máxima");
            return false;
        }else{
            this.listaDeCompra.add(item);
            return true;
        }
    }

    public double calcularTotalCompra(){
        double valorFinal = 0;
        for(ItemDeCompra item: this.listaDeCompra){
            valorFinal += item.calcularTotal();
        }
        return valorFinal;
    }

    public double darDesconto(double valorDesconto){
        double valorFinal = this.calcularTotalCompra();
        double desconto = valorFinal*valorDesconto;
        this.desconto = desconto;   
        return desconto;
    }

    public double calcularTotalFinal(){
        double valorFinal = this.calcularTotalCompra();
        valorFinal -= this.desconto;
        return valorFinal;
    }

    public void gerarRelatorio(){
        for(ItemDeCompra item: this.listaDeCompra){
            System.out.println(item);
        }
        System.out.println("\nDesconto: " + this.desconto + "\nData: " + this.dataAtual);
    }

    public void ordenarMaior(){
        for(int i = 0;i < this.listaDeCompra.size();i++){
            for(int w = i+1;w < this.listaDeCompra.size();w++){
                if(this.listaDeCompra.get(w).getPrecoUnitario() > this.listaDeCompra.get(i).getPrecoUnitario()){
                    ItemDeCompra aux = this.listaDeCompra.get(i);
                    this.listaDeCompra.set(i,this.listaDeCompra.get(w));
                    this.listaDeCompra.set(w,aux);
                }
            }
        }
    }
    public void ordernarAlfabeto(){
        for(int i = 0;i < this.listaDeCompra.size();i++){
            for(int w = i+1;w < this.listaDeCompra.size();w++){
                String nome1 = this.listaDeCompra.get(i).getNomeProduto();
                String nome2 = this.listaDeCompra.get(w).getNomeProduto();
                if(nome1.compareToIgnoreCase(nome2) > 0){
                    ItemDeCompra aux = this.listaDeCompra.get(i);
                    this.listaDeCompra.set(i,this.listaDeCompra.get(w));
                    this.listaDeCompra.set(w,aux);
                }
                
            }
        }
    }
}
