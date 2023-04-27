public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("Senhor dos Aneis", "J. R. R. Tolkien");
        Livro livro2 = new Livro("Harry Potter", "sem creditos para vc...");
        Livro livro3 = new Livro("O Hobbit", "J. R. R. Tolkien");
        Livro livro4 = new Livro("Shada","Douglas Adams");
        Livro livro5 = new Livro("O Pequeno Príncipe","Antoine");

        Aluno aluno1 = new Aluno("Gabriel", 1234,"História");
        aluno1.pedirEmprestado(livro1);
        aluno1.pedirEmprestado(livro2);
        aluno1.pedirEmprestado(livro3);
        aluno1.pedirEmprestado(livro4);

        aluno1.devolverLivro(livro3,10);
        aluno1.mostrarLista();

        Professor professor1 = new Professor("Rodrigo", 01,"doutor");

        professor1.pedirEmprestado(livro1);
        professor1.pedirEmprestado(livro2);
        professor1.pedirEmprestado(livro3);
        professor1.pedirEmprestado(livro4);
        professor1.pedirEmprestado(livro5);

        professor1.devolverLivro(livro3,10);
        professor1.devolverLivro(20);
        professor1.mostrarLista();

        Miar alunoTeste = new Aluno("Gato",2,"Gatolandia");
        System.out.println(alunoTeste);
        alunoTeste.miar();
        System.out.println(livro1);

    }
}
