public class NaveEspacialDecorator extends NaveEspacial{

    private NaveEspacial naveEspacial;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {
        this.naveEspacial = naveEspacial;
    }

    @Override
    public int getSaude() {
        return super.getSaude();
    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
    }
}
