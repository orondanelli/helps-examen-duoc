import java.util.ArrayList;

public abstract class Trabajador {
    private String rut;
    private String nombre;
    private String telefono;

    protected Trabajador(String rut, String nombre, String telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static String calculaSueldo(Departamento department) {
        int i = 0;
        int total;
        String name;
        ArrayList<String> finalList = new ArrayList<>();

        ArrayList<Trabajador> workers = department.getListaTrabajadores();
        while (workers.size() > i) {
            if (workers.get(i).getClass().getSimpleName() == "TrabajadorDePlanta") {
                name = workers.get(i).nombre;
                total = TrabajadorDePlanta.calculaSueldo((TrabajadorDePlanta) workers.get(i));
                finalList.add(name + ": " +total);
            } else if (workers.get(i).getClass().getSimpleName() == "TrabajadorPorHoras"){
                name = workers.get(i).nombre;
                total = TrabajadorPorHoras.calculaSueldo((TrabajadorPorHoras) workers.get(i));
                finalList.add(name + ": " +total);
            }
            i++;
        }
        
        return department.getNombre()+ ": " + finalList;
    }
}
