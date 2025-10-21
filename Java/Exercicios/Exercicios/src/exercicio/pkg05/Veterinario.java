public class Veterinario extends Pessoa {
    private float salario;
    private String cargo;

    public Veterinario(String nome, String telefone, String email, String usuario, String senha, float salario, String cargo) {
        super(nome, telefone, email, usuario, senha);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "cargo: " + cargo + "Salario: " + salario;
    }

    @Override
    public void exibirDados() {
        System.out.println(this);
    }
}