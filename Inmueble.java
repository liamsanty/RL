
    public class Inmueble {
        private int identificadorInmobiliario;
        private int areaMetrosCuadrados;
        private String direccion;
        private double valorMetroCuadrado;
    
        public Inmueble(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, double valorMetroCuadrado) {
            this.identificadorInmobiliario = identificadorInmobiliario;
            this.areaMetrosCuadrados = areaMetrosCuadrados;
            this.direccion = direccion;
            this.valorMetroCuadrado = valorMetroCuadrado;
        }
    
        public int getIdentificadorInmobiliario() {
            return identificadorInmobiliario;
        }
    
        public int getAreaMetrosCuadrados() {
            return areaMetrosCuadrados;
        }
    
        public String getDireccion() {
            return direccion;
        }
    
        public double getValorMetroCuadrado() {
            return valorMetroCuadrado;
        }
    
        public double calcularCosto() {
            return areaMetrosCuadrados * valorMetroCuadrado;
        }
    }
    

