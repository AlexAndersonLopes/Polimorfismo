package polimorfismoexerciciofixacao;

public class PessoaJuridica extends Contribuinte{
    
    private int qtdFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(int qtdFuncionarios, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }
    
    @Override
    public double imposto(){
        if(qtdFuncionarios < 10){
            return rendaAnual / 100 * 16;
        }
        else{
            return rendaAnual / 100 * 14;
        }
    }
    
    
    
    
}
