package id.jaffan;

public class Rekening {
    private String namaPemilik;
    private double saldo;

    String kodeCabang;

    public Rekening(String namaPemilik, double saldoAwal, String kodeCabang) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
        this.kodeCabang = kodeCabang;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran uang " + jumlah + " berhasil. Saldo sekarang: " + saldo);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari 0.");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik tunai " + jumlah + " berhasil. Saldo sekarang: " + saldo);
        } else if (jumlah > saldo) {
            System.out.println("Saldomu kurang buat narik " + jumlah);
        } else {
            System.out.println("Jumlah penarikan harus lebih besar dari 0");
        }
    }
}