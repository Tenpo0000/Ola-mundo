
package exercicio.pkg02;

public class Exercicio01 {
    public static void main(String[] args) {

        Bola bola1 = new Bola("azul");
        Quadrado quadrado1 = new Quadrado();
        Retangulo retangulo1 = new Retangulo();
        Controle controle1 = new Controle();

         //Bola
        System.out.println(" BOLA: \nA cor da bola atualmete é: " + bola1.getCor());
        bola1.setCor("preto");
        System.out.println("A cor da bola atualmete é: " + bola1.getCor());


         //Quadrado
        System.out.println("\n\n QUADRADO: \nA reta do quadrado atualmente," + quadrado1.getQuadrado());
        quadrado1.setLado(10);
        System.out.println("A reta do quadrado atualmente," + quadrado1.getQuadrado());
        System.out.println("A area é igual a " + quadrado1.calculaArea());

         //Retangulo
        System.out.println("\n\n RETANGULO: \nA base e os parametros e seus valores: \nBase:" + retangulo1.getBase() + " \nAltura: " + retangulo1.getAltura());
        retangulo1.setBase(20);
        retangulo1.setAltura(10);
        
        System.out.println("\nA base e os parametros e seus valores: \nBase:" + retangulo1.getBase() + " \nAltura: " + retangulo1.getAltura());
        System.out.println("\nO perimetro é igual a: " + retangulo1.calculaPerimetro());
        System.out.println("A area é igual a: " + retangulo1.calculaArea());


        //Controle
        System.out.println("\n\n CONTROLE: \nO canal atual é: " + controle1.getCanal());
        controle1.setCanal(202);
        System.out.println("O volume atual é: " + controle1.getVolume());
        controle1.aumentarVolume(96);
        controle1.aumentarVolume(10);
        System.out.println("O volume atual é: " + controle1.getVolume());
        controle1.diminuirVolume(5);
        System.out.println("O volume atual é: " + controle1.getVolume());
    }
}
