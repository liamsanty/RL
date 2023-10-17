
    public class InmuebleVivienda extends Inmueble{
        private int numeroHabitaciones;
        private int numeroBanos;
    
        public InmuebleVivienda(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                                double valorMetroCuadrado, int numeroHabitaciones, int numeroBanos) {
            super(identificadorInmobiliario, areaMetrosCuadrados, direccion, valorMetroCuadrado);
            this.numeroHabitaciones = numeroHabitaciones;
            this.numeroBanos = numeroBanos;
        }
    
        public int getNumeroHabitaciones() {
            return numeroHabitaciones;
        }
    
        public int getNumeroBanos() {
            return numeroBanos;
        }
    }
    
