import java.util.ArrayList;

class Biblioteca {
    private ArrayList<MaterialBiblioteca> materiais;

    public Biblioteca(ArrayList<MaterialBiblioteca> materiais) {
        this.materiais = materiais;
    }

    public void adicionarMaterial(MaterialBiblioteca material){
        materiais.add(material);
    }

    public void listarMateriais(){
        if(materiais.isEmpty()){
            System.out.printf("\nA lista esta vazia!");
        } else {
            for(MaterialBiblioteca material : materiais ) {
                System.out.println("\n Material: " + materiais);
            }
        }
    }

    public void buscarMaterial(String titulo){
        for(MaterialBiblioteca material : materiais){
            if(material.getTitulo() .equalsIgnoreCase(titulo)){
                return;
            } else {
                System.out.printf("Titulo não encontrado!!");
                return;
            }
        }
    }
}