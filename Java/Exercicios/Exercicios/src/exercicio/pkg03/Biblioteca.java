import java.util.ArrayList;
import java.util.Scanner;

class Biblioteca {
    private ArrayList<MaterialBiblioteca> materiais;
    Scanner sc = new Scanner(System.in);

    public Biblioteca(){
        this.materiais = new ArrayList<>();
    }

    public void adicionarMaterial(MaterialBiblioteca material){
        materiais.add(material);
    }

    public void listarMaterial(){
        if(materiais.isEmpty()){
            System.out.println("Não tem nenhum material ");
            pause();
        } else {
            for(MaterialBiblioteca material :  materiais) {
                System.out.printf("\n Material: " + material);
            }
        }
        pause();
    }

    public void buscarMaterial(String titulo){
        boolean encontrado = false;

        for(MaterialBiblioteca material : materiais) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.printf("Titulo encontrado!!\n" + material);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.printf("Titulo não encontrado!!");
        }
        pause();
    }

    public void emprestarMaterial(String titulo) {
        for (MaterialBiblioteca material : materiais) {
            if (titulo.equalsIgnoreCase(material.getTitulo())) {
                int resposta;
                System.out.println("Material encontrado! \nDeseja pegar emprestado o material: " + material + "?");
                System.out.println("Digite 1 Para (sim) \nDigite 2 para (não) \nResposta: ");
                resposta = sc.nextInt();
                sc.nextLine();
                switch (resposta) {
                    case 1:
                        System.out.println("Livro emprestado com sucesso!");
                        pause();
                    break;

                    case 2:
                        System.out.println("Emprestimo cancelado!");
                        pause();
                    break;

                    default:
                        System.out.println("Opção invalida");
                        pause();
                    break;
                }
            }
        }
    }

    public void pause() {
        System.out.println("\n\nDigite enter para Sair \n\n");
        sc.nextLine();
    }
}