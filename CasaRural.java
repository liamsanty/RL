
    public class CasaRural extends Casa {
        private double distanciaCabeceraMunicipal;
        private double altitudSobreNivelMar;
    
        public CasaRural(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                         double valorMetroCuadrado, int numeroHabitaciones, int numeroBanos,
                         int cantidadPisos, double distanciaCabeceraMunicipal, double altitudSobreNivelMar) {
            super(identificadorInmobiliario, areaMetrosCuadrados, direccion, valorMetroCuadrado, numeroHabitaciones, numeroBanos, cantidadPisos);
            this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
            this.altitudSobreNivelMar = altitudSobreNivelMar;
        }
    }

