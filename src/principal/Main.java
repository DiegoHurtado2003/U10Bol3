package principal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//Para probar los métodos voy a crear un objeto de cada clase,
// aunque después crearé más para borbar los métodos
        Administrativo secretario1 = new Administrativo(525255605,
                1101, 1, "Paco",
                "Cabra", "2958555W", "Calle Virgen del Agua", Despacho.DESPACHO2, 1234321);

        ArrayList<Programador> programadoresSubordinados = new ArrayList<>();

        Coche ferrari = new Coche("3456776","Ferrari", "La Ferrari");

        Portatil portatil1 = new Portatil(12345, "Pavillion");

        JefeProyecto jefe1 = new JefeProyecto(955329605,
                1200, 10, "Pepe",
                "Peréz", "29537625W", "Calle Virgen de la Luz", secretario1, programadoresSubordinados, ferrari,portatil1, Tecnologia.SQL,Despacho.DESPACHO2);

        Portatil portatil2 = new Portatil(54321, "Pavillion2");
        Programador ElDiego=new Programador(5852805,
                1000, 12, "Paco",
                "Hurtado", "2985858W", "Calle Virgen del Pez",portatil2,54398676, Proyecto.PROYECTO1, Tecnologia.JAVA, jefe1);


        //Pruebas incrementar salarios
        jefe1.incrementarSalario();
        System.out.println(jefe1.getSalario());


        secretario1.incrementarSalario();
        System.out.println(secretario1.getSalario());

        ElDiego.incrementarSalario();
        System.out.println(ElDiego.getSalario());


        //Alta de programadores,
        jefe1.altaBajaProgramadores(true, ElDiego);
        System.out.println(jefe1.getProgramadoresSubordinados());

        //Baja de programadores,
        jefe1.altaBajaProgramadores(false, ElDiego);
        System.out.println(jefe1.getProgramadoresSubordinados());


    }
}
