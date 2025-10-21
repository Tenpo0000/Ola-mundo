import java.util.Scanner;

class biblioteca2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        Revista revista4 = new Revista("lula molusco", "Laerte", 2025, 1);
        biblioteca.adicionarMaterial(revista4);

        Livro livro2 = new Livro("sei la", "JalambiPau", 2025, 250);
        biblioteca.adicionarMaterial(livro2);

        Jornal jornal5 = new Jornal("Yuri e os negões", "Matheus", 2025, 2025);
        biblioteca.adicionarMaterial(jornal5);

        Livro livro1 = new Livro("bob esponja", "kirito", 2025, 1);
        biblioteca.adicionarMaterial(livro1);

        Revista revista2 = new Revista("patric estrela", "Laerte", 2025, 1);
        biblioteca.adicionarMaterial(revista2);

        int op = 0;

        do {
            System.out.printf(
                    "===== MENU BIBLIOTECA =====\n"
                            + "1 - Adicionar Revista\n"
                            + "2 - Adicionar Jornal\n"
                            + "3 - Adicionar Livro\n"
                            + "4 - Listar Materiais\n"
                            + "5 - Buscar por Título\n"
                            + "6 - Emprestar Material\n"
                            + "7 - Sair \n"
            );

            System.out.printf("\nFaça sua escolha : ");
            String teste = sc.nextLine();

            try {
                op = Integer.parseInt(teste);

                switch (op) {
                    case 1:
                        System.out.print("\nDigite o título da Revista : ");
                        String tituloRevista = sc.nextLine();

                        System.out.print("\nDigite o autor da Revista : ");
                        String autorRevista = sc.nextLine();

                        System.out.print("\nDigite o ano da publicação da Revista : ");
                        int publicacaoRevista = sc.nextInt();

                        System.out.print("\nDigite a edição da Revista : ");
                        int edicaoRevista = sc.nextInt();
                        sc.nextLine(); // limpar buffer

                        Revista revista = new Revista(tituloRevista, autorRevista, publicacaoRevista, edicaoRevista);
                        biblioteca.adicionarMaterial(revista);
                        break;

                    case 2:
                        System.out.print("\nDigite o título do Jornal : ");
                        String tituloJornal = sc.nextLine();

                        System.out.print("\nDigite o autor do Jornal : ");
                        String autorJornal = sc.nextLine();

                        System.out.print("\nDigite o ano da publicação do Jornal : ");
                        int publicacaoJornal = sc.nextInt();

                        System.out.print("\nDigite a data da edição do Jornal : ");
                        int edicaoJornal = sc.nextInt();
                        sc.nextLine();

                        Jornal jornal = new Jornal(tituloJornal, autorJornal, publicacaoJornal, edicaoJornal);
                        biblioteca.adicionarMaterial(jornal);
                        break;

                    case 3:
                        System.out.print("\nDigite o título do livro: ");
                        String tituloLivro = sc.nextLine();

                        System.out.print("\nDigite o autor do livro: ");
                        String autorLivro = sc.nextLine();

                        System.out.print("\nDigite o ano da publicação do livro: ");
                        int publicacaoLivro = sc.nextInt();

                        System.out.print("\nDigite o número de páginas do livro: ");
                        int paginaLivro = sc.nextInt();
                        sc.nextLine();

                        Livro livro = new Livro(tituloLivro, autorLivro, publicacaoLivro, paginaLivro);
                        biblioteca.adicionarMaterial(livro);
                        break;

                    case 4:
                        biblioteca.listarMaterial();
                        break;

                    case 5:
                        System.out.print("Qual título deseja procurar? ");
                        String procurarTitulo = sc.nextLine();
                        biblioteca.buscarMaterial(procurarTitulo);
                        break;

                    case 6:
                        System.out.println("Materiais disponíveis: ");
                        biblioteca.listarMaterial();
                        System.out.print("Qual título você procura? ");
                        String procurar = sc.nextLine();
                        biblioteca.emprestarMaterial(procurar);
                        break;

                    case 7:
                        System.out.println("Finalizando atendimento...");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("\nDigita certo caralho");
            }

        } while (op != 7);

        sc.close();
    }
}
