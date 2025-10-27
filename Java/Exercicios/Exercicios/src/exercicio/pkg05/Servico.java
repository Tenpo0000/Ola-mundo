public class Servico {
    private String nome;
    private float valor;

    public Servico(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public static final Servico BanhoTosa = new Servico("Banho e Tosa", 150);
    public static final Servico Vacinacao = new Servico("Vacinação", 50);
    public static final Servico ConsultaVeterinaria = new Servico("Consulta Veterinária", 100);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
