public class TransporteMaritimo implements Transporte {
    private double milhasNauticas;
    private double pesoCarga;

    public TransporteMaritimo(double milhasNauticas, double pesoCarga) {
        this.milhasNauticas = milhasNauticas;
        this.pesoCarga = pesoCarga;
    }

    @Override
    public double calcularTarifa() {
        return (milhasNauticas * 0.05) + (pesoCarga * 0.1);
    }
}