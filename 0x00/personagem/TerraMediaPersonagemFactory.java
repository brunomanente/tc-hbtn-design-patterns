public class TerraMediaPersonagemFactory extends PersonagemFactory {

    @Override
    public Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {

        if(tipoPersonagem == TipoPersonagem.MAGO){
            return new Mago(nome, tipoPersonagem.MAGO,10,2,5,3,4);
        }
        if(tipoPersonagem == TipoPersonagem.LADRAO){
            return new Ladrao(nome, tipoPersonagem.LADRAO,2,6,8,5,10);
        }
        if(tipoPersonagem == TipoPersonagem.GUERREIRO){
            return new Guerreiro(nome, tipoPersonagem.GUERREIRO,1,8,5,10,6);
        }
        return null;
    }
}
