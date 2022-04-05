package principal;

import java.util.ArrayList;

public class JefeProyecto extends Empleado implements CambiarPortatilTecnologia {
    private Administrativo secretario;
    private ArrayList<Programador> programadoresSubordinados;
    private Coche coche;
    private Portatil portatil;
    private Tecnologia tecnologia;
    private Despacho despacho;

    public JefeProyecto(int telefono, int salario, int antiguedad, String nombre, String apellidos,
                        String dni, String direccion, Administrativo secretario,
                        ArrayList<Programador> programadoresSubordinados, Coche coche,
                        Portatil portatil, Tecnologia tecnologia, Despacho despacho) {
        super(telefono, salario, antiguedad, nombre, apellidos, dni, direccion);
        this.secretario = secretario;
        this.programadoresSubordinados = programadoresSubordinados;
        this.coche = coche;
        this.portatil = portatil;
        this.tecnologia = tecnologia;
        this.despacho = despacho;
    }

    public Administrativo getSecretario() {
        return secretario;
    }

    public ArrayList<Programador> getProgramadoresSubordinados() {
        return programadoresSubordinados;
    }

    public Coche getCoche() {
        return coche;
    }

    public Portatil getPortatil() {
        return portatil;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public Despacho getDespacho() {
        return despacho;
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

    public JefeProyecto(int telefono, int salario, int antiguedad, String nombre, String apellidos, String dni, String direccion) {
        super(telefono, salario, antiguedad, nombre, apellidos, dni, direccion);
    }

    @Override
    /*
     * Método que incrementa un 20% el salario
     */
    public void incrementarSalario() {

        this.salario = this.salario * 1.20;
    }

    /**
     * Método que cambia de cohe pasandole por parametro un objeto Coche
     * @param coche
     * Precondición: El objeto coche debe estar previamente creado
     */
    public void cambiarCoche(Coche coche) {
        this.coche = coche;
    }

    /**
     * Método que cambia de secretario pasandole por parametro un objeto Administrativo
     * @param secretario
     * Precondición: El objeto coche debe estar previamente creado
     */
    public void cambiarAdministrativo(Administrativo secretario) {
        this.secretario = secretario;
    }

    /**
     * Método para meter o sacar un programador de la lista
     * de programadores subordinados el jefe de proyectos
     * @param altaBaja es un parámetro que cuando es true añade un programador y cuando es false lo elimina
     * @param programador Es un objeto programador que será eliminado o añadido a la lista
     * Precondición: El objeto programador debe estar previamente creado para añadirlo, o
     *               estar previamente en la lista para eliminarlo
     */
    public void altaBajaProgramadores(boolean altaBaja, Programador programador) {
        if (altaBaja) {
            programadoresSubordinados.add(programador);
        } else {
            programadoresSubordinados.remove(programador);
        }
    }

    @Override
    public String toString() {
        return "JefeProyecto{" +
                "telefono=" + telefono +
                ", salario=" + salario +
                ", antiguedad=" + antiguedad +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", secretario=" + secretario +
                ", programadoresSubordinados=" + programadoresSubordinados +
                ", coche=" + coche +
                ", portatil=" + portatil +
                ", tecnologia='" + tecnologia + '\'' +
                ", despacho='" + despacho + '\'' +
                '}';
    }
}
