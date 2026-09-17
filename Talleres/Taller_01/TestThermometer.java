import javax.swing.JOptionPane;

public class TestThermometer {
    public static void main(String[] args) {

        Thermometer thermometer = new Thermometer();

        System.out.println("INICIO DE PRUEBA DE TERMOMETRO");
        System.out.println("Temperatura inicial: " + thermometer.getTemperature() + " °C");

        System.out.println("\n--- Pruebas con Valores Válidos ---");
        probarAsignacion(thermometer, 25);  
        probarAsignacion(thermometer, -50);  
        probarAsignacion(thermometer, 100);

        System.out.println("\n--- Pruebas con Valores Inválidos ---");
        probarAsignacion(thermometer, -51);  
        probarAsignacion(thermometer, 105);  
    }

    private static void probarAsignacion(Thermometer t, int nuevaTemp) {
        System.out.println("\nIntentando asignar: " + nuevaTemp + " °C");
        boolean fueExitoso = t.setTemperature(nuevaTemp);

        if (fueExitoso) {
            JOptionPane.showMessageDialog(null, "-> Resultado: CAMBIO ACEPTADO");
        } else {
            JOptionPane.showMessageDialog(null, "-> Resultado: CAMBIO RECHAZADO (Valor fuera del rango [-50, 100])");
        }
        
        System.out.println("Temperatura actual en pantalla: " + t.getTemperature() + " °C");
    }
}