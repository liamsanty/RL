
    public class Local  extends Inmueble{
        private String localizacion;
    
        public Local(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, double valorMetroCuadrado, String localizacion) {
            super(identificadorInmobiliario, areaMetrosCuadrados, direccion, valorMetroCuadrado);
            this.localizacion = localizacion;
        }
    }
