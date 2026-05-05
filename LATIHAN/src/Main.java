import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<PerangkatPintar> device = new ArrayList<>();
        device.add(new LampuPintar());
        device.add(new AcPintar());

        for (PerangkatPintar perangkatPintar : device) {
            perangkatPintar.aktifkan(); 

            if (perangkatPintar instanceof AcPintar) {
                // Melakukan Downcasting yang aman
                AcPintar ac = (AcPintar) perangkatPintar;
                ac.aturSuhu(20);
            }
        }

        PerangkatPintar alat1 = new LampuPintar();
        alat1.aturKecerahan(75, "Putih");
        // Error terjadi karena compiler mengecek tipe referensi (PerangkatPintar) 
        // yang tidak memiliki metode aturKecerahan(), 
        // sehingga perlu di-downcast ke LampuPintar.
    }
}