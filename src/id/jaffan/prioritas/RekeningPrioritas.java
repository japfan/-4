package id.jaffan.prioritas;
import id.jaffan.Rekening;

public class RekeningPrioritas extends Rekening {

    public RekeningPrioritas(String namaPemilik, int saldoAwal, String kodeCabang) {
        super(namaPemilik, saldoAwal, kodeCabang);
    }
    
    public void adminPrio() {
        biayaAdmin(500000); // Memanggil method biayaAdmin() dari kelas Rekening
    }
}