package exercicio.pkg01;

public class Quadrado {
    private int lado1;

    public String getQuadrado(){
        return "Lado: " + lado1;
    }

    public void setLado(int lado1){
        this.lado1 = lado1;
    }

    public int calculaArea(){
        int resultado;
        resultado = lado1 * lado1;
        return resultado;
    }
}
