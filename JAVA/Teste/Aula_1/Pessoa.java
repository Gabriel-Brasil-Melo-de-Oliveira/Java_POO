public class Pessoa {
    private String nome;
    private int idade;

    public int pegar_idade() {
        return idade;
    }
    public String pegar_nome() {
        return nome;
    }
    public void setar_idade(int idade){
        this.idade = idade;
    }
    public void setar_nome(String nome){
        this.nome = nome;
    }
    Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
