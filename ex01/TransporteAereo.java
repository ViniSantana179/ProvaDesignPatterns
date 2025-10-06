
public class TransporteAereo implements Transporte {
    private double pesoCarga;

    public TransporteAereo(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public double calcularTarifa() {
        return pesoCarga * 0.1;
    }
}
