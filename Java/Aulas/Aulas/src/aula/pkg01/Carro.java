
package aula.pkg01;

class Carro {
    private String modelo; 
    private int ano;
    private int velocidadeAtual;
    private int velocidade;
    
    public Carro(){
    }
        
    public String getModelo(){
        return modelo;
    }
    
    public int getAno(){
        return ano;
    }
    
    public int getVelocidadeAtual (){
        return velocidadeAtual;
    } 
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setAno(int ano){
        if (ano > 2025 || ano < 1900) {
            System.out.println("Ano invalido \n são aceito apenas carro de 1900 até 2024");
            return;
        }
        this.ano = ano;
    }
    
    public Carro (String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void ligar(){
        velocidadeAtual = 0;
        System.out.println("\n O" + modelo + " esta na ligado!!");
        System.out.println(" Velocidade Atual:" + velocidadeAtual);
    }
    
    public void Acelerar(int velocidade){
        this.velocidadeAtual += velocidade;
        System.out.println("Velocidade atual do" + modelo + ": "+ velocidadeAtual);
    }
}