import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Ordenador ordenador = new Ordenador();
        ArrayList<Pais> paises = ordenador.lerArquivo();
        System.out.println("TABELA APÓS ORDENAR: -----------\n");
        ordenador.ordenarPaisesConsumoVinho(paises);
        ordenador.imprimirPaisesConsumo(paises);
    }
}