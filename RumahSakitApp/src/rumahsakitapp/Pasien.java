package rumahsakitapp;

public class Pasien {
    private int id;
    private String nama;
    private int umur;
    private String penyakit;

    // Constructor
    public Pasien(int id, String nama, int umur, String penyakit) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.penyakit = penyakit;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    // Method tampilkan data pasien
    public void tampilkan() {
        System.out.println(this);
    }

    // Overriding toString
    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Umur: " + umur + ", Penyakit: " + penyakit;
    }
}
