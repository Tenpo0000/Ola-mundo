import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int op = 0;
    do {
        System.out.printf(
                "===== MENU BIBLIOTECA =====\n"
                + "1 - Adicionar Revista\n"
                + "2 - Adicionar Jornal\n"
                + "3 - Adicionar Livro\n"
                + "4 - Listar Materiais\n"
                + "5 - Buscar por Título\n"
                + "6 – Emprestar Material\n"
                + "7 - Sair \n"
        );

        System.out.printf("\nFaça sua escolha: ");
        op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                System.out.print("\nDigite o título da Revista: ");
                String TituloRevista = sc.nextLine();

                System.out.print("\nDigite o autor da Revista: ");
                String autorRevista = sc.nextLine();

                System.out.print("\nDigite o ano da publicação da Revista: ");
                int publicacaoRevista = sc.nextInt();

                System.out.print("\nDigite a edição da Revista: ");
                int edicaoRevista = sc.nextInt();

                Revista revista = new Revista(TituloRevista, autorRevista, publicacaoRevista, edicaoRevista);
            break;

            case 2:
                System.out.print("\nDigite o título do Jornal: ");
                String TituloJornal = sc.nextLine();

                System.out.print("\nDigite o autor do Jornal: ");
                String autorJornal = sc.nextLine();

                System.out.print("\nDigite o ano da publicação do Jornal: ");
                int publicacaoJornal = sc.nextInt();

                System.out.print("\nDigite a data da edição do  Jornal: ");
                int edicaoJornal = sc.nextInt();

                Jornal jornal = new Jornal(TituloJornal, autorJornal, publicacaoJornal, edicaoJornal);
            break;

            case 3:
                System.out.print("\nDigite o título do livro: ");
                String TituloLivro = sc.nextLine();

                System.out.print("\nDigite o autor do livro: ");
                String autorLivro = sc.nextLine();

                System.out.print("\nDigite o ano da publicação do livro: ");
                int publicacaoLivro = sc.nextInt();

                System.out.print("\nDigite o numero de paginas do livro: ");
                int paginaLivro = sc.nextInt();

                Livro livro = new Livro(TituloLivro, autorLivro, publicacaoLivro, paginaLivro);
            break;

        }
    }  while (op != 7);
}