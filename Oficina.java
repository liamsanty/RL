
    public class Oficina extends Local{

        private boolean esDelGobierno;
    
        public Oficina(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                       double valorMetroCuadrado, String localizacion, boolean esDelGobierno) {
            super(identificadorInmobiliario, areaMetrosCuadrados, direccion, valorMetroCuadrado, localizacion);
            this.esDelGobierno = esDelGobierno;
        }
    }
