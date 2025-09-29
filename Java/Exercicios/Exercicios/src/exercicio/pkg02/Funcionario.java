package exercicio.pkg02;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return  nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void aumentoDeSalario(double percentualDeAumento){
        salario += salario * (percentualDeAumento / 100);
    }
}