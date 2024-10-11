class Motor extends Kendaraan {
    private String jenis;

    public Motor(String merek, int tahun, String jenis) {
        super(merek, tahun);
        this.jenis = jenis;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis: " + jenis);
    }
}