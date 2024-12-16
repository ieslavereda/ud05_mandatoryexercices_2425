package bingo;

public class Bingo {
    public static void main(String[] args) {
        Juego bingo = new Juego();
        int numJugadores = Input.getInteger("Número de jugadores? Mínimo 2 jugadores: ");
        while(numJugadores<=1){
            numJugadores = Input.getInteger("Número de jugadores? Mínimo 2 jugadores: ");
        }
        bingo.startGame(Color.VERDE,90,numJugadores);
        bingo.startGame(Color.ROJO,50,2);
    }
}
