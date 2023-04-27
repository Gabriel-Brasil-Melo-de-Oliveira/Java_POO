import java.time.LocalDate;
public class Mensagem {
    private String mensagem;
    private Pessoa contato;
    private LocalDate dataAtual;

    public String getMensagem(){return this.mensagem;}
    public void setMensagem(String mensagem){this.mensagem = mensagem;}

    public Pessoa getContato(){return this.contato;}

    public LocalDate getData(){return this.dataAtual;}

    public Mensagem(String mensagem,Pessoa contato){
        this.mensagem = mensagem;
        this.contato = contato;
        dataAtual = LocalDate.now();
    }

    public String toString(){
        return "\nMensagem: " + this.mensagem + "\nContato: " + this.contato.getNome() + "\nData: " + this.dataAtual;
    }
}
