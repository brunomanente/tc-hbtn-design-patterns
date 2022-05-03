public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private int paginasPretoEBranco;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.paginasPretoEBranco = paginasTotais - paginasColoridas;
    }
    public Impressao(){

    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public int getPaginasPretoEBranco() {
        return paginasPretoEBranco;
    }

    public void setPaginasPretoEBranco(int paginasPretoEBranco) {
        this.paginasPretoEBranco = paginasPretoEBranco;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }

    public void setTamanhoImpressao(TamanhoImpressao tamanhoImpressao) {
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public double calcularTotal() {
        double total = 0;

        if (ehFrenteVerso) {
            if (tamanhoImpressao.equals(TamanhoImpressao.A2)) {
                valorPretoBrancoFrenteVerso = 0.28;
                valorColoridasFrenteVerso = 0.18;
                total += paginasColoridas * valorColoridasFrenteVerso;
                total += paginasPretoEBranco * valorPretoBrancoFrenteVerso;
            }
            if (tamanhoImpressao.equals(TamanhoImpressao.A3)) {
                valorPretoBrancoFrenteVerso = 0.25;
                valorColoridasFrenteVerso = 0.15;
                total += paginasColoridas * valorColoridasFrenteVerso;
                total += paginasPretoEBranco * valorPretoBrancoFrenteVerso;
            }
            if (tamanhoImpressao.equals(TamanhoImpressao.A4)) {
                valorPretoBrancoFrenteVerso = 0.20;
                valorColoridasFrenteVerso = 0.10;
                total += paginasColoridas * valorColoridasFrenteVerso;
                total += paginasPretoEBranco * valorPretoBrancoFrenteVerso;
            }
        } else{
            if(tamanhoImpressao.equals(TamanhoImpressao.A2)){
                valorPretoBrancoFrenteApenas = 0.32;
                valorColoridasFrenteApenas = 0.22;
                total += paginasPretoEBranco * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
            }
            if(tamanhoImpressao.equals(TamanhoImpressao.A3)){
                valorPretoBrancoFrenteApenas = 0.30;
                valorColoridasFrenteApenas = 0.20;
                total += paginasPretoEBranco * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
            }
            if(tamanhoImpressao.equals(TamanhoImpressao.A4)){
                valorPretoBrancoFrenteApenas = 0.25;
                valorColoridasFrenteApenas = 0.15;
                total += paginasPretoEBranco * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
            }
        }
        return total;
    }

  /*  @Override
    public String toString() {

        String frenteVerso;
        if(ehFrenteVerso == true){
            frenteVerso = "frente e verso";
        } else {
            frenteVerso = "frente apenas";
        }
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                getPaginasTotais(), getPaginasColoridas(),
                getPaginasTotais() - getPaginasColoridas(),
                frenteVerso, calcularTotal());
    }*/

    @Override
    public String toString() {

        String frenteVerso;
        if(ehFrenteVerso == true){
             frenteVerso = "frente e verso.";
        } else{
             frenteVerso = "frente apenas.";
        }

        return  "total de paginas: " + paginasTotais +
                ", total coloridas: " + paginasColoridas +
                ", total preto e branco: " + paginasPretoEBranco +
                 " " +   frenteVerso +
                " total: " + String.format("%.2f", calcularTotal());

    }
}
