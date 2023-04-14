import java.util.Scanner;

public class Menu {
    int numeroEscolhido = 0;
    
        public void mostrarMenu(Banco bancoDoBrasil){
            do{
                System.out.println("\nBem vindo ao seu banco!" + "\nQual operação você deseja realizar?\n");
                System.out.println("\n1 - Procurar Conta");
                System.out.println("\n2 - Cadastrar nova conta");
                System.out.println("\n3 - Transferir saldo");
                System.out.println("\n4 - Sair do menu");
                
                Scanner cin = new Scanner(System.in);
                int numeroEscolhido = cin.nextInt();
    
                if(numeroEscolhido == 1){
                    System.out.println("\nDigite o número da conta que você deseja procurar \n");
                    int numeroParaProcurarConta = cin.nextInt();
                    bancoDoBrasil.procurarConta(numeroParaProcurarConta);
                }else if(numeroEscolhido == 2){
                    bancoDoBrasil.cadastrarNovaConta1("Gabriel",1, 700);
                    bancoDoBrasil.cadastrarNovaConta2("JV", 2, 2500);
                }else if(numeroEscolhido == 3){
                    bancoDoBrasil.transferirSaldo(bancoDoBrasil.mostrarConta(1),700,bancoDoBrasil.mostrarConta(2));
                }else{
                    System.exit(0);
                }
            }while (numeroEscolhido != 4);

        }
    
}
