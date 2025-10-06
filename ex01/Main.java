public class Main {
    public static void main(String[] args) {
        Transporte terrestre = new TransporteTerrestre(100); // 100 km
        Transporte aereo = new TransporteAereo(200); // 200 kg
        Transporte maritimo = new TransporteMaritimo(150, 300); // 150 milhas náuticas, 300 kg

        System.out.println("Tarifa do transporte terrestre: $" + terrestre.calcularTarifa());
        System.out.println("Tarifa do transporte aéreo: $" + aereo.calcularTarifa());
        System.out.println("Tarifa do transporte marítimo: $" + maritimo.calcularTarifa());
    }
}