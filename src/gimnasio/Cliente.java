package gimnasio;


import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String DNI;
    private Sexo sexo;
    private MaquinaPeso[] historicoPeso;
    private int altura;

    public Cliente(String nombre, String apellidos, LocalDate fechaNacimiento, String DNI, Sexo sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.sexo = sexo;
        this.historicoPeso = new MaquinaPeso[10];
    }

    public Cliente(String nombre, String apellidos, LocalDate fechaNacimiento, String DNI, Sexo sexo, int altura) {
        this(nombre, apellidos, fechaNacimiento, DNI, sexo);
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

    public MaquinaPeso[] getHistoricoPeso() { return historicoPeso;}

    public int getAltura() {
        return altura;
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
                ", altura=" + altura +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Cliente))
            return false;
        Cliente cliente = (Cliente) obj;
        return this.DNI.equals(cliente.getDNI());
    }
}
