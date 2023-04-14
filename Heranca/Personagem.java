public class Personagem {
    private String nome;
    private int level;

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public int getLevel(){return this.level;}
    public void setLevel(){this.level = level;}

    public Personagem(String nome,int level){
        this.nome = nome;
        this.level = level;
    }

    public String toString(){
        return "\nO nome do personagem é: " + this.nome + "\nO level é: " + this.level;
    }
}
