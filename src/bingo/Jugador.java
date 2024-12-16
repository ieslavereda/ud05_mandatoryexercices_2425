package bingo;

public class Jugador {
    private String nombre;
    private double saldo;
    private Carton carton;

    public Jugador(String nombre){
        saldo = 20.0;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public Carton getCarton() {
        return carton;
    }

    public void setCarton(Carton carton) {
        this.carton = carton;
    }

    @Override
    public String toString(){
        return "Jugador: " + nombre + " saldo: " + saldo + " carton: " + carton;
    }

}
