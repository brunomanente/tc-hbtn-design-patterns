public class ItemPedido {

    private TipoItemPedido tipo;
    private String nome;


    public ItemPedido(TipoItemPedido bebida, String name) {
        this.tipo = bebida;
        this.nome = name;
    }

    public ItemPedido(){
    }

    public TipoItemPedido getTipo() {
        return tipo;
    }

    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

