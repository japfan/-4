package id.jaffan.prioritas;
import id.jaffan.Rekening;

public class RekeningPrioritas extends Rekening {

    public RekeningPrioritas(String namaPemilik, double saldoAwal, String kodeCabang) {
        super(namaPemilik, saldoAwal, kodeCabang);
    }

    public void berikanLayananPrioritas() {
        System.out.println("Memberikan layanan prioritas untuk: " + getNamaPemilik());
    }
}