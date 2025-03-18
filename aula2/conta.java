

public class conta extends cliente {

    //Declaração dos atributos

    private double Saldo = 0;

    private String Nome;

    //Declaração dos metodos

    public void depositar(double Valor){
        this.Saldo = this.Saldo + Valor + (Valor * 0.10);
    }

    public double getSaldo (){
        return this.Saldo;
    }

    public void setNome (String Nome){
        this.Nome = Nome;
    }

    public String getNome(){
        return this.Nome;
    }
}
