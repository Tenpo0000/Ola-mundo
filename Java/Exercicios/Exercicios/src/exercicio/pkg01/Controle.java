package exercicio.pkg01;

public class Controle {
    private int canal = 1;
    private int volume = 1;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentarVolume(int volume) {
        this.volume += volume;
        if(this.volume> 100) {
            this.volume = 100;
        }
    }

    public void diminuirVolume(int volume) {
        this.volume -= volume;
        if(this.volume < 0) {
            this.volume = 0;
        }
    }
}