import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java . io . *;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader bufferEntrada = new BufferedReader(new InputStreamReader(System . in));
        String stringLectura;
        Coche miCoche = new Coche(0);

        do {
            do {
                System.out.print("agregar puerta al coche? (s/n): ");
                stringLectura = bufferEntrada.readLine();
                stringLectura = stringLectura.toLowerCase();
            } while (!(stringLectura.equals("s") || stringLectura.equals("n")));

            if (stringLectura.equals("s")) {
                // crear objeto de clase coche
                miCoche.anadirPuertas();

                // Imprimir mensaje
                System.out.println("Número de puertas que tiene el objeto: " + miCoche.puertas);
            }
        } while (!stringLectura.equals("n"));
    }
}
