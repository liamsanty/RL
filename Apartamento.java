public class Apartamento extends InmuebleVivienda {
        private double valorAdministracion;
    
        public Apartamento(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                          double valorMetroCuadrado, int numeroHabitaciones, int numeroBanos, double valorAdministracion) {
            super(identificadorInmobiliario, areaMetrosCuadrados, direccion, valorMetroCuadrado, numeroHabitaciones, numeroBanos);
            this.valorAdministracion = valorAdministracion;
        }
    }

