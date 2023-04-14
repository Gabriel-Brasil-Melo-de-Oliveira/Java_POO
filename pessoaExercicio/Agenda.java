import java.util.ArrayList;
public class Agenda {
    private ArrayList<Pessoa> listaDePessoas;
    private ArrayList<Mensagem> listaDeMensagem;

    public boolean enviarMensagem(int procurarTelefone,Mensagem mensagemQueVaiSerEnviada){
        for(Pessoa p: listaDePessoas){
            if(p.getTelefonePessoa() == procurarTelefone){
                this.listaDeMensagem.add(mensagemQueVaiSerEnviada);
                return true;
            }
        }
        System.out.println("Pessoa não encontrada");
        return false;
    }

    public ArrayList<Mensagem> getListaDeMensagem(){
        return this.listaDeMensagem;
    }

    public ArrayList<Pessoa> getListaDePessoas(){
        return this.listaDePessoas;
    }

    public Agenda(){
        this.listaDePessoas = new ArrayList<Pessoa>();
        listaDeMensagem = new ArrayList<Mensagem>();
    }

    public void adicionarPessoaNaLista(Pessoa pessoaAdicionada){
        if(listaDePessoas.contains(pessoaAdicionada)){
            System.out.println("\nA pessoa ja existe.");
        }else{
            listaDePessoas.add(pessoaAdicionada);
            System.out.println("\nPessoa adicionada com sucesso!");
        }
    }

    public int tamanhoDaLista(){
        int quantidade = listaDePessoas.size();
        return quantidade;
    }

    public Pessoa procurarPessoa(String nomePessoa){
        Pessoa nula = null;
        for(Pessoa p: listaDePessoas){
            if(p.getNomePessoa() == nomePessoa){
                System.out.println("\nPessoa encontrada com sucesso " + p.getNomePessoa());
                return p;
            }
        }
        System.out.println("\nNão foi possível encontrar essa pessoa!");
        return nula;
    }

    public boolean procurarPessoa(int telefonePessoa){
        for(Pessoa p: listaDePessoas){
            if(p.getTelefonePessoa() == telefonePessoa){
                System.out.println("\nPessoa encontrada com sucesso " + p.getTelefonePessoa());
                return true;
            }
        }
        System.out.println("\nNão foi possível encontrar essa pessoa!");
        return false;
    }

    public void mostrarTodaLista(){
        for(Pessoa p: listaDePessoas){
            System.out.println(p);
        }
    }

}
