public class Banco {
    private String nome;
    private Conta[] listaDeConta;

    Banco(String nome,int numeroDeElementosDoVetorConta){
        this.nome = nome;
        listaDeConta = new Conta[numeroDeElementosDoVetorConta];
    }

    
    public void cadastrarNovaConta1(String nomeCliente,int numeroDaConta ,double saldoCliente){
        Conta jose = new Conta(nomeCliente,numeroDaConta,saldoCliente);
        listaDeConta[0] = jose;
    }
    public void cadastrarNovaConta2(String nomeCliente,int numeroDaConta ,double saldoCliente){
        Conta xico = new Conta(nomeCliente,numeroDaConta ,saldoCliente);
        listaDeConta[1] = xico;
    }

    public Conta mostrarConta(int numeroDaConta){
        for(Conta c: listaDeConta){
            if(c.getNumeroDaConta() == numeroDaConta){
                return c;
            }
        }
        return null;
    }

    public Conta procurarConta(int numeroDaConta){
    for(Conta c: listaDeConta){
        if(c.getNumeroDaConta() == numeroDaConta){
            System.out.println(c);
            return c;
        }
    }
    System.out.println("Conta não encontrada");
    return null;
    }

    public boolean transferirSaldo(Conta conta1,double valorTransferido,Conta conta2){
        if(conta1.getSaldoCliente() >= valorTransferido){
            conta1.setSaldoCliente((conta1.getSaldoCliente()-valorTransferido));
            conta2.setSaldoCliente((conta2.getSaldoCliente()+valorTransferido));
            System.out.println(conta1);
            System.out.println(conta2);
            return true;
        }else{
            System.out.println("Saldo insuficiente da conta " + conta1.getNomeCliente() + "\n");
            return false;
        }
    }

}