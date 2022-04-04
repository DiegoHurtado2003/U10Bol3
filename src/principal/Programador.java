package principal;

public class Programador extends Empleado implements CambiarPortatilTecnologia {
private Portatil portatil;
private int TelefonoMovil;
private Proyecto proyecto;
private Tecnologia tecnologia;
    public Programador(int telefono, int salario, int antiguedad, String nombre,
                       String apellidos, String dni, String direccion, Portatil portatil, int telefonoMovil, Proyecto proyecto, Tecnologia tecnologia) {
        super(telefono, salario, antiguedad, nombre, apellidos, dni, direccion);
        this.portatil = portatil;
        TelefonoMovil = telefonoMovil;
        this.proyecto = proyecto;
        this.tecnologia = tecnologia;
    }

    @Override
    public void cambioSupervisor() {
        super.cambioSupervisor();
    }
    //completar
    @Override
    public void incrementarSalario() {
        super.incrementarSalario();
    }
//completar


    @Override
    public void cambiarPortatil() {
        CambiarPortatilTecnologia.super.cambiarPortatil();
    }
//completar

    @Override
    public void cambiarTecnologia() {
        CambiarPortatilTecnologia.super.cambiarTecnologia();
    }
    //completar

    @Override
    public String toString() {
        return "Programador{" +
                "telefono=" + telefono +
                ", salario=" + salario +
                ", antiguedad=" + antiguedad +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", portatil=" + portatil +
                ", TelefonoMovil=" + TelefonoMovil +
                ", proyecto='" + proyecto + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                '}';
    }


}
