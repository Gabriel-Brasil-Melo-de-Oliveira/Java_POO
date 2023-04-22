public class Main {
    public static void main(String[] args){
        Funcionario pessoa1 = new Funcionario("Gabriel", 25000);
        Funcionario pessoa2 = new Funcionario("Victor", 26000);
        Funcionario pessoa3 = new Funcionario("Ana", 100000);

        SetorPessoal setor1 = new SetorPessoal();
        setor1.adicionarFuncionario(pessoa1);
        setor1.adicionarFuncionario(pessoa2);
        setor1.adicionarFuncionario(pessoa3);

        setor1.maiorSalario();

        setor1.folhaDePagamento();


    }
}
