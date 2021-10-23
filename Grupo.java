package PC2;

import java.util.Objects;

public class Grupo {
    private String codigo;
    private String descripcion_actividad;
    private int plazas_ofertadas;
    private int numero_matriculados;
    private float tarifa;

    public Grupo(String codigo, String descripcion_actividad, int plazas_ofertadas, int numero_matriculados, float tarifa) {
        this.codigo = codigo;
        this.descripcion_actividad = descripcion_actividad;
        this.plazas_ofertadas = plazas_ofertadas;
        this.numero_matriculados = numero_matriculados;
        this.tarifa = tarifa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion_actividad() {
        return descripcion_actividad;
    }

    public void setDescripcion_actividad(String descripcion_actividad) {
        this.descripcion_actividad = descripcion_actividad;
    }

    public int getPlazas_ofertadas() {
        return plazas_ofertadas;
    }

    public void setPlazas_ofertadas(int plazas_ofertadas) {
        this.plazas_ofertadas = plazas_ofertadas;
    }

    public int getNumero_matriculados() {
        return numero_matriculados;
    }

    public void setNumero_matriculados(int numero_matriculados) {
        this.numero_matriculados = numero_matriculados;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    protected void validaCampos(){
        if(this.plazas_ofertadas<=0){
            throw new ClubException("Las plazas ofertadas no pueden ser cero o menores a cero.");
        }
        if(this.numero_matriculados<=0){
            throw new ClubException("El numero de personas matriculadas no puede ser cero o menor a cero.");
        }
        if(this.tarifa<=0){
            throw new ClubException("La tarifa no puede ser cero o menor a cero.");
        }
        if(this.numero_matriculados>plazas_ofertadas){
            throw new ClubException("El numero de personas matriculadas no puede ser mayor que el numero de plazas ofertadas.");
        }
    }

    public int PlazasLibres(){
        int restantes;
        restantes=this.plazas_ofertadas-this.numero_matriculados;
        return restantes;
    }

    public void actualizarPlazas(int n){
        plazas_ofertadas-=numero_matriculados;
        if(n<=0 || n<numero_matriculados){
            throw new ClubException("Exception de actualizar plazas.");
        }
    }

    public void matricular(int n){
        numero_matriculados+=n;
        if (n<=0 || this.plazas_ofertadas < this.numero_matriculados){
            throw new ClubException("No hay suficientes plazas en el grupo.");
        }
    }

    @Override
    public String toString() {
        return codigo+" - "+descripcion_actividad+" - "+tarifa+" soles - P: "+plazas_ofertadas+" - M: "+numero_matriculados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return codigo.equals(grupo.codigo) && descripcion_actividad.equals(grupo.descripcion_actividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion_actividad);
    }
}
