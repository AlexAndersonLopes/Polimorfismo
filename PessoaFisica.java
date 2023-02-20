package polimorfismoexerciciofixacao;

public class PessoaFisica extends Contribuinte {
    
    private Double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(Double gastoSaude, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }
    
    @Override
    public double imposto(){
        if(rendaAnual <= 20000){
            return rendaAnual / 100 * 15 - (gastoSaude / 2);
        }
        else{
            return rendaAnual / 100 * 25 - (gastoSaude / 2);
        }
    }
    
    
    
}
