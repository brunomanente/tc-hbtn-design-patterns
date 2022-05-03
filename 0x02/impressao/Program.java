import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Impressao impressao1 = ImpressaoFactory.createImpressao(TamanhoImpressao.A3, 50, 10, true);
        Impressao impressao2 = ImpressaoFactory.createImpressao(TamanhoImpressao.A4, 50, 10, true);
        Impressao impressao3 = ImpressaoFactory.createImpressao(TamanhoImpressao.A3, 23, 7, false);
        Impressao impressao4 = ImpressaoFactory.createImpressao(TamanhoImpressao.A4, 23, 7, false);
        Impressao impressao5 = ImpressaoFactory.createImpressao(TamanhoImpressao.A2, 23, 7, true);
        Impressao impressao6 = ImpressaoFactory.createImpressao(TamanhoImpressao.A2, 50, 10, false);

        System.out.println(impressao1);
        System.out.println(impressao2);
        System.out.println(impressao3);
        System.out.println(impressao4);
        System.out.println(impressao5);
        System.out.println(impressao6);
    }
}