package bingo;

public class Juego {
    private Bombo bombo;
    private Jugador[] jugadores;

    public void startGame(Color color, int numBolas, int numJugadores){
        bombo = new Bombo(numBolas,color);
        jugadores = new Jugador[numJugadores];
        for (int i = 0; i < jugadores.length; i++) {
            String nombre = Input.getString("Nombre del jugador: ");
            jugadores[i] = new Jugador(nombre);
            jugadores[i].setCarton(new Carton(numBolas));
            System.out.println(jugadores[i]);
        }
        Jugador ganador = playGame();
        if (ganador!=null)
            System.out.println("El ganador es: "+ganador.getNombre());
        else
            System.out.println("Ha habido un gran problema");
    }

    private Jugador playGame(){
        while(true){
            Bola bola = bombo.sacarBola();
            if(bola==null)
                return null;
            System.out.println("La bola sacada es: " + bola);
            for (Jugador jugador:jugadores){
                if(jugador.getCarton().marcarCarton(bola.getNumero())==-1){
                    return jugador;
                }
                System.out.println(jugador);
            }
        }
    }

}
