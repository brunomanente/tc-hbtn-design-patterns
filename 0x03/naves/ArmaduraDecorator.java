public class ArmaduraDecorator extends NaveEspacialDecorator{
    public ArmaduraDecorator(NaveEspacial naveDecorada) {
        super(naveDecorada);
    }

    @Override
    public int getSaude() {

        return super.getSaude() + 150;
    }


}
