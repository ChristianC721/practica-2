package PC2;

public class ClubDeportivoAltoRendimiento extends ClubDeportivo{
    private int max_plazas;
    private float porc_incremento_precio_act;

    public ClubDeportivoAltoRendimiento(String nombre, int max_plazas, float porc_incremento_precio_act) {
        super();
        this.nombre = nombre;
        this.max_plazas = max_plazas;
        this.porc_incremento_precio_act = porc_incremento_precio_act;
    }

    protected void validaValores(){
        if(this.grupos.size()<=0){
            throw new ClubException("El tamanho no puede ser cero o menor a cero.");
        }
        if(this.max_plazas<=0){
            throw new ClubException("El numero maximo de plazas no puede ser cero o menor a cero.");
        }
        if(this.porc_incremento_precio_act<=0){
            throw new ClubException("El porcentaje de incremento de precio de las actividades no puede ser cero o menor a cero.");
        }
    }

    public void agrgarActividad(String[] datos){

    }

    public double ingresos(){

        return 0;
    }

}
