package PC2;

public class ClubDeportivoMain {
    public static void main(String[] args) {
        ClubDeportivo uni = new ClubDeportivo("UNI");
        String[] grupo1 = {"123A","Pilates","10","10","50.0"};
        String[] grupo2 = {"789C","Danza","10","10","30.0"};

        uni.agregarActividad(grupo1);
        uni.agregarActividad(grupo2);
        System.out.println(uni);
    }
}
