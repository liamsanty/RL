
    public class Principal {
        public static void main(String[] args) {
            CasaRural casaRural = new CasaRural(1, 200, "Calle 123", 1500000.0, 3, 2, 2, 10.0, 500.0);
            CasaConjuntoCerrado casaConjunto = new CasaConjuntoCerrado(2, 180, "Calle 456", 2500000.0, 4, 3, 2, 200.0, true);
            CasaIndependiente casaIndependiente = new CasaIndependiente(3, 150, "Calle 789", 3000000.0, 2, 2, 1);
            Apartamento apartamento = new Apartamento(4, 100, "Calle 1011", 2000000.0, 2, 2, 300.0);
            Apartaestudio apartaestudio = new Apartaestudio(5, 50, "Calle 1213", 1500000.0, 150.0);
            LocalComercial localComercial = new LocalComercial(6, 80, "Calle 1415", 3000000.0, "Interno", "Centro Comercial XYZ");
            Oficina oficina = new Oficina(7, 70, "Calle 1617", 3500000.0, "Calle", true);
    
            // Mostrar información de los inmuebles
            System.out.println("Información de los inmuebles:");
            mostrarInformacionInmueble(casaRural);
            mostrarInformacionInmueble(casaConjunto);
            mostrarInformacionInmueble(casaIndependiente);
            mostrarInformacionInmueble(apartamento);
            mostrarInformacionInmueble(apartaestudio);
            mostrarInformacionInmueble(localComercial);
            mostrarInformacionInmueble(oficina);
        }
    
        public static void mostrarInformacionInmueble(Inmueble inmueble) {
            System.out.println("Identificador Inmobiliario: " + inmueble.getIdentificadorInmobiliario());
            System.out.println("Área en Metros Cuadrados: " + inmueble.getAreaMetrosCuadrados() + " m²");
            System.out.println("Dirección: " + inmueble.getDireccion());
            System.out.println("Valor del Metro Cuadrado: $" + inmueble.getValorMetroCuadrado());
            System.out.println("Costo Total: $" + inmueble.calcularCosto());
            System.out.println();
    /* 
            
        */
        }
    }

