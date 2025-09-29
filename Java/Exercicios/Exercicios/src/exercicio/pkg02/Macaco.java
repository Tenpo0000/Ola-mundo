package exercicio.pkg02;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    private List<Object> estomago;
    private String nome;
    private static List<Macaco> todosOsMacacos = new ArrayList<>();

    public Macaco (String nome) {
      this.nome = nome;
      this.estomago = new ArrayList<>();
      todosOsMacacos.add(this);
      System.out.println("Macaco de nome " + nome + " foi criado com sucesso!\n");
    }

    public String toString() { //para não bugar o nome do objeto
        return nome;
    }

    public String getNome(){
        return nome;
    }

    public void getEstomago(){
       System.out.println("estomago de " + getNome() + ": " + this.estomago);
    }

    public void Comer(Alimentos alimento) {
        for (Macaco m : new ArrayList<>(todosOsMacacos)) {
            if (m.getNome().equalsIgnoreCase(alimento)) { //compara strings ignorando letras MAIUSCULAS
                if (m == this) {
                    System.out.println("A fome pode estar grande, mas não o suficiente para se comer, \nvamos ter limites");
                     return;
                } else {
                    todosOsMacacos.remove(m);
                    estomago.add(m);
                    System.out.println("\n" + getNome() + " é um canibal ele comeu seu proprio amiguinho " + alimento + " que mizeravel passa fome");
                    getEstomago();
                   return;
                }
            }
        }
        this.estomago.add(alimento);
        System.out.println("\n" + nome + " Comeu " + alimento);
        getEstomago();
    }

    public void digerir(){
        for(Object obj : estomago){
            if (obj instanceof Macaco){
                Macaco m = (Macaco) obj;
                System.out.println("\no troxa do " + getNome() + " Teve indisgestão por ter comido seu amigo " + m.getNome());
            }
        }
        estomago.clear();
        System.out.println("\n" + nome + " Fez sua digestão e seu estomago esta vazio.");
        getEstomago();
    }
}