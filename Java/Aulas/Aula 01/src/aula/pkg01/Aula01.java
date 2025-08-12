package aula.pkg01;

public class Aula01 {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();
        Carro car3 = new Carro(" Fiurino 2 portas", 2009);
        
        car1.setAno (1997);
        car1.setModelo(" Honda civic");
        
        car2.setAno (2006);
        car2.setModelo( " Fiat Uno com escada no teto");
        
        System.out.println("Carros registrados: ");
        System.out.println("");
        
        System.out.print(car1.getAno());
        System.out.println(car1.getModelo());
        
        System.out.print(car2.getAno());
        System.out.println(car2.getModelo());
        
        System.out.println(car3.getAno() + car3.getModelo());
        
        car1.ligar();
        car1.Acelerar(90);
        car1.Acelerar(10);
    };
}