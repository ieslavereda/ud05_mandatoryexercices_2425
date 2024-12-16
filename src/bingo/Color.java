package bingo;

public enum Color {
    ROJO(ConsoleColors.RED),
    AZUL(ConsoleColors.BLUE),
    VERDE(ConsoleColors.GREEN),
    NEGRO(ConsoleColors.BLACK);

    private String color;
    Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
