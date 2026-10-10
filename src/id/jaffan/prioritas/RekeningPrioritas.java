package id.jaffan.prioritas;
import id.jaffan.Rekening;

public class RekeningPrioritas extends Rekening {

    public RekeningPrioritas(String namaPemilik, double saldoAwal, String kodeCabang) {
        super(namaPemilik, saldoAwal, kodeCabang);
    }
    
    public void adminPrio() {
        biayaAdmin(); // Memanggil method biayaAdmin() dari kelas Rekening
    }
}