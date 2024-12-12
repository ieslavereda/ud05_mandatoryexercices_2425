package gimnasio;

import java.time.LocalDate;

public class Gimnasio {
    public static void main(String[] args) {
        Cliente vicent = new Cliente("Vicent", "López", LocalDate.of(1973,2,14),"123456Z",Sexo.HOMBRE,180);
        Cliente pepa = new Cliente("Pepa", "Navarro", LocalDate.of(2001,3,19),"918251X",Sexo.MUJER,178);
        Cliente luna = new Cliente("Luna", "Cano", LocalDate.of(2003,3,31),"629125C",Sexo.MUJER,150);
        Cliente blanca = new Cliente("Blanca", "Romero", LocalDate.of(1997,4,29),"91074316P",Sexo.MUJER);
        Cliente manel = new Cliente("Manel", "García", LocalDate.of(1957,6,28),"1922611K",Sexo.HOMBRE);
        blanca.setAltura(160);
        manel.setAltura(172);

        System.out.println(vicent);
        System.out.println(pepa);
        System.out.println(luna);
        System.out.println(blanca);
        System.out.println(manel);

    }
}
