// Crear un gestor de playlist de un MP3 player (oden aleatorio). Cada canción tiene un nombre (una sola palabra) y una duración en segundos. El programa debe funcionar con el siguiente fragmento de main.
// Completar todo el programa.

import java.util.ArrayList;

public class Pregutna1 {
    public static void main(String[] args) {
        ArrayList<String> miPlayList = new ArrayList<String>();
        ArrayList<String> miCopia = new ArrayList<String>();
        ArrayList<String> miPlayListAleatorio = new ArrayList<String>();

        llenar(miPlayList, "Ayer");
        llenar(miPlayList, "Hoy");
        llenar(miPlayList, "Mañana");

        copiar(miPlayList, miCopia);
        miPlayListAleatorio = generarPlayListAleatorio(miCopia);

        System.out.println("Mi playList " + miPlayList); // el playlist aleatorio
        System.out.print("Mi PlayList aleatorio " + miPlayListAleatorio); // el playlist aleatorio
    }

    public static void llenar(ArrayList<String> miLista, String nombreCancion) {
        miLista.add(nombreCancion);
    }

    public static void copiar(ArrayList<String> miLista, ArrayList<String> copia) {
        for (String cancion : miLista) {
            copia.add(cancion);
        }
    }

    public static ArrayList<String> generarPlayListAleatorio(ArrayList<String> miLista) {
        ArrayList<String> lista = new ArrayList<String>();
        int numRand;
        for (int i = 0; i < miLista.size(); i++) {
            numRand = (int) (Math.random() * (miLista.size() -1)) + 1;
            lista.add(i, miLista.get(numRand));
            miLista.remove(numRand);
        }
        return lista;
    }
}
