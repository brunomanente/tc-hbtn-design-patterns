import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{

    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> acucar = super.obterIngredientes();
        acucar.add("acucar");
        return acucar;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
