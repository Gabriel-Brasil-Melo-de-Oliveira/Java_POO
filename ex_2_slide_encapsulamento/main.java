/*
 Crie uma classe Banco que possui como atributos
um nome e um vetor de contas. Faça um
construtor que recebe o nome do banco e a
quantidade de elementos no vetor, e inicialize os
atributos. Faça também métodos de procurar uma
conta (passando como parâmetro o número da
conta), cadastrar uma nova conta e transferir entre
contas

Crie uma classe Principal que instancie um banco e
forneça ao usuário um menu para ele criar contas,
sacar, depositar e alterar dados.
 */
public class main {
    public static void main(String[] args){
        Banco bancoDoBrasil = new Banco("Banco do Brasil",2);
        Menu Principal = new Menu();
        bancoDoBrasil.cadastrarNovaConta1("Jose",290,999);
        Principal.mostrarMenu(bancoDoBrasil);
        //bancoDoBrasil.cadastrarNovaConta2("Xicó",123,2000);
        //bancoDoBrasil.transferirSaldo(bancoDoBrasil.mostrarConta(290),1000,bancoDoBrasil.mostrarConta(123));
        //bancoDoBrasil.procurarConta(290);
    }
}
