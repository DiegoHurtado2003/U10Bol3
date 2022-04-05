package principal;

public abstract class Empleado {
    public int telefono, antiguedad;
    public double salario;
    public String nombre, apellidos, dni, direccion;

    //Constructor
    public Empleado(int telefono, double salario,
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

    //Métodos abstractos

    /**
     * Método que cambia de supervisor pasandole por parámetro un objeto JefeProyecto
     * @param supervisor
     * precondición: El objeto tiene que ser creado previamente
     */
    public void cambioSupervisor(JefeProyecto supervisor) {
    }

    /*
     * Método que incrementa el salario
     */
    public void incrementarSalario() {
    }

    public int getTelefono() {
        return telefono;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

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
