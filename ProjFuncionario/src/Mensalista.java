public class Mensalista extends Funcionario{
    public double salarioBase;
    public double desconto;
    
    public double CalcularSalario(){
        double salario = this.salarioBase-this.desconto;
        return salario;
    }
}
