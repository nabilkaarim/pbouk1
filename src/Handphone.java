class Handphone extends Elektronik {
    private String sistemOperasi;

    public Handphone(String model, double harga, String sistemOperasi) {
        super(model, harga);
        this.sistemOperasi = sistemOperasi;
    }
    public void pasangAplikasi(String namaAplikasi) {
        System.out.println("Memasang " + namaAplikasi + " di " + model);
    }

    public void pasangAplikasi(String namaAplikasi, double ukuranAplikasi) {
        System.out.println("Memasang " + namaAplikasi + " (" + ukuranAplikasi + "MB) di " + model);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Sistem Operasi: " + sistemOperasi);
    }
}