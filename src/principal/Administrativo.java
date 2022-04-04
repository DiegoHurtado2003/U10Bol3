package principal;

public class Administrativo extends Empleado{
    private Despacho despacho;
    private int numFax;

    public Administrativo(int telefono, int salario, int antiguedad,
                          String nombre, String apellidos, String dni,
                          String direccion, Despacho despacho, int numFax) {
        super(telefono, salario, antiguedad, nombre, apellidos, dni, direccion);
        this.despacho = despacho;
        this.numFax = numFax;
    }

    @Override
    public void incrementarSalario() {
        super.incrementarSalario();
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "despacho='" + despacho + '\'' +
                ", numFax=" + numFax +
                ", telefono=" + telefono +
                ", salario=" + salario +
                ", antiguedad=" + antiguedad +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
