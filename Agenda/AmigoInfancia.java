public class AmigoInfancia extends Pessoa {
    private int idade;

    public int getIdade(){return this.idade;}
    public void setIdade(int idade){this.idade = idade;}

    public AmigoInfancia(String nome, int telefone, int idade){
        super(nome,telefone);
        this.idade = idade;
    }

    public String toString(){
        return super.toString() + "\nIdade: " + this.idade;
    }
}
