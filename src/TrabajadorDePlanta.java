public class TrabajadorDePlanta extends Trabajador{
    public static int sueldoBase = 100000;
    private int bono;

    protected TrabajadorDePlanta(String rut, String nombre, String telefono, int bono) {
        super(rut, nombre, telefono);
        this.bono = bono;
    }
    public int getBono(){
        return bono;
    }
    public void setBono(int bono) {
        this.bono = bono;
    }

    public static int calculaSueldo(TrabajadorDePlanta trabajador){
       int bono = trabajador.getBono();
       int pagoMensual = sueldoBase + bono;
       return pagoMensual;
    }



    
}
