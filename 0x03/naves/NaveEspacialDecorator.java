public abstract class NaveEspacialDecorator extends NaveEspacial{


    private NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial naveEspacial) {

        this.naveDecorada = naveEspacial;
    }


    @Override
    public int getSaude() {
        return naveDecorada.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveDecorada.getAtaque();
    }
}
