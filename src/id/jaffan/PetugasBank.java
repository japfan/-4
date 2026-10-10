package id.jaffan;

public class PetugasBank {
    public void cekDataRek(Rekening rek) {
        System.out.println("Petugas mengecek kode cabang: " + rek.kodeCabang);
        System.out.println("Saldo rekening: " + rek.getSaldo());
    }
}
