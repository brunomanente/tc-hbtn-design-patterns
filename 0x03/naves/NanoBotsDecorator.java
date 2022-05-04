public class NanoBotsDecorator extends NaveEspacialDecorator{
    public NanoBotsDecorator(NaveEspacial naveDecorada) {
        super(naveDecorada);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 25;
    }


}
