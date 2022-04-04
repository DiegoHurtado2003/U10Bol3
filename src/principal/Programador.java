package principal;

public class Programador extends Empleado implements CambiarPortatilTecnologia {
private Portatil portatil;
private int TelefonoMovil;
private Proyecto proyecto;
private Tecnologia tecnologia;
private JefeProyecto supervisor;

    public Programador(int telefono, double salario, int antiguedad,
                       String nombre, String apellidos, String dni,
                       String direccion, Portatil portatil,
                       int telefonoMovil, Proyecto proyecto,
                       Tecnologia tecnologia,
                       JefeProyecto supervisor) {
        super(telefono, salario, antiguedad, nombre, apellidos, dni, direccion);
        this.portatil = portatil;
        TelefonoMovil = telefonoMovil;
        this.proyecto = proyecto;
        this.tecnologia = tecnologia;
        this.supervisor = supervisor;
    }


    public Portatil getPortatil() {
        return portatil;
    }

    public int getTelefonoMovil() {
        return TelefonoMovil;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public JefeProyecto getSupervisor() {
        return supervisor;
    }

    @Override
    public void cambioSupervisor(JefeProyecto supervisor) {
        this.supervisor=supervisor;
    }

    @Override
    public void incrementarSalario() {
        this.salario= this.salario*1.10;
    }

    @Override
    public void cambiarPortatil(Portatil portatil) {
        this.portatil=portatil;
    }

    @Override
    public void cambiarTecnologia(Tecnologia tecnologia) {
        this.tecnologia=tecnologia;
    }

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
