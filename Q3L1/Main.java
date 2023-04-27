public class Main {
    public static void main(String[] args){   
        Disciplina disciplina1 = new Disciplina("POO",1,4);
        Aluno aluno1 = new Aluno("Cabriel",1,8,9);
        Aluno aluno2 = new Aluno("Bictor",2,10,8);
        Aluno aluno3 = new Aluno("Xafa",3,8,8);
        Aluno aluno4 = new Aluno("Diguel",4,9,7);

        disciplina1.matricularAluno(aluno1);
        disciplina1.matricularAluno(aluno2);
        disciplina1.matricularAluno(aluno3);
        disciplina1.matricularAluno(aluno4);

        disciplina1.mostrarRelatorio();

        disciplina1.odernarOrdemAlfabetica();
        disciplina1.mostrarAlunos();




    }
}
