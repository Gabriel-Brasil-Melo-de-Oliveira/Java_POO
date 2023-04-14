public class Aluno {
    private String nome;
    private int matricula;
    private double primeiraNota;
    private double segundaNota;
    private double mediaDasProvas;

    public double getMediaDasProvas(){return this.mediaDasProvas;}
    public void setMediaDasProvas(double mediaDasProvas){this.mediaDasProvas = mediaDasProvas;}

    public double getPrimeiraNota(){return this.primeiraNota;}
    public void setPrimeiraNota(double primeiraNota){this.primeiraNota = primeiraNota;}

    public double getSegundaNota(){return this.segundaNota;}
    public void setSegundaNota(double segundaNota){this.segundaNota = segundaNota;}

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public int getMatricula(){return this.matricula;}
    public void setMatricula(int matricula){this.matricula = matricula;}

    public Aluno(String nome, int matricula,double primeiraNota,double segundaNota){
        this.nome = nome;
        this.matricula = matricula;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.mediaDasProvas = this.mediaProvas();
    }

    public double mediaProvas(){
        double media = ((primeiraNota+segundaNota)/2);
        this.mediaDasProvas = media;
        return media;
    }
    
    public String toString(){
        return "\nNome do aluno: " + this.nome + "\nMatricula: " + this.matricula + "\nnota 1: " + this.primeiraNota + "\nNota 2: " + this.segundaNota + "\nMédia: " + this.mediaDasProvas;
    }


}