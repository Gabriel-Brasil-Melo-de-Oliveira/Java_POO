public class main {
    public static void main(String[] args){
        Banco meuBanco = new Banco("SamuraiDev");
       // Conta pessoa1 = new Conta("Gabriel",12,700);
       // Conta pessoa2 = new Conta("Victor",34,2500);
        //System.out.println(pessoa1);
        //System.out.println(pessoa2);

       // meuBanco.adicionarConta(pessoa1);
        //meuBanco.adicionarConta(pessoa2);

        //mostrar todas as contas dentro da lista antes da limpeza
        //System.out.println("\nAntes da limpeza\n" + meuBanco.getListDeConta());


        
        //transferir saldo
        //pessoa1.transferirSaldo(700, pessoa2);
        //verificar se deu certo o valor transferido
        //System.out.println("\n" + meuBanco.getListDeConta());

        //limpeza
        //meuBanco.removerListaDeContas();
    
        //mostrar lista de contas depois da limpeza
        //System.out.println("\nDepois da limpeza:\n" + meuBanco.getListDeConta());

        //ContaCorrente pessoaPlus = new ContaCorrente("Jose", 12, 700, 1000);
        //System.out.println(pessoaPlus);

        //meuBanco.adicionarConta(pessoaPlus);
        
       // ((ContaCorrente) meuBanco.getListDeConta().get(0)).debitarAnuidade();
  
        //((ContaCorrente) meuBanco.getListDeConta().get(0)).aumentarSaldo(100);

       // System.out.println((meuBanco.getListDeConta().get(0)));
        

        //meuBanco.getListDeConta().get(0);
        //System.out.println(pessoaPlus);




        //testando para conta poupança

        //ContaPoupanca minhaContaPoupanca = new ContaPoupanca("Gabriel", 123, 900, 0.5);
        //meuBanco.adicionarConta(minhaContaPoupanca); 

        //((ContaPoupanca) meuBanco.getListDeConta().get(0)).render();

        //meuBanco.procurarConta(123);

        //testar o saque por limite da conta corrente

        ContaCorrente minhContaCorrente = new ContaCorrente("Alexa", 2, 0, 200);

        meuBanco.adicionarConta(minhContaCorrente);

        for(Conta c: meuBanco.getListDeConta()){
            if(meuBanco.getListDeConta().contains(minhContaCorrente)){
                c.sacarSaldo(200);
            }
        }

        meuBanco.procurarConta(2);


    }
}
