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
            System.out.println("A sua lista está vazia");
        } else {
            for(MaterialBiblioteca material :  materiais) {
                System.out.printf("\n Material: " + material);
            }
        }
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
    }

    public void emprestarMaterial(String titulo) {
        System.out.println("Materias disponiveis: ");
        listarMaterial();
        for (MaterialBiblioteca material : materiais) {
            if (titulo.equalsIgnoreCase(material.getTitulo())) {
                int resposta;
                System.out.println("Material encontrado! \n Deseja pegar emprestado o material: " + material + "?");
                System.out.println("Digite 1 Para sim \n  Digite 2 para não");
                resposta = sc.nextInt();
                sc.nextLine();
                switch (resposta) {
                    case 1:
                        System.out.println("Livro emprestado com sucesso!");
                    break;

                    case 2:
                        System.out.println("Emprestimo cancelado!");
                    break;

                    default:
                        System.out.println("Opção invalida");
                    break;
                }
            }
        }
    }
}