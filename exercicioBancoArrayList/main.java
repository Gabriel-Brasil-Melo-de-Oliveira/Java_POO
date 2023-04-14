public class main {
    public static void main(String[] args){
        Banco meuBanco = new Banco("SamuraiDev");
        Conta pessoa1 = new Conta("Gabriel",12,700);
        Conta pessoa2 = new Conta("Victor",34,2500);
        //System.out.println(pessoa1);
        //System.out.println(pessoa2);

        meuBanco.adicionarConta(pessoa1);
        meuBanco.adicionarConta(pessoa2);

        //mostrar todas as contas dentro da lista antes da limpeza
        System.out.println("\nAntes da limpeza\n" + meuBanco.getListDeConta());


        
        //transferir saldo
        pessoa1.transferirSaldo(700, pessoa2);
        //verificar se deu certo o valor transferido
        System.out.println("\n" + meuBanco.getListDeConta());

        //limpeza
        meuBanco.removerListaDeContas();
    
        //mostrar lista de contas depois da limpeza
        System.out.println("\nDepois da limpeza:\n" + meuBanco.getListDeConta());
    }
}
