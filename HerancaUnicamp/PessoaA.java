public class PessoaA implements Pessoa {
    private String nome;
    private String cpf;

    public String getCPF(){return this.cpf;}
    public String getNome(){return this.nome;}
    public String tipo(int cadeira){
        if(cadeira == 1){
            String resultado = "Cadeira de fumante";
            return resultado;
        }else if(cadeira == 0){
            String resultado = "Cadeira de NÃO fumante";
            return resultado;
        }
    }


}
