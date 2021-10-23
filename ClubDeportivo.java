package PC2;

import java.util.List;

public class ClubDeportivo {
    protected String nombre;
    protected List<Grupo> grupos;

    public ClubDeportivo(String nombre) {
        this.nombre = nombre;
    }

    public ClubDeportivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    private int buscar(Grupo g){
        boolean existe = grupos.contains(g);
        if(existe){
            return grupos.indexOf(g);
        }else{
            return -1;
        }
    }

    public void agregarActividad(String[] datos){
        for (String k: datos){
            //this.grupos.add(k);
        }

        agregarActividad(datos);
    }

    protected void agregarActividad(Grupo g){
        boolean existe = grupos.contains(g);
        if(existe){
            g.getPlazas_ofertadas();
        }else{
            grupos.add(g);
        }
    }

    public int plazasLibres(String actividad){

        return 0;
    }

    public double ingresos(){

        return 0;
    }

    @Override
    public String toString() {
        return nombre + "->" +
                "[" + grupos +"]";
    }
}
