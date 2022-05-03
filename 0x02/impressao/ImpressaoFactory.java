public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao,
                                            int paginasTotais, int paginasColoridas, boolean ehFrenteVerso){
        return new Impressao(tamanhoImpressao,paginasTotais,paginasColoridas,ehFrenteVerso);
    }
}
