class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, int tahun, int jumlahPintu) {
        super(merek, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}
