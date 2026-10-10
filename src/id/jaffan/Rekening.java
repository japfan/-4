package id.jaffan;

public class Rekening {
    private String namaPemilik;
    private int saldo;

    String kodeCabang;

    public Rekening(String namaPemilik, int saldoAwal, String kodeCabang) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
        this.kodeCabang = kodeCabang;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setor(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran uang " + jumlah + " berhasil. Saldo sekarang: " + saldo);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari 0.");
        }
    }

    public void tarik(int jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik tunai " + jumlah + " berhasil. Saldo sekarang: " + saldo);
        } else if (jumlah > saldo) {
            System.out.println("Saldomu kurang buat narik " + jumlah);
        } else {
            System.out.println("Jumlah penarikan harus lebih besar dari 0");
        }
    }

    protected void biayaAdmin(int adminFee) {
        if(saldo - adminFee < 0) {
            System.out.println("Saldo kurang buat bayar biaya admin " + adminFee);
            System.out.println("Saldomu sekarang: " + saldo);
        }else{
            saldo -= adminFee;
            System.out.println("Berhasil membayar biaya Rekening Prioritas sebesar " + adminFee + ". Saldo sekarang: " + saldo);
        }
    }
}