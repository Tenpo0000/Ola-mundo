class Jornal extends MaterialBiblioteca {
    private String dataEdicao;

    public Jornal(String titulo, String autor, int anopublicacao, String dataEdicao) {
        super(titulo, autor, anopublicacao);
        this.dataEdicao = dataEdicao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes;
        System.out.println("\n Data de Edição: " + dataEdicao);
    }
}