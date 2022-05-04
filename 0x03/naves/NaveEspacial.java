public class NaveEspacial {
    private int saude;
    private int ataque;

    public NaveEspacial(int saude, int ataque) {
        this.saude = saude;
        this.ataque = ataque;
    }

    public NaveEspacial() {
    }

    public int getSaude() {
        return saude;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {

        return String.format("Saude: %d - Ataque: %d", getSaude(),getAtaque());
    }

}
