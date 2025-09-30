class Livro extends MaterialBiblioteca {
    private int NumeroDePaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int paginaLivro) {
        super(titulo, autor, anoPublicacao);
        this.NumeroDePaginas = NumeroDePaginas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("\n Numero de paginas : " + NumeroDePaginas);
    }
}