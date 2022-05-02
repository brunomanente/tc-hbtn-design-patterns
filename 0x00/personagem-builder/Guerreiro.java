public class Guerreiro extends Personagem{


    public Guerreiro() {
    }

    public Guerreiro(String nome,  int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome,
                TipoPersonagem.GUERREIRO,
                inteligencia,
                forca,
                vigor,
                resistencia,
                destreza);

        if (forca < inteligencia && forca < destreza){
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO");
        }

    }



    @Override
    public double getDanoAtaque(){
        return (getForca() * 0.8) + (getVigor() * 0.05) + (getDestreza() * 0.1) + (getInteligencia() * 0.05);
    }
}

