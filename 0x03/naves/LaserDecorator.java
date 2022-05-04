public class LaserDecorator extends NaveEspacialDecorator{
    public LaserDecorator(NaveEspacial naveDecorada) {
        super(naveDecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 40;
    }


}
