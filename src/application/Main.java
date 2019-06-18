package application;

import aula07.Lutador;

public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[4];
        l[0] = new Lutador("Boy Pretty", "França", 35, 1.75f,
                68.0f, 12, 4, 1);

        l[1] = new Lutador("Trememe", "Brasil", 25, 1.68f,
                78.0f, 10, 2, 0);


        l[2] = new Lutador("Jorge Amorin", "Japão", 38, 1.85f,
                88.0f, 10, 1, 4);


        l[3] = new Lutador("Anderson Meira", "Russia", 29, 1.68f, 120.5f, 10,
                1, 0);

        //Esolher Lutador
        l[3].status();
    }
}
