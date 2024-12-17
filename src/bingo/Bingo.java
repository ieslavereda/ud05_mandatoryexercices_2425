package bingo;

public class Bingo {
    public static void main(String[] args) {

        int numJugadores = Input.getInteger("Número de jugadores? Mínimo 2 jugadores: ");

        while(numJugadores<=1){
            numJugadores = Input.getInteger("Número de jugadores? Mínimo 2 jugadores: ");
        }

        Jugador[] jugadores = new Jugador[numJugadores];
        for (int i = 0; i < jugadores.length; i++) {
            String nombre = Input.getString("Nombre del jugador: ");
            jugadores[i] = new Jugador(nombre);

        }

        Juego bingo = new Juego(Color.VERDE,90,jugadores);
        bingo.playGame();

        bingo = new Juego(Color.ROJO,50,jugadores);
        bingo.playGame();

    }
}
