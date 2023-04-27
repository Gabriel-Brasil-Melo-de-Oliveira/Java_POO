




import java.util.ArrayList;
import java.util.Collections;

public class Disciplina {
    private String nomeDisciplina;
    private int codigoDisciplina;
    private int quantidadeAlunosMatriculados; //representa a quantidade maxima da capacidade
    private ArrayList<Aluno> listaDeAlunos;

    public String getNomeDisciplina(){return this.nomeDisciplina;}
    public void setNomeDisciplina(String nomeDisciplina){this.nomeDisciplina = nomeDisciplina;}

    public int getCodigoDisciplina(){return this.codigoDisciplina;}
    public void setCodigoDisciplina(int codigoDisciplina){this.codigoDisciplina = codigoDisciplina;}

    public int getQuantidadeAlunosMatriculados(){return this.quantidadeAlunosMatriculados;}
    public void setQuantidadeDeAlunosMatriculados(int quantidadeAlunosMatriculados){this.quantidadeAlunosMatriculados = quantidadeAlunosMatriculados;}

    public ArrayList<Aluno> getListaDeAlunos(){
        return this.listaDeAlunos;
    }

    public Disciplina(String nomeDisciplina, int codigoDisciplina, int quantidadeAlunosMatriculados){
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.quantidadeAlunosMatriculados = quantidadeAlunosMatriculados;
        listaDeAlunos = new ArrayList<Aluno>();
    }

    //Matricular aluno: não permitir a matrícula se a turma já está cheia

    public void matricularAluno(Aluno alunoInserido){
        if(this.listaDeAlunos.size() == this.quantidadeAlunosMatriculados){
            System.out.println("\nA disciplina está na sua capacidade máxima!");
        }else{
            this.listaDeAlunos.add(alunoInserido);
            System.out.println("\nAluno inserido com sucesso!");
        }
    }

    //Atribuir notas: seleciona o aluno e atribui as notas da disciplina

    public void atribuirNotas(Aluno alunoInserido,double nota1,double nota2){
        for(Aluno a: listaDeAlunos){
            if(a.getNome().equals(alunoInserido.getNome())){
                a.setPrimeiraNota(nota1);
                a.setSegundaNota(nota2);
                a.mediaProvas();
            }
        }
    }

    //mostrar alunos
    public void mostrarAlunos(){
        for(Aluno a: listaDeAlunos){
            System.out.println(a);
        }
    }

    //Gerar estatísticas: mostra as seguintes informações: o aluno que tirou maior média, quantos
    //alunos passaram por média (>=7) e quantos não passaram, a média geral da turma

    public void mostrarRelatorio(){
        double maiorMedia = listaDeAlunos.get(0).getMediaDasProvas();
        String nomeAlunoMaiorMedia = listaDeAlunos.get(0).getNome();
        int aprovados = 0;
        int reprovados = 0;
        double notaTotal = 0;
        double mediaNotaTotal;
        for(Aluno a: listaDeAlunos){
            if(a.getMediaDasProvas() > maiorMedia){
                maiorMedia = a.getMediaDasProvas();
                nomeAlunoMaiorMedia = a.getNome();
            }
            if(a.getMediaDasProvas() >= 7){
                aprovados++;
            }else{
                reprovados++;
            }
            notaTotal += a.getMediaDasProvas();
        }
        mediaNotaTotal = notaTotal/(listaDeAlunos.size());
        System.out.println("\nO aluno com a maior media foi: " + nomeAlunoMaiorMedia + "\nSua media foi de: " + maiorMedia + "\nA quantidade de alunos aprovados foi de: " + aprovados + "\nE a de reprovados foi de: " + reprovados + "\nA média geral da turma foi de: " + mediaNotaTotal);
    }

    //A lista dos alunos com suas notas e média por ordem alfabética
  

    //A lista dos alunos com suas notas e média por ordem decrescente de média
    public void listaOrdenadaPorMedia(){
        Aluno aux;
        Aluno aux2;
        for(int i = 0; i < listaDeAlunos.size(); i++){
            for(int w = i+1; w < listaDeAlunos.size(); w++){
                if(listaDeAlunos.get(i).getMediaDasProvas() < listaDeAlunos.get(w).getMediaDasProvas()){
                   aux = listaDeAlunos.get(i);
                   aux2 = listaDeAlunos.get(w);
                   listaDeAlunos.remove(i);
                   listaDeAlunos.add(i, aux2);
                   listaDeAlunos.remove(w);
                   listaDeAlunos.add(w,aux);
                }   
            }
        }
    }

    public void odernarOrdemAlfabetica(){
        for(int i = 0; i < this.listaDeAlunos.size(); i ++){
            for(int j = i + 1;j < this.listaDeAlunos.size();j++){
                String nome1 = this.listaDeAlunos.get(i).getNome();
                String nome2 = this.listaDeAlunos.get(j).getNome();
                if(nome1.compareTo(nome2) > 1){
                    Aluno aux = this.listaDeAlunos.get(i);
                    this.listaDeAlunos.set(i,this.listaDeAlunos.get(j));
                    this.listaDeAlunos.set(j,aux);
                }
            }
        }
    }
}
