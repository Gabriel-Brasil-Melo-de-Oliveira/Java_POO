public class AlunoGrad extends Aluno {
    private String semestreDeEntrada;

    public String getSemestreDeEntrada(){
        return this.semestreDeEntrada;
    }
    public void semestreDeEntrada(String semestreDeEntrada){
        this.semestreDeEntrada = semestreDeEntrada;
    }

    public AlunoGrad(String nome,double nota1, double nota2, String semestreDeEntrada){
        super(nome,nota1,nota2);
        this.semestreDeEntrada = semestreDeEntrada;
    }

    @Override
    public double calcularMediaGeral(){
        double mediaGeral;
        mediaGeral = ((super.getNota1()+super.getNota2())/2);
        return mediaGeral;
    }

    public String toString(){
        return super.toString() + "\nAluno de Graduação " + "\nSemestre de entrada: " + this.semestreDeEntrada;
    }

}
