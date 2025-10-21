import  java.util.ArrayList;
public class Dono extends Pessoa{
    private ArrayList<Pet> animal;

    public Dono(String nome, String telefone, String email, String usuario, String senha) {
        super(nome, telefone, email, usuario, senha);
        animal = new ArrayList<>();
    }

    public ArrayList<Pet> getAnimal() {
        return animal;
    }

    public void setAnimal(ArrayList<Pet> animal) {
        this.animal = animal;
    }

    public void adicionarAnimal(Pet animal){
        this.animal.add(animal);
    }

    public void listarAnimais(){
        if(animal.isEmpty()){
            System.out.println("Não existem animais cadastrados");
        } else {
            for(Pet animal : animal){
                System.out.println("Pet: " + animal.getNome() + "Especie: " + animal.getEspecie());
            }
        }
    }

    public void buscarAnimal(String nomeAnimal){
        boolean verificacao = false;
        for(Pet p : animal){
            if(p.getNome().equalsIgnoreCase(nomeAnimal)){
                System.out.println("Animal encontrado!");
                verificacao = true;
                break;
            }
        }

        if(!verificacao){
            System.out.println("Animal não encontrado!");
        }
    }

    @Override
    public String toString(){
        return "Dono" + super.toString();
    }

    @Override
    public void exibirDados() {
        System.out.println(this);
    }
}