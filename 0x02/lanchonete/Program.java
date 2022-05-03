import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        PedidoBuilder builder1 = new PedidoBuilder();

        builder1.setBatata(TamanhoBatata.GRANDE);
        builder1.setBebida(TipoBebida.COCA_COLA);
        builder1.setBrinde(TipoBrinde.CARRO);
        builder1.setLanche(TipoLanche.CHEESEBURGUER);

        Pedido pedido1 = builder1.build();

        System.out.println(pedido1);

        PedidoBuilder builder2 = new PedidoBuilder();

        builder2.setBatata(TamanhoBatata.PEQUENA);
        builder2.setBebida(TipoBebida.GUARANA);

        Pedido pedido2 = builder2.build();

        System.out.println(pedido2);
    }
}