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
    /**
     * Método que cambia de supervisor pasandole por parámetro un objeto JefeProyecto
     * @param supervisor
     * precondición: El objeto tiene que ser creado previamente
     */
    public void cambioSupervisor(JefeProyecto supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    /*
     * Método que incrementa un 10% el salario
     */
    public void incrementarSalario() {
        this.salario = this.salario * 1.10;
    }

    @Override
    /**
     * Método que cambia el atributo portatil del objeto por otro distinto que se pasa por parámetro.
     * @param portatil Es un objeto de la clase Portatil
     * Precondición: El objeto portátil deberá ser creado previamente
     */
    public void cambiarPortatil(Portatil portatil) {
        this.portatil = portatil;
    }

    @Override
    /**
     * Método que cambia el atributo tecnología del objeto por otro distinto.
     * @param tecnologia Es un parámetro que cogeremos del enum Tecnologia
     */
    public void cambiarTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
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
