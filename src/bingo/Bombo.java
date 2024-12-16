package bingo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bombo {
    private int numeroBolas;
    private Bola[] bolas;
    private Color color;

    public Bombo(int numeroBolas, Color color){
        for (int i = 1; i <= numeroBolas ; i++) {
            bolas[i-1] = new Bola(color,i);
        }
        barajar();
    }

    public Bola sacarBola(){
        Bola sacada = null;
        if(bolas.length!=0){
            if(bolas.length%5==0)
                barajar();
            sacada = bolas[0];
            bolas = Arrays.copyOfRange(bolas,1,bolas.length);
        }
        return sacada;
    }

    private void barajar(){
        List listaBolas = Arrays.asList(bolas);
        Collections.shuffle(listaBolas);
        bolas = (Bola[]) listaBolas.toArray();
    }



}
