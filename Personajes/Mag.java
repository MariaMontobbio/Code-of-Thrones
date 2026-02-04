package Personajes;

public class Mag extends BasePersonajes {
    private int mana;

    public Mag(String nom, int nivell, int puntsVida, int mana) {
        super(nom, nivell, puntsVida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }
    public void setMana(int m) {
        this.mana = m;
    }

}
