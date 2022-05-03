public class PedidoBuilder extends PedidoAbstractBuilder{
    private Pedido pedido;
    ItemPedido itemPedido;
    TipoLanche tipoLanche;
    TipoItemPedido tipoItemPedido;
    TamanhoBatata tamanhoBatata;
    TipoBrinde tipoBrinde;
    TipoBebida tipoBebida;


    @Override
    void setLanche(TipoLanche tipo) {
        tipoLanche = tipo;
    }

    @Override
    void setBatata(TamanhoBatata tamanho) {
        tamanhoBatata = tamanho;
    }

    @Override
    void setBrinde(TipoBrinde tipo) {
        tipoBrinde = tipo;
    }

    @Override
    void setBebida(TipoBebida tipo) {
        tipoBebida = tipo;
    }

    public Pedido build(){
        return new Pedido(tipoBebida,tipoBrinde,tamanhoBatata,tipoLanche);
    }
}
