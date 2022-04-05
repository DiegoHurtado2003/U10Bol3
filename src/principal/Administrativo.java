package principal;

public class Administrativo extends Empleado {
    private final Despacho despacho;
    private final int numFax;

    public Administrativo(int telefono, int salario, int antiguedad,
                          String nombre, String apellidos, String dni,
                          String direccion, Despacho despacho, int numFax) {
        super(telefono, salario, antiguedad, nombre, apellidos, dni, direccion);
        this.despacho = despacho;
        this.numFax = numFax;
    }

    public Despacho getDespacho() {
        return despacho;
    }

    public int getNumFax() {
        return numFax;
    }

    @Override
    /*
     * Método que incrementa un 5% el salario
     */
    public void incrementarSalario() {
        this.salario = this.salario * 1.05;
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
