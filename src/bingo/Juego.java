package bingo;

public class Juego {
    private Bombo bombo;
    private Jugador[] jugadores;
    private Color color;
    private int numBolas;
    
    public Juego(Color color, int numBolas, Jugador[] jugadores){
        this.color=color;
        this.numBolas=numBolas;
        this.jugadores=jugadores;
        this.bombo = new Bombo(numBolas,color);

        //Asignamos los cartones
        for(Jugador jugador:jugadores){
            jugador.setCarton(new Carton(numBolas));
            System.out.println(jugador);
        }

    }

    public void playGame(){
        Jugador[] ganadores = new Jugador[jugadores.length];
        int posicion=0;

        while(ganadores[0]==null){
            Bola bola = bombo.sacarBola();
            System.out.println("La bola sacada es: " + bola);
            System.out.println(bombo);
            for (Jugador jugador:jugadores){
                if(jugador.getCarton().marcarCarton(bola.getNumero())==-1){
                    ganadores[posicion++]=jugador;
                }
                System.out.println(jugador);
            }
            esperar(1000);
        }

        for(Jugador ganador:ganadores){
            if (ganador!=null)
                System.out.println("El ganador es: "+ganador.getNombre());
        }

    }

    private static void esperar(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
