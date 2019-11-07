package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class untuk mengatur, menghitung dan menampilkan gaji pokok.
 * 
 */
public class GajiPegawai {
    private String nama, alamat;
    private int uangTransport, uangTunjangan, gajiPokok, totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
        setTotalGaji(uangTunjangan + uangTransport + gajiPokok);
        return totalGaji;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjungan, int uangTransport, int gajiPokok, int totalGaji) {
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###\n-------------------------------------");
        System.out.println("Nama Karyawan\t: " + this.nama);
        System.out.println("Alamat\t\t: " + this.alamat);
        System.out.println("Uang Transport\t: Rp. " + this.uangTransport);
        System.out.println("Uang Tunjangan\t: Rp. " + this.uangTunjangan);
        System.out.println("Gaji Pokok\t: Rp. " + this.gajiPokok);
        System.out.println("TOTAL GAJI\t: Rp. " + this.totalGaji);
    }
}
