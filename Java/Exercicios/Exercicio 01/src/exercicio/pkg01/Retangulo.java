package exercicio.pkg01;

public class Retangulo {
    private int base;
    private int altura;

    public int getBase(){
        return base;
    }

    public  void setBase(int base){
        this.base = base;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int calculaArea(){
        int resultado = base * altura;
        return resultado;
    }

    public int calculaPerimetro(){
       int resultado = 2 * (base + altura);
       return resultado;
    }
}
