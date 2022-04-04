package principal;

import java.util.ArrayList;

public class JefeProyecto extends Empleado implements CambiarPortatilTecnologia{
  private Administrativo secretario;
  private ArrayList <Programador> programadoresSubordinados;
   private Coche coche;
   private Portatil portatil;
    private String tecnologia;//Hacer enum
    private String despacho;//Hacer enum

    public JefeProyecto(int telefono, int salario, int antiguedad, String nombre, String apellidos, String dni, String direccion, Administrativo secretario, ArrayList<Programador> programadoresSubordinados, Coche coche, Portatil portatil, String tecnologia, String despacho) {
        super(telefono, salario, antiguedad, nombre, apellidos, dni, direccion);
        this.secretario = secretario;
        this.programadoresSubordinados = programadoresSubordinados;
        this.coche = coche;
        this.portatil = portatil;
        this.tecnologia = tecnologia;
        this.despacho = despacho;
    }

    @Override
    public void cambiarPortatil() {
        CambiarPortatilTecnologia.super.cambiarPortatil();
    }

    @Override
    public void cambiarTecnologia() {
        CambiarPortatilTecnologia.super.cambiarTecnologia();
    }

    public JefeProyecto(int telefono, int salario, int antiguedad, String nombre, String apellidos, String dni, String direccion) {
        super(telefono, salario, antiguedad, nombre, apellidos, dni, direccion);
    }

    @Override
    public void cambioSupervisor() {
        super.cambioSupervisor();
    }

    @Override
    public void incrementarSalario() {
        super.incrementarSalario();
    }

    public void cambiarCoche(){}

    public void cambiarAdministrativo(){}

    public void altaBajaProgramadores(){}

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
