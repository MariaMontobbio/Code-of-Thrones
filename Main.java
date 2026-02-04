import java.util.Scanner;
import Personajes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Code of Thrones\n");

        int num_jugadores = NumJugadores();

        switch (EscogerPersonaje(1)) {
            case 1:
                Guerrer p1 = new Guerrer("HENRY", 20, 100, 15);
                break;
            case 2:
                Mag p1 = new Mag("HENRY", 10, 100, 500);
                break;
            case 3:
                Monstre p1 = new Monstre("HENRY", 5, 100);
                break;
        }

        int pers_p2;
        //(int)(Math.random() * (max - min + 1) + min);
        if(num_jugadores == 1) pers_p2 = (int) (Math.random() * (3 - 1 + 1) + 1);
        else pers_p2 = EscogerPersonaje(2);

        switch (pers_p2) {
            case 1:
                Guerrer p2 = new Guerrer("HENRY", 20, 100, 15);
                break;
            case 2:
                Mag p2 = new Mag("HENRY", 10, 100, 500);
                break;
            case 3:
                Monstre p2 = new Monstre("HENRY", 5, 100);
                break;
        }

    }

    public static int NumJugadores() {
        Scanner sc = new Scanner(System.in);

        int num_jugadores = 0;
        do {
            System.out.println("Escoge el numero de jugadores entre 1 o 2 jugadores: ");
            num_jugadores = sc.nextInt();

            if(num_jugadores < 0 || 2 < num_jugadores) System.out.println("Este juego es para 1 o 2 jugadores");

        } while(num_jugadores < 0 || 2 < num_jugadores);

        return num_jugadores;
    }

    public static int EscogerPersonaje(int player) {
        Scanner sc = new Scanner(System.in);

        int opcion_personaje = 0;
        do {
            System.out.println("Jugador " + player + " escoge el presonaje que quieres ser\n");
            System.out.println("1. Guerrero");
            System.out.println("2. Mago");
            System.out.println("3. Monstruo");

            opcion_personaje = sc.nextInt();

        } while (opcion_personaje < 0 || 3 < opcion_personaje);

        return opcion_personaje;
    }
}