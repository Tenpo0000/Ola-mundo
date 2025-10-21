class Jornal extends MaterialBiblioteca {
    private int dataedicao;

    public Jornal(String titulo, String autor, int anopublicacao, int dataedicao) {
        super(titulo, autor, anopublicacao);
        this.dataedicao = dataedicao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("\n Edicão: " + dataedicao);
    }

    @Override
    public String toString() {
        return "Jornal - " + super.toString() + ", Edição: " + dataedicao;
    }

}