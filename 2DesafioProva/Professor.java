public class Professor extends Pessoa {
    private String titulacao;

    public String getTitulacao(){return this.titulacao;}
    public void setTitulacao(String titulacao){this.titulacao = titulacao;}

    public Professor(String nome,int matricula,String titulacao){
        super(nome,matricula);
        this.titulacao = titulacao;
    }

    @Override
    public void pedirEmprestado(Livro livro){
        if(super.getLista().size() >= 4){
            System.out.println("\nNúmero máximo de livros emprestados. Professor");
        }else{
            super.getLista().add(livro);
        }
    }

    @Override
    public double devolverLivro(Livro livro, int diasAtrasados){
        double taxaMulta = 0;
        if(this.titulacao.equals("mestre")){
            taxaMulta = (0.8*diasAtrasados);
        }else if(this.titulacao.equals("doutor")){
            taxaMulta = (diasAtrasados);
        }
        for(int i = 0; i < super.getLista().size();i++){
            if(super.getLista().get(i).getTitulo().equals(livro.getTitulo())){
                super.getLista().remove(i);
            }
        }
        return taxaMulta;
    }

    @Override
    public double devolverLivro(int diasAtrasados){
        double taxaMulta = 0;
        if(this.titulacao.equals("mestre")){
            taxaMulta = super.getLista().size()*(0.8*diasAtrasados);
        }else if(this.titulacao.equals("doutor")){
            taxaMulta = diasAtrasados*super.getLista().size();
        }
        for(int i = 0; i < super.getLista().size();i++){
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
}
