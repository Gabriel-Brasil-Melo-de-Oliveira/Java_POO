public class Elevador {
    private int andarAtual;
    private int totalDeAndares;
    private double capacidadeElevador;
    private int quantidadeDePessoas;

    public Elevador(double capacidadeElevador,int totalDeAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalDeAndares = totalDeAndares;
        this.andarAtual = 0;
        this.quantidadeDePessoas = 0;
    }

    public boolean entra(){
        if(this.capacidadeElevador > this.quantidadeDePessoas){
            this.quantidadeDePessoas += 1;
            System.out.println("\nPessoa adicionada com sucesso!\nCapacidade: " + this.capacidadeElevador + "\nQuantidade: " + this.quantidadeDePessoas);
            return true;
        }else{
            System.out.println("\nCapacidade maxima atingida não é possivel adicionar uma nova pessoa \nCapacidade: " + this.capacidadeElevador + "\nQuantidade: " + this.quantidadeDePessoas);
            return false;
        }
    }

    public void sai(){
        if(this.quantidadeDePessoas > 0){
            this.quantidadeDePessoas -= 1;
            System.out.println("\nPessoa removida com sucesso!\nCapacidade: " + this.capacidadeElevador + "\nQuantidade: " + this.quantidadeDePessoas);
        }else{
            System.out.println("\nNão possui pessoas no elevador\nAndar atual: " + this.andarAtual + "\nTotal de andares: " + this.totalDeAndares);
        }
    }

    public void sobe(){
        if(this.andarAtual == this.totalDeAndares){
            System.out.println("\nJá está no andar máximo!");
        }else{
            this.andarAtual += 1;
            System.out.println("\nSubiu de andar \nAndar atual: " + this.andarAtual + "\nTotal de andares: " + this.totalDeAndares);
        }
    }
    public void sobe(int andarDesejado){
        if(this.andarAtual == this.totalDeAndares){
            System.out.println("\nJá está no andar máximo!");
        }else{
            this.andarAtual = andarDesejado;
            System.out.println("\nSubiu de andar \nAndar atual: " + this.andarAtual + "\nTotal de andares: " + this.totalDeAndares);
        }
    }
}
