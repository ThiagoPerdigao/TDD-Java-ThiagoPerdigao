package src;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void acertaHora(int novaHora, int novoMinuto, int novoSegundo) {
        this.hora = novaHora;
        this.minuto = novoMinuto;
        this.segundo = novoSegundo;
    }

    public void reiniciarParaMeiaNoite() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public void marcarIntervalo(int horaInicial, int minutoInicial, int segundoInicial,
                            int horaFinal, int minutoFinal, int segundoFinal) {
    int segundosInicio = horaInicial * 3600 + minutoInicial * 60 + segundoInicial;
    int segundosFim = horaFinal * 3600 + minutoFinal * 60 + segundoFinal;

    int diferencaSegundos = segundosFim - segundosInicio;

    this.hora = diferencaSegundos / 3600;
    this.minuto = (diferencaSegundos % 3600) / 60;
    this.segundo = diferencaSegundos % 60;
}

    public String imprimirHora(boolean formato24h) {
        if (formato24h) {
            return String.format("%02d:%02d:%02d", hora, minuto, segundo);
        } else {
            String ampm = hora < 12 ? "AM" : "PM";
            int hora12h = hora > 12 ? hora - 12 : hora;
            return String.format("%02d:%02d:%02d %s", hora12h, minuto, segundo, ampm);
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

}

