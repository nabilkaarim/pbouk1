class Elektronik {
    protected String model;
    protected double harga;
    public Elektronik() {
        this("Tidak diketahui", 0.0);
    }

    public Elektronik(String model, double harga) {
        this.model = model;
        this.harga = harga;
    }

    public void showDetails() {
        System.out.println("Model: " + model + ", Harga: $" + harga);
    }

}
