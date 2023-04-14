public class Vilao extends Personagem {
    private String classe;

    public String getClasse(){return this.classe;}
    public void setClasse(String classe){this.classe = classe;}

    public Vilao(String nome,int level,String classe){
        super(nome, level);
        this.classe = classe;
    }

    @Override
    public String toString(){
        return super.toString() + "\nA classe do vilão é: " + this.classe;
    }
}
