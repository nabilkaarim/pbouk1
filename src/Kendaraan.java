class Kendaraan {
    private String merek;
    private int tahun;

    public Kendaraan(String merek, int tahun) {
        this.merek = merek;
        this.tahun = tahun;
    }
    public String getMerek() { return merek; }
    public void setMerek(String merek) { this.merek = merek; }
    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }

    // Method yang akan di-override
    public void displayInfo() {
        System.out.println("Merek: " + merek + ", Tahun: " + tahun);
    }
}

