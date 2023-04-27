public class Pessoa implements Miar {
    private String nome;
    private int telefone;

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public int getTelefone(){return this.telefone;}
    public void setTelefone(int telefone){this.telefone = telefone;}

    public Pessoa(String nome,int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String toString(){
        return "\nNome: " + this.nome + "\nTelefone: " + this.telefone;
    }

    public void miar(){
        System.out.println("Miaaaaaaaaaaaaaaaaaau");
    }
}
