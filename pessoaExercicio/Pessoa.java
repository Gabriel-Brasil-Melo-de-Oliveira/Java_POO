public class Pessoa {
   private String nomePessoa; 
   private int telefonePessoa;

   public void setNomePessoa(String nomePessoa){
    this.nomePessoa = nomePessoa;
   }
   public String getNomePessoa(){return this.nomePessoa;}
   public void setTelefonePessoa(int telefonePessoa){
    this.telefonePessoa = telefonePessoa;
   }
   public int getTelefonePessoa(){return this.telefonePessoa;}

   public Pessoa(String nomePessoa,int telefonePessoa){
    this.telefonePessoa = telefonePessoa;
    this.nomePessoa = nomePessoa;
   }

   public void modificarTelefone(int novoTelefone){
    this.telefonePessoa = novoTelefone;
   }

   public String toString(){
    return "\nO nome da pessoa é " + this.nomePessoa + "\nSeu telefone é " + this.telefonePessoa ;
   }

   
}
