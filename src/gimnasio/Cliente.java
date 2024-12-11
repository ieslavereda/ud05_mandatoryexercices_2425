package gimnasio;


import java.time.LocalDate;

/**
 * Por tanto, necesitaremos almacenar para un cliente su nombre, apellidos,
 * fecha de nacimiento (de tipo LocalDate), DNI, sexo, peso en kilos (tendrá decimales)
 * y altura en centímetros (sin decimales).
 * Los clientes se pueden dar de alta bien sólo con nombre, apellidos, fecha de nacimiento,
 * DNI y sexo, bien con todos los datos antes facilitados.
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String DNI;
    private Sexo sexo;
    private double peso;
    private int altura;

    public Cliente(String nombre, String apellidos, LocalDate fechaNacimiento, String DNI, Sexo sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.sexo = sexo;
    }

    public Cliente(String nombre, String apellidos, LocalDate fechaNacimiento, String DNI, Sexo sexo, double peso, int altura) {
        this(nombre, apellidos, fechaNacimiento, DNI, sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
