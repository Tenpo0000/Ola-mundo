import java.util.ArrayList;

public class Clinica {
    public static void main(String[] args) {

    }
    private ArrayList<Veterinario> veterinario = new ArrayList<>();
    private ArrayList<Dono> dono = new ArrayList<>();
    private ArrayList<Atendimento> atendimento = new ArrayList<>();
    private ArrayList<Servico> servico = new ArrayList<>();

    public Clinica(ArrayList<Veterinario> funcionario, ArrayList<Dono> dono, ArrayList<Atendimento> atendimento) {
        this.veterinario = funcionario;
        this.dono = dono;
        this.atendimento = atendimento;
    }

    public void cadastroFuncionario(Veterinario veterinario){
        this.veterinario.add(veterinario);
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
                System.out.println("Funcionário " + i + ": " + f);
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
        System.out.println("Nome do dono: " + dono.getNome());
        dono.listarAnimais();
    }

    public void listarServicos(){
        int i = 1;
        for(Servico s: servico){
            System.out.println("Serviço " + i + ": " + s.getNome() + " Valor: " + s.getValor());
            i++;
        }
    }

    public void listarAtendimentos(){
        int i = 1;
        if(atendimento.isEmpty()){
            System.out.println("Não tem nenhum atendimento");
        } else {
            for (Atendimento a : atendimento) {
                System.out.println("Atendimento " + i + ": Paciente: " + a.getPet().getNome() + " Serviço: " + a.getServico() + " Valor: " + a.getValor());
                i++;
            }
        }
    }

    public void buscarFuncionario(String nomeFuncionario){
        boolean verificacao = false;
        for(Veterinario f : veterinario){
            if(f.getNome().equalsIgnoreCase(nomeFuncionario)){
                System.out.println("Funcionário encontrado!");
                verificacao = true;
                break;
            }
        }
        if(!verificacao){
            System.out.println("Funcionário não encontrado!");
        }
    }

    public void buscarDono(String nomeDono){
        boolean verificacao = false;
        for(Dono d : dono){
            if(d.getNome().equalsIgnoreCase(nomeDono)){
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
        boolean encontrado = false;
        int i = 1;
        for(Dono d : dono){
            for(Pet p : d.getAnimal()){
                if(p.getNome().equalsIgnoreCase(nomeAnimal)){
                    System.out.println("Animal " + i + ": Nome: " + p.getNome() + " Espécie: " + p.getEspecie());
                    encontrado = true;
                    i++;
                }
            }
        }
        if(!encontrado){
            System.out.println("Animal não encontrado!");
        }
    }
}
