import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordenador {

    public ArrayList<Pais> lerArquivo() {
        ArrayList<Pais> paises = new ArrayList<>();
        String linha;
        String csvArquivo = "drinks.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvArquivo))) {
            br.readLine();
                while ((linha = br.readLine()) != null) {
                    String[] campos = linha.split(",");
                    double campo1 = Double.parseDouble(campos[1]);
                    double campo2 = Double.parseDouble(campos[2]);
                    double campo3 = Double.parseDouble(campos[3]);
                    Pais pais = new Pais(campos[0], campo1, campo2, campo3);
                    paises.add(pais);
                }
            } catch (IOException e) {
                e.printStackTrace();
                }
            return paises;
    }

    public void imprimirPaisesConsumo(ArrayList<Pais> paises) {
        for (Pais pais : paises) {
            System.out.println("País: " + pais.nome);
            System.out.println("Consumo Cerveja: " + pais.consumoBeer);
            System.out.println("Consumo Bebidas Religiosas: " + pais.consumoSpirits);
            System.out.println("Consumo Vinho: " + pais.consumeWine);
            System.out.println("------------------------------");
        }
    }

    public void ordenarPaisesConsumoVinho(ArrayList<Pais> paises) {
        Collections.sort(paises, new Comparator<Pais>() {
            @Override
            public int compare(Pais p1, Pais p2) {
                return Double.compare(p1.getConsumeWine(), p2.getConsumeWine());
            }
        });
    }    

}
