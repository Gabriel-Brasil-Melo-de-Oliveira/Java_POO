public class Main {
    public static void main(String[] args){
        ItemDeCompra arroz = new ItemDeCompra(123,"Arroz",2,2);
        //System.out.println(arroz);

        ItemDeCompra ovo = new ItemDeCompra(22,"Ovos",5,2);
        //System.out.println(ovo);

        Compra minhaListaDeCompra = new Compra();

        minhaListaDeCompra.inserirItem(arroz);
        minhaListaDeCompra.inserirItem(ovo);

        //calculando o total da compra antes do desconto

        double valorTotal = minhaListaDeCompra.calcularTotalCompra();
        //System.out.println("\nEsse é o valor total da compra antes do desconto " + valorTotal);

        double desconto = minhaListaDeCompra.darDesconto(0.5);
        //System.out.println("\nEsse foi o desconto a ser subtraido " + desconto);

        double valorFinalDaCompra = minhaListaDeCompra.calcularTotalFinal();
        //System.out.println("\nEsse é o valor total da compra " + valorFinalDaCompra);

        minhaListaDeCompra.gerarRelatorio();
        
    }
}
