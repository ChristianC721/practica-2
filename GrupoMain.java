package PC2;

public class GrupoMain {
    public static void main(String[] args) {
        Grupo g1 = new Grupo("456B","Pilates",8,5,50.0f);
        System.out.println(g1);
        Grupo g2 = new Grupo("123A","Aerobic",15,10,30.0f);
        System.out.println(g2);
        if (g1.equals(g2)==true){
            System.out.println("Los grupos son iguales");
        }else {
            System.out.println("Los grupos no son iguales.");
        }

        g2.matricular(10);
    }
}
