package prototype;

public class Main {
	public static void main(String[] args) {
        Produto livro1 = new Livro("Livro sobre PowerBuilder", 500);
        Produto livro2 = livro1.clone();
        ((Livro) livro2).setPageCount(300);

        Produto eletro1 = new Eletronico("Celularzão tunado", "Mamsung");
        Produto eletro2 = eletro1.clone();
        ((Eletronico) eletro2).setFabricante("Ephone");

        System.out.println("Livro 1: " + ((Livro) livro1).getName() + ", Páginas: " + ((Livro) livro1).getPageCount());
        System.out.println("Livro 2: " + ((Livro) livro2).getName() + ", Páginas: " + ((Livro) livro2).getPageCount());
        System.out.println("Eletrônico 1: " + ((Eletronico) eletro1).getName() + ", Fabricante: " + ((Eletronico) eletro1).getFabricante());
        System.out.println("Eletrônico 2: " + ((Eletronico) eletro2).getName() + ", Fabricante: " + ((Eletronico) eletro2).getFabricante());
    }
}
