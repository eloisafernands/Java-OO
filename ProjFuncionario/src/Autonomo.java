public class Autonomo extends Funcionario{
    public double valorHora;
    public double numHora;
    
    public double CalculaSalario(){
        double salario = this.valorHora*this.numHora;
        return salario;
    }
}

