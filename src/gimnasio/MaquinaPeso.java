package gimnasio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
     * @return imc calculado
     */
    public double calcularNumIMC(){
        return peso/(cliente.getAltura()^2);
    }

    /**
     * IMC según rango:
     * Bajo peso (IMC <18,5)
     * Rango normal (IMC = 18,5-24,99)
     * Sobrepeso (IMC = 25-29,99)
     * Obeso (IMC >= 30,00)
     * @return RangoIMC
     */
    public IMC calcularIMC(){
        if(this.calculadoIMC < 18.5)
            return IMC.BAJO;
        else if (this.calculadoIMC < 25)
            return IMC.RANGO_NORMAL;
        else if (this.calculadoIMC < 30)
            return IMC.SOBREPESO;
        return IMC.OBESO;
    }

    /**
     * Porcentaje de grasa corporal: se calcula como:  –44.988 + (0.503 × edad) + (10.689 × sexo) + (3.172 × IMC) – (0.026 × IMC²) + (0.181 × IMC × sexo)
     * – (0.02 × IMC × edad) – (0.005 × IMC² × sexo) + (0.00021 × IMC² × edad). El sexo es 0 para hombres y 1 para mujeres.
     */
    public double calcularPorcentajeGrasaCorporal(){
        int edad = (int) ChronoUnit.YEARS.between(cliente.getFechaNacimiento(), LocalDate.now());
        if (calculadoIMC==0)
            calcularNumIMC();

        return -44.988+(0.503+edad) +(10.689*cliente.getSexo().ordinal())+(3.172*calculadoIMC)-(0.026*Math.pow(calculadoIMC,2))
                +(0.181*calculadoIMC*cliente.getSexo().ordinal())-(0.02*calculadoIMC*edad)-(0.005*Math.pow(calculadoIMC,2)*cliente.getSexo().ordinal())
                + (0.00021*Math.pow(calculadoIMC,2)*edad);
    }
    /**
     * Porcentaje de grasa corporal: rangos:
     * 	Grasa esencial: 10-13 % (mujeres), 2-5 % (hombres);
     * 	Deportistas: 14-20 % (mujeres), 6-13 % (hombres);
     * 	Fitness: 21-24 % (mujeres), 14-17 % (hombres);
     * 	Promedio: 25-31 % (mujeres), 18-24 % (hombres);
     * 	Obesos: 32 %+ (mujeres), 25 %+ (hombres).
     */
    public GrasaCorporal calcularRangoGrasaCorporal(){
        if(cliente.getSexo()==Sexo.HOMBRE){

        }

    }

}
