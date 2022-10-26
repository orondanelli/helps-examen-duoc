import java.util.ArrayList;

public class Departamento {

    private int codigo;
    private String nombre;
    private ArrayList<Trabajador> listaTrabajadores;

    public Departamento(int codigo, String nombre, ArrayList<Trabajador> listaTrabajadores) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaTrabajadores = listaTrabajadores;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }
}

