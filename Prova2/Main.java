
public class Main {
    public static void main(String[] args){
        Disciplina poo = new Disciplina("Programação Orientada a Objetos");

        AlunoGrad pessoaGrad = new AlunoGrad("Gabriel", 9,10,"2022.2");
        AlunoGrad pessoaGrad2 = new AlunoGrad("Jose", 8,8,"2022.3");

        AlunoPos pessoaPos = new AlunoPos("Victor", 9,8,"Claudia");

        poo.adicionarAluno(pessoaGrad);
        poo.adicionarAluno(pessoaPos);
        poo.adicionarAluno(pessoaGrad2);
        

        poo.listarAlunosAprovados();

        poo.calcularMediaTotal("Ambos");
    }    
}

