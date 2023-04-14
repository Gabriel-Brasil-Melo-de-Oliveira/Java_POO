public class Jogador extends Personagem {
    private String raca;

    public String getRaca(){return this.raca;}
    public void setRaca(String raca){this.raca = raca;}

    public Jogador(String nome,int level,String raca){
        super(nome, level);
        this.raca = raca;
    }

    public String toString(){
        return super.toString() + "\nA raça do " + this.getNome() + " é: " + this.raca;
    }
}
