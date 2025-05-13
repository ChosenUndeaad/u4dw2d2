import java.util.*;

public class Esercizio2 {

    public static List<Integer> generaListaCasuale(int N) {
        Random rand = new Random();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            lista.add(rand.nextInt(101));
        }

        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> raddoppiaConInverso(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista);

        List<Integer> inversa = new ArrayList<>(lista);
        Collections.reverse(inversa);

        nuovaLista.addAll(inversa);
        return nuovaLista;
    }

    public static void stampaPariODispari(List<Integer> lista, boolean pari) {
        System.out.println(pari ? "Valori in posizioni pari:" : "Valori in posizioni dispari:");

        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println("Indice " + i + ": " + lista.get(i));
            } else if (!pari && i % 2 != 0) {
                System.out.println("Indice " + i + ": " + lista.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un intero N: ");
        int N = scanner.nextInt();

        List<Integer> listaCasuale = generaListaCasuale(N);
        System.out.println("Lista casuale ordinata: " + listaCasuale);

        List<Integer> listaDoppia = raddoppiaConInverso(listaCasuale);
        System.out.println("Lista con elementi + inversi: " + listaDoppia);

        System.out.print("Vuoi stampare le posizioni pari? (true/false): ");
        boolean stampaPari = scanner.nextBoolean();

        stampaPariODispari(listaDoppia, stampaPari);

        scanner.close();
    }
}
