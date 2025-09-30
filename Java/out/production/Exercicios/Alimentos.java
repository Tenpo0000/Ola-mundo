package exercicio.pkg02;

import java.util.ArrayList;
import java.util.List;

public class Alimentos {
    private String nome;
    private float kcal;
    private static List<Alimentos> todosAlimentos = new ArrayList<>();

    public Alimentos(String nome, float kcal){
        this.nome = nome;
        this.kcal = kcal;
        todosAlimentos.add(this);
    }

    public String getNome(){
        return nome;
    }

    public float getKcal(){
        return kcal;
    }
}