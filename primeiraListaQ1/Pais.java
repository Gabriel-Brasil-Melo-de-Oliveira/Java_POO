import java.util.ArrayList;

public class Pais {
    private String nomeDoPais;
    private String nomeDaCapitalDoPais;
    private double dimensaoPais;
    private ArrayList<Pais> listaDePaisesQueFazemFronteira;

    public Pais(String nomeDoPais,String nomeDaCapitalDoPais,double dimensaoPais){
        this.nomeDaCapitalDoPais = nomeDaCapitalDoPais;
        this.nomeDoPais = nomeDoPais;
        this.dimensaoPais = dimensaoPais;
        listaDePaisesQueFazemFronteira = new ArrayList<Pais>();
    }

    public String getNomeDoPais(){return this.nomeDoPais;}
    public void setNomeDoPais(String nomeDoPais){this.nomeDoPais = nomeDoPais;}

    public String getNomeDaCapitalDoPais(){return this.nomeDaCapitalDoPais;}
    public void setNomeDaCapitalDoPais(String nomeDaCapitalDoPais){this.nomeDaCapitalDoPais = nomeDaCapitalDoPais;}

    public double getDimensaoPais(){return this.dimensaoPais;}
    public void setDimensaoPais(double dimensaoPais){this.dimensaoPais = dimensaoPais;}

    public boolean verificarSeOsPaisesSaoIguais(Pais pais2){
        if(this.getNomeDoPais().equals(pais2.getNomeDoPais()) && this.getNomeDaCapitalDoPais().equals(pais2.getNomeDaCapitalDoPais())){
            System.out.println("\nO país " + this.getNomeDoPais() + " é igual ao país " + pais2.getNomeDoPais());
            return true;
        }else{
            System.out.println("\nO país " + this.getNomeDoPais() + " é diferente do país " + pais2.getNomeDoPais());
            return false;
        }
    }

    public void definirFronteira(Pais paisAdicionado){
        if(this.getNomeDoPais().equals(paisAdicionado.getNomeDoPais())){
            System.out.println("\nPaís não faz fronteira com ele mesmo! ");
        }else{
            this.listaDePaisesQueFazemFronteira.add(paisAdicionado);
            System.out.println("\nPaís adicionado a fronteira");
        }
    }

    public void buscarNomeCapitalDosPaisesQueFazemFronteira(){
        System.out.println("\nPaís escolhido " + this.getNomeDoPais());
        for(Pais p: listaDePaisesQueFazemFronteira){
            System.out.println("\nFaz fronteira com " + p.getNomeDoPais() + " sendo a capital: " + p.getNomeDaCapitalDoPais());
        }
    }

}
