public class DepartamentoCC extends Departamento {

    public DepartamentoCC(int parCodigo,String parNome){
        super(parCodigo,parNome);
    }

    public void calcularSalario() {
        for (Colaborador pessoa : super.getListaColaborador()) {
            if (pessoa instanceof ColaboradorComissionado) {
                ColaboradorComissionado pessoaComissionado = (ColaboradorComissionado) pessoa;
                pessoaComissionado.setSalario((pessoaComissionado.getValorPercentualComissao() * pessoaComissionado.getValorTotalDeVendas()));
            }
        }
    }

    public void relatorio(){//SUPER IMPORTANTE instanceof + cast
        for(Colaborador pessoa: super.getListaColaborador()){
            if(pessoa instanceof ColaboradorComissionado){
                ColaboradorComissionado pessoaComissionado = (ColaboradorComissionado) pessoa;
                System.out.println(pessoaComissionado);
            }
        }
    }
    
}
