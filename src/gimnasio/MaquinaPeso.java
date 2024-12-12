package gimnasio;

import java.time.LocalDate;

/**
 * La máquina de pesar almacenará para cada cliente, en una fecha determinada (usa la clase LocalDate para almacenar fechas sin hora asociada),
 * su IMC, porcentaje de grasa corporal, su tasa metabólica basal y su peso ajustado. Aquí te indicamos cómo se calcula cada uno de estos parámetros:
 */
public class MaquinaPeso {

    private Cliente cliente;
    private double peso;
    private LocalDate diaPesaje;
    private IMC imc;
    private double calculadoIMC;


    public MaquinaPeso(Cliente cliente, double peso){
        this.cliente = cliente;
        this.peso = peso;
        this.diaPesaje = LocalDate.now();
        this.calculadoIMC = calcularNumIMC();
        this.imc = calcularIMC();
    }

    /**
     * IMC: se calcula de la siguiente forma: peso en kg/(altura^2  en metros).
     * Este cálculo debe estar disponible para todo el sistema informático, pero sólo se almacenará para cada cliente si está bajo peso, rango normal, sobrepeso u obeso. Estos valores se calculan en los siguientes rangos:
     * o	Bajo peso (IMC <18,5)
     * o	Rango normal (IMC = 18,5-24,99)
     * o	Sobrepeso (IMC = 25-29,99)
     * o	Obeso (IMC >= 30,00)
     * @return
     */
    public double calcularNumIMC(){
        return peso/(cliente.getAltura()^2);
    }

    public IMC calcularIMC(){
        if(this.calculadoIMC < 18.5)
            return IMC.BAJO;
        else if (this.calculadoIMC < 25)
            return IMC.RANGO_NORMAL;
        else if (this.calculadoIMC < 30)
            return IMC.SOBREPESO;
        return IMC.OBESO;
    }


}
