package ads.poo.aula15;

public class Motor {
    private final String tipoMotor;
    private boolean ligado;

    // Constantes movidas para cá
    private static final String[] TIPO_MOTOR = {"Turbina", "Hélice"};

    public Motor(String tipo) {
        // Valida o tipo usando o método estático da própria classe
        this.tipoMotor = isMotor(tipo) ? tipo : TIPO_MOTOR[0];
    }

    // Método estático para verificar se um tipo de motor é válido
    public static boolean isMotor(String motor) {
        return motor.equalsIgnoreCase(TIPO_MOTOR[0]) || motor.equalsIgnoreCase(TIPO_MOTOR[1]);
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean ligadoDesligado() {
        this.ligado = !this.ligado;
        return ligado;
    }

    @Override
    public String toString() {
        return tipoMotor;
    }
}