public class TransporteTerrestre implements Transporte {
    private double distancia;

    public TransporteTerrestre(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double calcularTarifa() {
        return distancia * 0.02;
    }
    
}
