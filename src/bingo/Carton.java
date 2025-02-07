package bingo;

import java.util.Arrays;

public class Carton {
    private int[] carton;

    public Carton(int numeroBolas){
        carton = new int[10];
        for (int i = 0; i < 10; i++) {
            int busqueda = -1, numero=0;
            while (busqueda>=-1){
                numero = (int)(Math.random()*numeroBolas)+1;
                busqueda = Arrays.binarySearch(carton,numero);
            }
            carton[0]=numero;
            Arrays.sort(carton);
        }
    }

    public int marcarCarton(int numero){
        int retorno = 0;
        int posicion = Arrays.binarySearch(carton,numero);
        if(posicion>=0){
            int[] aux = Arrays.copyOfRange(carton,0,posicion);
            int[] aux2 = Arrays.copyOfRange(carton,posicion+1,carton.length);
            if(aux.length==0 && aux2.length==0)
                return -1;
            carton = Arrays.copyOf(aux,aux.length+aux2.length);
            for (int i = aux.length, j=0; i < carton.length; i++) {
                carton[i] = aux2[j++];
            }
        }
        return retorno;
    }

    @Override
    public String toString(){
        return Arrays.toString(carton);
    }

}
