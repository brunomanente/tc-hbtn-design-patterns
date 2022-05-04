public class CanhaoExtraDecorator extends NaveEspacialDecorator{
    public CanhaoExtraDecorator(NaveEspacial naveDecorada) {
        super(naveDecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 75;
    }


}
