public class Main {
    public static void main(String args[]){
        AmigoTrabalho amigoJob = new AmigoTrabalho("Gabriel",12,"TI");
        AmigoInfancia amigoInf = new AmigoInfancia("Jose",111,5);
        AmigoInfancia amigoInf2 = new AmigoInfancia("zico",1,3);
        AmigoTrabalho amigoJob2 = new AmigoTrabalho("JV",113,"teste");
        Agenda minhaAgenda = new Agenda();

        Miar pessoaGato = new AmigoInfancia("Gatinho",123,1);

        minhaAgenda.adicionarPessoa(amigoJob);
        minhaAgenda.adicionarPessoa(amigoInf);
        minhaAgenda.adicionarPessoa(amigoInf2);
        minhaAgenda.adicionarPessoa(amigoJob2);
        //minhaAgenda.procurarPessoa(12);

        minhaAgenda.mostrarContatos("teste");
        pessoaGato.miar();

        Mensagem mensagem1 = new Mensagem("Oi krido",amigoJob2);

        minhaAgenda.enviarMensagem(113,mensagem1);
        minhaAgenda.mostrarMensagens();
    }
}
