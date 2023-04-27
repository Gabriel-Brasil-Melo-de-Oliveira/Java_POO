public class AmigoTrabalho extends Pessoa {
    private String setorDeTrabalho;

    public String getSetorDeTrabalho(){return this.setorDeTrabalho;}
    public void setSetorDeTrabalho(String setorDeTrabalho){this.setorDeTrabalho = setorDeTrabalho;}

    public AmigoTrabalho(String nome, int telefone, String setorDeTrabalho){
        super(nome,telefone);
        this.setorDeTrabalho = setorDeTrabalho;
    }

    public String toString(){
        return super.toString() + "\nSetor: " + this.setorDeTrabalho;
    }

}
