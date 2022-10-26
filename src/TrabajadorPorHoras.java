public class TrabajadorPorHoras extends Trabajador {

    private int numeroHoras;
    private static int valorHora = 22000;
    public TrabajadorPorHoras(String rut, String nombre, String telefono, int numeroHoras) {
        super(rut,nombre,telefono);
        this.numeroHoras = numeroHoras;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public static int calculaSueldo(TrabajadorPorHoras trabajador){
        int pagoMensual = trabajador.getNumeroHoras()*valorHora;
        return pagoMensual;
     }
}

