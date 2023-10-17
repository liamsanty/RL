public class LocalComercial extends Local {
    private String centroComercial;

    public LocalComercial(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion,
                          double valorMetroCuadrado, String localizacion, String centroComercial) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, valorMetroCuadrado, localizacion);
        this.centroComercial = centroComercial;
    }
}