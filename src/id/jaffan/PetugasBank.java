package id.jaffan;

public class PetugasBank {
    public void cekDataRek(Rekening rek) {
        System.out.println("Nama Pemilik: " + rek.getNamaPemilik());
        System.out.println("Kode cabang: " + rek.kodeCabang); // demo akses ke atribut default
        System.out.println("Saldo rekening: " + rek.getSaldo());
    }
}
