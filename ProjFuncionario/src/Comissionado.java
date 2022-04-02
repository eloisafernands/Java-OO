public class Comissionado extends Funcionario{
    public double valorTotal;
    public double percentual;
    
    public double CalcularSalario(){
        double salario = this.valorTotal*this.percentual/100;
        return salario;
    }
}
