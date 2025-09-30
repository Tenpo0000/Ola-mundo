class Revista extends MaterialBiblioteca {
    private int edicao;

    public Revista(String titulo, String autor, int anopublicacao, int edicao) {
        super(titulo, autor, anopublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("\n Edicão: " + edicao);
    }
}