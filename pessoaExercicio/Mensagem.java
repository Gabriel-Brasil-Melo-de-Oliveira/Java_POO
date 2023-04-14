import java.util.Date;
import java.text.SimpleDateFormat;

public class Mensagem {
    private int contato;
    private String textoDaMensagem;
    private Date dataDeEnvio;


    public Mensagem(int contato,String textoDaMensagem){
        this.contato = contato;
        this.textoDaMensagem = textoDaMensagem;
        dataDeEnvio = new Date(); 
    }

    public void mostrarNomeMensagemHora(){
        System.out.println("\nA mensagem foi enviada para: " + this.contato + "\nA mensagem foi: " + this.textoDaMensagem + "\nA hora da mensagem foi: " + dataDeEnvio);
    }

}
