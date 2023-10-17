public class CasaConjuntoCerrado extends Casa{
        private double valorAdministracion;
        private boolean tieneAreasComunes;
    
        public CasaConjuntoCerrado(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                                   double valorMetroCuadrado, int numeroHabitaciones, int numeroBanos,
                                   int cantidadPisos, double valorAdministracion, boolean tieneAreasComunes) {
            super(identificadorInmobiliario, areaMetrosCuadrados, direccion, valorMetroCuadrado, numeroHabitaciones, numeroBanos, cantidadPisos);
            this.valorAdministracion = valorAdministracion;
            this.tieneAreasComunes = tieneAreasComunes;
        }
    }

