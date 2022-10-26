import java.util.ArrayList;

interface Itrabajador {

}

public class App implements Itrabajador {

    public static void main(String[] args) throws Exception {
        /*
         * Caso 1: 2 Trabajadores de Planta
         */

        // Defino trabajadores
        TrabajadorDePlanta worker1 = new TrabajadorDePlanta("1222", "Orlando", "+56993109650", 80000);
        TrabajadorDePlanta worker2 = new TrabajadorDePlanta("4442", "Pedro", "+56993109650", 40000);

        // Creo lista de trabajadores y creo el departamento con esa lista
        ArrayList<Trabajador> WorkersDepartment1 = new ArrayList<Trabajador>();
        WorkersDepartment1.add(worker1);
        WorkersDepartment1.add(worker2);

        Departamento department1 = new Departamento(100, "Digital Store", WorkersDepartment1);

        /*
         * Caso 2: 2 Trabajadores por Hora
         */

        // Defino trabajadores
        TrabajadorPorHoras worker3 = new TrabajadorPorHoras("4343", "Alicia", "+54736636333", 12);
        TrabajadorPorHoras worker4 = new TrabajadorPorHoras("4343", "Alicia", "+54736636333", 31);

        // Creo lista de trabajadores y creo el departamento con esa lista
        ArrayList<Trabajador> WorkersDepartment2 = new ArrayList<Trabajador>();
        WorkersDepartment2.add(worker3);
        WorkersDepartment2.add(worker4);

        Departamento department2 = new Departamento(100, "Advanced Analytics", WorkersDepartment2);
        
        /*
         * Caso 3: 1 Trabajador por Hora y 1 Trabajador de Planta
         */

        // Defino trabajadores
        TrabajadorPorHoras worker5 = new TrabajadorPorHoras("7343", "Clara", "+54736636333", 8);
        TrabajadorDePlanta worker6 = new TrabajadorDePlanta("4442", "Pedro", "+56993109650", 10000);

        // Creo lista de trabajadores y creo el departamento con esa lista
        ArrayList<Trabajador> WorkersDepartment3 = new ArrayList<Trabajador>();
        WorkersDepartment3.add(worker5);
        WorkersDepartment3.add(worker6);

        Departamento department3 = new Departamento(100, "CyberSecurity", WorkersDepartment3);

        System.out.println(Trabajador.calculaSueldo(department1));
        System.out.println(Trabajador.calculaSueldo(department2));
        System.out.println(Trabajador.calculaSueldo(department3));
    }

}
