package ads.poo.aula15;

import java.util.ArrayList;

public class Aviao {
    private int tripulantes;
    private int passageiros;
    private int qtdCombustivel;
    private boolean ligado;

    // Constantes específicas do avião
    private static final int MAX_TRIPULANTES = 10;
    private static final int MAX_PASSAGEIROS = 40;
    private static final int MIN_MOTOR = 1;
    private static final int MAX_MOTOR = 8;
    private static final int MAX_COMBUSTIVEL = 100;

    private ArrayList<Motor> qtdeMotores;

    public Aviao(int t, int p, int c, String[] tipoMotor, int motores) {
        this.tripulantes = (t <= MAX_TRIPULANTES) ? t : MAX_TRIPULANTES;
        this.passageiros = (p <= MAX_PASSAGEIROS) ? p : MAX_PASSAGEIROS;
        this.qtdCombustivel = (c <= MAX_COMBUSTIVEL) ? c : MAX_COMBUSTIVEL;

        qtdeMotores = new ArrayList<>();

        if (motores >= MIN_MOTOR && motores <= MAX_MOTOR) {
            for (var i = 0; i < motores; i++) {
                // adiciona motor
                qtdeMotores.add(new Motor(tipoMotor[i]));
            }
        } else {
            // se for uma quantidade inválida, terá só um motor e será do tipo hélice
            qtdeMotores.add(new Motor("Hélice"));
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    // Liga ou desliga todos os motores
    public void ligarDesligar() {
        ligado = !ligado;
        qtdeMotores.forEach(motor -> {
            if (motor.isLigado() != ligado) {
                motor.ligadoDesligado();
            }
        });
    }

    // Liga ou desliga um motor específico
    public boolean ligarDesligar(int i) {
        return qtdeMotores.get(i).ligadoDesligado();
    }
}