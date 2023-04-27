import java.util.ArrayList;

public class Disciplina {
   private String nome;
   private ArrayList<Aluno> listaDeAlunos;
   
   public String getNome(){
    return this.nome;
   }
   public void setNome(String nome){
    this.nome = nome;
   }

   public Disciplina(String nome){
    this.nome = nome;
    listaDeAlunos = new ArrayList<Aluno>();
   }

   public void adicionarAluno(Aluno pessoa){
    listaDeAlunos.add(pessoa);
   }

   public void listarAlunosAprovados(){
    int totalAprovado = 0;
    for(Aluno pessoa: listaDeAlunos){
        if(pessoa instanceof AlunoGrad){
            if(pessoa.calcularMediaGeral() >= 6){
                System.out.println("\nTipo de Aluno: " + "Graduação" + "\nAluno: " + pessoa.getNome() + " aprovado!" + "\nSua média foi de: " + pessoa.calcularMediaGeral());
                totalAprovado++;
            }else{
                System.out.println("\nTipo de Aluno: " + "Graduação" + "\nAluno: " + pessoa.getNome() + " REPROVADO!" + "\nSua média foi de: " + pessoa.calcularMediaGeral());
            }
        }else if(pessoa instanceof AlunoPos){
            if(pessoa.calcularMediaGeral() >= 7){
                System.out.println("\nTipo de Aluno: " + "Pós" + "\nAluno: " + pessoa.getNome() + " aprovado!" + "\nSua média foi de: " + pessoa.calcularMediaGeral());
                totalAprovado++;
            }else{
                System.out.println("\nTipo de Aluno: " + "Pós" + "\nAluno: " + pessoa.getNome() + " REPROVADO!" + "\nSua média foi de: " + pessoa.calcularMediaGeral());
            }
        }
    }
    System.out.println("\nO total de aprovados foi de: " + totalAprovado);
   }

//Crie um método calcularMédiaTotal(String tipoAluno), que devolve a média total da disciplina
//de acordo com o tipo de parâmetro, ou seja, se for “graduação” apenas dos alunos de
//graduação, se for “pós” apenas dos alunos de pós, e se for “ambos” considerando ambos
//alunos (0.5 ponto).

   public double calcularMediaTotal(String tipoAluno){
    double mediaGeralGrad = 0;
    int quantidadeAlunosGrad = 0;
    double mediaGeralPos = 0;
    int quantidadeAlunosPos = 0;
    double mediaGeral = 0;

    if(tipoAluno.equals("Graduação")){
        for(Aluno pessoa: listaDeAlunos){
            if(pessoa instanceof AlunoGrad){
                mediaGeralGrad += pessoa.calcularMediaGeral();
                quantidadeAlunosGrad++;
            }
        }
        mediaGeralGrad = mediaGeralGrad/quantidadeAlunosGrad;
        
        System.out.println("\nA media geral da turma de graduação foi de: " + mediaGeralGrad);
        return mediaGeralGrad;
    }else if(tipoAluno.equals("Pós")){
        for(Aluno pessoa: listaDeAlunos){
            if(pessoa instanceof AlunoPos){
                mediaGeralPos += pessoa.calcularMediaGeral();
                quantidadeAlunosPos++;
            }
        }
        mediaGeralPos = mediaGeralPos/quantidadeAlunosPos;
        System.out.println("\nA media geral da turma da Pós foi de: " + mediaGeralPos);
        return mediaGeralPos;

    }else if(tipoAluno.equals("Ambos")){
        for(Aluno pessoa: listaDeAlunos){
            if(pessoa instanceof AlunoGrad){
                mediaGeralGrad += pessoa.calcularMediaGeral();
            }else if(pessoa instanceof AlunoPos){
                mediaGeralPos += pessoa.calcularMediaGeral();
            }
        }
        mediaGeral = ((mediaGeralGrad+mediaGeralPos)/listaDeAlunos.size());
        System.out.println("\nA media geral das duas turmas  foi de: " + mediaGeral);
        return mediaGeral;
    }
    return 0;
   }
//Crie um método encontrarMelhoresAlunos(int qtde), que retorna um ArrayList de alunos com a 
//quantidade de alunos com as maiores médias. Por exemplo, se qtde==4, então seu método deve retornar 
//um arraylist com no máximo 4 alunos cujas médias foram as maiores da turma(1 ponto). 

public ArrayList<Aluno> encontrarMelhoresAlunos(int quantidade){
    double maiorMedia = listaDeAlunos.get(0).calcularMediaGeral();
    Aluno alunoTemp;
    for(int i = 0; i < listaDeAlunos.size(); i++){
        for(int w = i +1; w < listaDeAlunos.size(); w++){
            if(listaDeAlunos.get(i).calcularMediaGeral() < listaDeAlunos.get(w).calcularMediaGeral()){
                alunoTemp = listaDeAlunos.get(i);
                listaDeAlunos.remove(i);
                listaDeAlunos.add(w, alunoTemp);
            }
        }
    }
    ArrayList<Aluno> novaListaMelhores = new ArrayList<Aluno>(quantidade);
    for(int i= 0; i < quantidade;i++){
        novaListaMelhores.add((listaDeAlunos.get(i)));
    }
    for(Aluno pessoa: novaListaMelhores){
        System.out.println(pessoa + "\nSua media foi de: " + pessoa.calcularMediaGeral());
    }
    return novaListaMelhores;
    
}

public void maiorMedia(){
    double maiorMedia = 0;
    Aluno aux = this.listaDeAlunos.get(0);
    for(Aluno aln: this.listaDeAlunos){
        if(aln instanceof AlunoGrad){
            AlunoGrad alunoGrad = (AlunoGrad) aln;
            double novaNota = alunoGrad.calcularMediaGeral();
            if(novaNota > maiorMedia){
                maiorMedia = novaNota;
                aux = aln;
            }
        }else if(aln instanceof AlunoPos){
            AlunoPos alunoPos = (AlunoPos) aln;
            double novaNota = alunoPos.calcularMediaGeral();
            if(novaNota > maiorMedia){
                maiorMedia = novaNota;
                aux = aln;
            }
        }
    }
    System.out.println(aux);
}

}
