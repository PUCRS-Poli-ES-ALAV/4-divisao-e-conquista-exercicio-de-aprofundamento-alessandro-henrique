public class DivisaoConquista {

    public static void main(String[] args) {
        int[] lista = new int[32];

        for (int i = 0; i < 32; i++) {
            lista[i] = i;
        }

        int[] resposta = questao1(lista);
        System.out.println(resposta.toString());

    }

    public static int[] questao1(int[] lista) {

        if (lista.length == 1) {
            return lista;
        }

        int[] listaMetade1 = new int[lista.length / 2];
        int[] listaMetade2 = new int[lista.length / 2];

        for (int i = 0, k = lista.length / 2; i < lista.length / 2; i++, k++) {
            listaMetade1[i] = lista[i];
            listaMetade2[i] = lista[k];
        }

        listaMetade1 = questao1(listaMetade1);
        listaMetade2 = questao1(listaMetade2);

        for (int i = 0, k = lista.length / 2; i < lista.length / 2; i++, k++) {
            lista[i] = listaMetade1[i];
            lista[k] = listaMetade2[i];
        }

        return lista;
    }

    /*
     * MERGE-SORT(L: List with n elements) : Ordered list with n elements
     * IF (list L has one element)
     * RETURN L.
     * Divide the list into two halves A and B.
     * A ← MERGE-SORT(A).
     * B ← MERGE-SORT(B).
     * L ← MERGE(A, B).
     * RETURN L.
     */

}