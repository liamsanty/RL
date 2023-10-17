    public class Casa extends InmuebleVivienda{
        private int cantidadPisos;
    
        public Casa(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                    double valorMetroCuadrado, int numeroHabitaciones, int numeroBanos, int cantidadPisos) {
            super(identificadorInmobiliario, areaMetrosCuadrados, direccion, valorMetroCuadrado, numeroHabitaciones, numeroBanos);
            this.cantidadPisos = cantidadPisos;
        }
    
        public int getCantidadPisos() {
            return cantidadPisos;
        }
    }
    

