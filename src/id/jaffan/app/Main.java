package id.jaffan.app;

import id.jaffan.Rekening;
import id.jaffan.PetugasBank;
import id.jaffan.prioritas.RekeningPrioritas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Rekening
        Rekening rekJap = new Rekening("Jaffan", 1000000, "SLO01");
        rekJap.setor(500000);

        petugasBank petugas = new petugasBank();
        petugas.cekDataRek(rekJap);

        rekeningPrioritas rekPrioritas = new RekeningPrioritas("Dap", 2000000, "JMK02");
        rekPrioritas.layananPrioritas();
    }
}