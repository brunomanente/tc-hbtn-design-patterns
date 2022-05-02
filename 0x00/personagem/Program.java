import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        PersonagemFactory terraMediaPersonagemFactory = new WesterosPersonagemFactory();
        PersonagemFactory westerosPersonagemFactory = new TerraMediaPersonagemFactory();

        try {
            Personagem magoGandalf = terraMediaPersonagemFactory.createPersonagem(TipoPersonagem.MAGO, "Gandalf");
            System.out.println(magoGandalf);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Personagem ladinoFrodo = terraMediaPersonagemFactory.createPersonagem(TipoPersonagem.LADRAO, "Frodo");
            System.out.println(ladinoFrodo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Personagem guerreiroAragorn = terraMediaPersonagemFactory.createPersonagem(TipoPersonagem.GUERREIRO, "Aragorn");
            System.out.println(guerreiroAragorn);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Personagem magaMelisandre = westerosPersonagemFactory.createPersonagem(TipoPersonagem.MAGO, "Melisandre");
            System.out.println(magaMelisandre);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Personagem ladinoOberynMartell = westerosPersonagemFactory.createPersonagem(TipoPersonagem.LADRAO, "Oberyn Martell");
            System.out.println(ladinoOberynMartell);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Personagem guerreiroKhalDrogo = westerosPersonagemFactory.createPersonagem(TipoPersonagem.GUERREIRO, "Khal Drogo");
            System.out.println(guerreiroKhalDrogo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Personagem guerreiroInvalido = new Guerreiro("Guerreiro Invalido", TipoPersonagem.GUERREIRO, 8, 3, 3, 3, 4);
            System.out.println(guerreiroInvalido);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Personagem ladinoInvalido = new Ladrao("Ladino Invalido",TipoPersonagem.LADRAO, 8, 3, 3, 3, 4);
            System.out.println(ladinoInvalido);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Personagem magoInvalido = new Mago("Mago Invalido",TipoPersonagem.MAGO, 1, 8, 7, 7, 10);
            System.out.println(magoInvalido);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}