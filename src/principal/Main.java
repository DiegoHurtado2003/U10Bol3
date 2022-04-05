package principal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*En este ejeercicio crearemos una clase abstaracta Empleado, a la que pertenecen
         * programoador, jefeProyecto y administrativo. Para que alguien sea cosiderado empleado necesita
         * tener teléfono, salario, antiguedad, apellidos, dni y dirección.
         *
         * Crearemos también una interfaz que implementarán los jefes de proyecto y los empleados, pues
         * ambos necesiatn poder cambiar de portatil y de tecnología.
         *
         * Crearemos además las clases coche y portatil, pues no se puede hacer con un enum porque tienen
         * varios atributos. Tendrá coche el jefe de proyecto y portátil el programador y el jefe de proyecto.
         *
         *
         * Hay métodos compartidos por todos como el de incrementar salario(Aunque es polomorfico, pues varía
         * según quien lo llame ), y hay otros que no son compartidos com el de cambiar de coche, que solo lo
         * tienen los jefes de proyecto.
         */

//Para probar los métodos voy a crear un objeto de cada clase,
// aunque después crearé más para borbar los métodos
        Administrativo secretario1 = new Administrativo(525255605,
                1101, 1, "Paco",
                "Cabra", "2958555W", "Calle Virgen del Agua", Despacho.DESPACHO2, 1234321);

        ArrayList<Programador> programadoresSubordinados = new ArrayList<>();

        Coche ferrari = new Coche("3456776", "Ferrari", "La Ferrari");

        Portatil portatil1 = new Portatil(12345, "Pavillion");

        JefeProyecto jefe1 = new JefeProyecto(955329605,
                1200, 10, "Pepe",
                "Peréz", "29537625W", "Calle Virgen de la Luz", secretario1, programadoresSubordinados, ferrari, portatil1, Tecnologia.SQL, Despacho.DESPACHO2);

        Portatil portatil2 = new Portatil(54321, "Pavillion2");
        Programador Diego = new Programador(5852805,
                1000, 12, "Paco",
                "Hurtado", "2985858W", "Calle Virgen del Pez", portatil2, 54398676, Proyecto.PROYECTO1, Tecnologia.JAVA, jefe1);


        //Pruebas incrementar salarios
        jefe1.incrementarSalario();
        System.out.println(jefe1.getSalario());


        secretario1.incrementarSalario();
        System.out.println(secretario1.getSalario());

        Diego.incrementarSalario();
        System.out.println(Diego.getSalario());


        //Alta de programadores,
        jefe1.altaBajaProgramadores(true, Diego);
        System.out.println(jefe1.getProgramadoresSubordinados());

        //Baja de programadores,
        jefe1.altaBajaProgramadores(false, Diego);
        System.out.println(jefe1.getProgramadoresSubordinados());

        //Cambiar de coche
        Coche mustang = new Coche("3456777", "Ford", "Mustang");
        jefe1.cambiarCoche(mustang);
        System.out.println(jefe1.toString());

        //Cambiar administrativo

        Administrativo secretario2 = new Administrativo(695255605,
                1120, 6, "Paco",
                "Rendón", "2958852W", "Calle Américo Vespucio", Despacho.DESPACHO2, 1234321);

        jefe1.cambiarAdministrativo(secretario2);
        System.out.println(jefe1.toString());

        //Cambiar tecnología
        Diego.cambiarTecnologia(Tecnologia.C);
        System.out.println(Diego.getTecnologia());

        //Cambiar Portatil
        Portatil portatil3 = new Portatil(26845, "Surface PRO");
        Diego.cambiarPortatil(portatil3);
        System.out.println(Diego.getPortatil());
    }
}
