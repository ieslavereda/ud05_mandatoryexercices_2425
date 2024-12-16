package bingo;

public class Bola {
    private Color color;
    private int numero;

    public Bola(Color color, int numero){
        this.color=color;
        this.numero=numero;
    }

    public Color getColor() {
        return color;
    }

    public int getNumero() {
        return numero;
    }


    @Override
    public boolean equals(Object obj){
        if(obj==null || !(obj instanceof Bola))
            return false;
        Bola nueva = (Bola) obj;
        return (nueva.getNumero()==this.numero);
    }

    @Override
    public String toString(){
        return color.getColor()+" "+numero+" "+ConsoleColors.RESET;
    }

}
