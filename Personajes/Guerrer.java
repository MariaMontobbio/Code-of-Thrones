package Personajes;

public class Guerrer extends BasePersonajes {

    private int resistencia;

    public Guerrer(String nom, int nivell, int puntsVida, int resistencia) {
        super(nom, nivell, puntsVida);
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }
    protected void setResistencia(int r) {
        this.resistencia = r;
    }


}
