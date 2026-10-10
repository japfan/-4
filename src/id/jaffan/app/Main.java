package id.jaffan.app;

import id.jaffan.PetugasBank;
import id.jaffan.Rekening;
import id.jaffan.prioritas.RekeningPrioritas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Rekening Jaffan
        Rekening rekJap = new Rekening("Jaffan", 1000000, "SLO01");
        
        PetugasBank petugas = new PetugasBank();
        petugas.cekDataRek(rekJap);
        
        rekJap.setor(500000);
        System.out.println("Saldo terbaru " + rekJap.getNamaPemilik() + ": " + rekJap.getSaldo());

        System.out.println("--");
        
        // Membuat objek Rekening Prioritas Dap
        RekeningPrioritas rekDap = new RekeningPrioritas("Dap", 2000000, "JMK02");
        petugas.cekDataRek(rekDap);
        rekDap.adminPrio();
        rekDap.tarik(1000000);
        rekDap.adminPrio();
        rekDap.adminPrio();
    }
}