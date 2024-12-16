package bingo;

public class Juego {
    private Bombo bombo;
    private Jugador[] jugadores;

    public void startGame(Color color, int numBolas, int numJugadores){
        bombo = new Bombo(numBolas,color);
        jugadores = new Jugador[numJugadores];
        for(Jugador jugador:jugadores){

        }

    }

}
