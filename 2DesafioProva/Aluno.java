public class Aluno extends Pessoa implements Miar {
    private String cursoMatriculado;

    public String getCursoMatriculado(){return this.cursoMatriculado;}
    public void setCursoMatriculado(String cursoMatriculado){this.cursoMatriculado = cursoMatriculado;}

    public Aluno(String nome, int matricula, String cursoMatriculado){
        super(nome,matricula);
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public void pedirEmprestado(Livro livro){
        if(super.getLista().size() >= 3){
            System.out.println("\nNúmero máximo de livros emprestados. Aluno");
        }else{
            super.getLista().add(livro);
        }
    }

    @Override
    public double devolverLivro(Livro livro, int diasAtrasados){
        double taxaMulta = 0;
        if(diasAtrasados > 7){
            taxaMulta = (0.5*diasAtrasados);
        }
        for(int i = 0; i < super.getLista().size();i++){
            if(super.getLista().get(i).getTitulo().equals(livro.getTitulo())){
                super.getLista().remove(i);
            }
        }
        System.out.println("\nMulta: " + taxaMulta);

        return taxaMulta;
    }

    @Override
    public double devolverLivro(int diasAtrasados){
        double taxaMulta = 0;
        if(diasAtrasados > 7){
            taxaMulta = super.getLista().size()*(0.5*diasAtrasados);
        }
        for(int i = super.getLista().size() - 1; i>= 0; i--){
            super.getLista().remove(i);
        }
        System.out.println("\nMulta: " + taxaMulta);
        return taxaMulta;
    }

    public void mostrarLista(){
        for(Livro livro: super.getLista()){
            System.out.println(livro);
        }
    }

    public String toString(){
        return "\nCurso matriculado: " + this.cursoMatriculado;
    }

    public void miar(){
        System.out.println("MIAAAUUU");
    } 

}
