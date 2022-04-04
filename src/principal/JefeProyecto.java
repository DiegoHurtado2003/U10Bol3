package principal;

import java.util.ArrayList;

public class JefeProyecto extends Empleado implements CambiarPortatilTecnologia{
  private Administrativo secretario;
  private ArrayList <Programador> programadoresSubordinados;
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
    public void cambiarPortatil(Portatil portatil) {
        this.portatil=portatil;
    }

    @Override
    public void cambiarTecnologia(Tecnologia tecnologia) {
        this.tecnologia=tecnologia;
    }

    public JefeProyecto(int telefono, int salario, int antiguedad, String nombre, String apellidos, String dni, String direccion) {
        super(telefono, salario, antiguedad, nombre, apellidos, dni, direccion);
    }

    @Override
    public void incrementarSalario() {

        this.salario= this.salario*1.20;
    }

    public void cambiarCoche(Coche coche){
        this.coche=coche;
    }

    public void cambiarAdministrativo(Administrativo secretario){
        this.secretario=secretario;
    }

    public void altaBajaProgramadores(boolean altaBaja, Programador programador){
        if (altaBaja){programadoresSubordinados.add(programador);}
        else{programadoresSubordinados.remove(programador);}
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
