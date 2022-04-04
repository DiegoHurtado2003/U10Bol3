package principal;

public abstract class Empleado {
    public int telefono, salario, antiguedad;
    public String nombre, apellidos, dni, direccion;

    //Constructor
    public Empleado(int telefono, int salario,
                    int antiguedad, String nombre,
                    String apellidos, String dni,
                    String direccion) {
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedad = antiguedad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
    }

    //Métodos
    public void cambioSupervisor(){}

    public void incrementarSalario(){}

    @Override
    public String toString() {
        return "Empleado{" +
                "telefono=" + telefono +
                ", salario=" + salario +
                ", antiguedad=" + antiguedad +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
