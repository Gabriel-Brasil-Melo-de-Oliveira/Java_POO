public class Main {
    public static void main(String[] args){
        ItemDeCompra arroz = new ItemDeCompra(0,"Arroz",4,2);
        ItemDeCompra feijao = new ItemDeCompra(1,"Ceijão",8,2);
        ItemDeCompra macarrao = new ItemDeCompra(2,"Bacarrão",5,2);
        
        Compra minhaCompra = new Compra();
        minhaCompra.inserirItem(arroz);
        minhaCompra.inserirItem(feijao);

        minhaCompra.inserirItem(macarrao);

       // minhaCompra.gerarRelatorio();
       //minhaCompra.calcularTotalCompra();
        minhaCompra.darDesconto(0.5);
        minhaCompra.calcularTotalFinal();
        minhaCompra.ordernarAlfabeto();
        minhaCompra.gerarRelatorio();
       //double x = minhaCompra.darDesconto(0.5);
       //System.out.println(x);


    }
}
