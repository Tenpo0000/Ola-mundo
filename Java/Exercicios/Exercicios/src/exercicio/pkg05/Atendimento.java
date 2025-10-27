import java.util.ArrayList;

public class Atendimento {
    public static void main(String[] args) {
    }

    private float total;
    private String descricao;
    private ArrayList<Servico> servico;
    private Pet pet;

    public Atendimento(String descricao, Servico servico, Pet pet) {
        this.descricao = descricao;
        this.servico = new ArrayList<>();
        this.servico.add(servico); // adiciona o serviço inicial
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Servico> getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico.add(servico);
    }

    public float calcularTotal() {
        total = 0;
        for (Servico s : servico) {
            total += s.getValor();
        }
        return total;
    }

    public float getValor() {
        return total;
    }
}
