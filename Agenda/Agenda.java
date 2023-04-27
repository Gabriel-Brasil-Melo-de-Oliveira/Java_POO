import java.util.ArrayList;
public class Agenda {
    private ArrayList<Pessoa> listaPessoa;
    private ArrayList<Mensagem> listaMensagem;

    public ArrayList<Pessoa> getLista(){return this.listaPessoa;}

    public ArrayList<Mensagem> getListaMensagem(){return this.listaMensagem;}

    public Agenda(){
        this.listaPessoa = new ArrayList<Pessoa>();
        this.listaMensagem = new ArrayList<Mensagem>();
    }

    public boolean adicionarPessoa(Pessoa pessoaAdicionada){
        for(Pessoa item: this.listaPessoa){
            if(pessoaAdicionada.getNome().equals((item.getNome()))){
                System.out.println("\nPessoa já existe!");
                return false;
            }
        }
        listaPessoa.add(pessoaAdicionada);
        return true;
    }

    public boolean procurarPessoa(Pessoa pessoaRequisitada){
        for(Pessoa item: this.listaPessoa){
            if(pessoaRequisitada.getNome().equals((item.getNome()))){
                System.out.println("\nPessoa encontrada\nSeu número é: " + item.getTelefone());
                return true;
            }
        }
        System.out.println("\nPessoa não está na lista");
        return false;
    }
    public boolean procurarPessoa(int telefoneRequisitado){
        for(Pessoa item: this.listaPessoa){
            if(telefoneRequisitado == item.getTelefone()){
                System.out.println("\nNúmero encontrado\nSeu nome é: " + item.getNome());
                return true;
            }
        }
        System.out.println("\nPessoa não está na lista");
        return false;
    }

    public boolean alterarTelefone(String nome,int novoTelefone){
        for(Pessoa item: this.listaPessoa){
            if(nome.equals(item.getNome())){
                item.setTelefone(novoTelefone);
                System.out.println("\nTelefone alterado com sucesso");
                return true;
            }
        }
        System.out.println("\nPessoa não está na lista");
        return false;
    }

    public void mostrarContatos(Pessoa pessoa){
        for(Pessoa item: this.listaPessoa){
            if(pessoa instanceof AmigoTrabalho && item instanceof AmigoTrabalho){
                System.out.println(item);
                
            }else if(pessoa instanceof AmigoInfancia && item instanceof AmigoInfancia){
                System.out.println(item);
                
            }
        }
    
    }

    public void mostrarContatos(String setor){
        for(Pessoa pessoa: this.listaPessoa){
            if(pessoa instanceof AmigoTrabalho){
                AmigoTrabalho aux = (AmigoTrabalho) pessoa;
                if(aux.getSetorDeTrabalho().equals(setor)){
                    System.out.println(pessoa);
                }
            }
        }
    }

    public void enviarMensagem(int telefone,Mensagem mensagem){
        for(Pessoa item: this.listaPessoa){
            if(item.getTelefone() == telefone){
                this.listaMensagem.add(mensagem);

            }
        }
    }

    public void mostrarMensagens(){
        for(Mensagem msg: this.listaMensagem){
            System.out.println(msg);
        }
    }

}
