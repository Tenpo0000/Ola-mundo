import java.util.ArrayList;

public class Clinica {
    private ArrayList<Veterinario> veterinario = new ArrayList<>();
    private ArrayList<Dono> dono = new ArrayList<>();
    private ArrayList<Atendimento> atendimento = new ArrayList<>() ;

    public Clinica(ArrayList<Veterinario> funcionario, ArrayList<Dono> dono, ArrayList<Atendimento> atendimento) {
        this.veterinario = funcionario;
        this.dono = dono;
        this.atendimento = atendimento;
    }

    public void cadastroFuncionario(Veterinario Veterinario){
        this.veterinario.add(Veterinario);
    }

    public void cadastroDono(Dono dono, Pet animal){
        this.dono.add(dono);
        dono.adicionarAnimal(animal);
    }

    public void listarFuncionario(){
        if(veterinario.isEmpty()){
            System.out.println("Não existem funcionários cadastrados!");
        } else {
            int i = 1;
            for (Veterinario f : veterinario){
                System.out.println("Funcionário" + i + ": " +  f);
                i++;
            }
        }
    }

    public void listarDono(){
        if(dono.isEmpty()){
            System.out.println("Não existem Donos cadastrados!");
        } else {
            int i = 1;
            for(Dono d : dono){
                System.out.println("Dono " + i + ": " + d);
                i++;
            }
        }
    }

    public void listarTodosAnimais(){
        int i = 1;
        for(Dono d: dono){
            for(Pet p  : d.getAnimal()){
                System.out.println("Animal " + i + ": " + p.getNome() + " Dono: " + d.getNome());
                i++;
            }
        }
    }

    public void listarAnimalPorDono(Dono dono){
        System.out.println("nome do dono: " + dono.getNome());
        dono.listarAnimais();
    }

    public void buscarFuncionario(String nomeFuncionario){
        boolean verificacao = false;
        for(Veterinario f : veterinario){
            if(f.getNome().equalsIgnoreCase(nomeFuncionario)){
                System.out.println("Funcionario encontrado!");
                verificacao = true;
                break;
            }
        }
        if(!verificacao){
            System.out.println("Funcionario não encontrado!");
        }
    }

    public void buscarDono(String NomeDono){
        boolean verificacao = false;
        for(Dono d : dono){
            if(d.getNome().equalsIgnoreCase(NomeDono)){
                System.out.println("Dono encontrado!");
                verificacao = true;
                break;
            }
        }
        if(!verificacao){
            System.out.println("Dono não encontrado!");
        }
    }

    public void buscarAnimal(String nomeAnimal){
        boolean verificacao = true;
        int i = 0;
        for(Dono d : dono){
            for(Pet p : d.getAnimal()){
                if(p.getNome().equalsIgnoreCase(nomeAnimal)){
                    System.out.println(i + ": nome" + p.getNome() + "Especie: " + p.getEspecie());
                    verificacao = false;
                    i++;
                }
            }
            if(!verificacao){
                System.out.println("Animal Não encontrado!");
            }
        }
    }
}