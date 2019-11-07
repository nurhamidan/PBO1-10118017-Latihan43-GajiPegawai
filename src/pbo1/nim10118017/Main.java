package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Membuat objek dan memanggil methodnya dari class GajiPegawai.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gajiPegawai = new GajiPegawai();
        gajiPegawai.setNama("Agung Nurhamidan");
        gajiPegawai.setAlamat("Jl Tubagus Ismail Raya, 76, Sekeloa.");
        gajiPegawai.setUangTransport(250000);
        gajiPegawai.setUangTunjangan(300000);
        gajiPegawai.setGajiPokok(4500000);
        gajiPegawai.totalGaji(gajiPegawai.getUangTunjangan(), gajiPegawai.getUangTransport(), gajiPegawai.getGajiPokok());
        gajiPegawai.tampilData(gajiPegawai.getNama(), gajiPegawai.getAlamat(), gajiPegawai.getUangTunjangan(), gajiPegawai.getUangTransport(), gajiPegawai.getGajiPokok(), gajiPegawai.getTotalGaji());
    }
    
}
