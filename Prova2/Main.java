
public class Main {
    public static void main(String[] args){
        Disciplina poo = new Disciplina("Programação Orientada a Objetos");

        AlunoGrad pessoaGrad = new AlunoGrad("Gabriel Brasil", 5,0,"2022.2");
        AlunoGrad pessoaGrad2 = new AlunoGrad("Jose Albuquerer", 10,10,"2022.3");

        AlunoPos pessoaPos = new AlunoPos("Victor Melo", 0,10,"Claudia");

        poo.adicionarAluno(pessoaGrad);
        poo.adicionarAluno(pessoaPos);
        poo.adicionarAluno(pessoaGrad2);
        

        poo.listarAlunosAprovados();

        poo.calcularMediaTotal("Ambos");

        poo.encontrarMelhoresAlunos(3);

        poo.maiorMedia();

        poo.mostrarNomes();
    }    
}

