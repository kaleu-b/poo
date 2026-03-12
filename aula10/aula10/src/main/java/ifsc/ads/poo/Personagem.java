package ifsc.ads.poo;

public class Personagem {

    private double exp, hp, dinheiro, mana;
    private String nome, classe;
    private String[] inventario = new String[10];
    private int lvl;

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getMana() {
        return mana;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getClasse(){
        return this.classe;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public double getExp(){
        return exp;
    }

    public void setInventario(String[] inventario) {
        this.inventario = inventario;
    }

    public String getInventario(int espaco){
       return inventario[espaco];
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl( int lvl) {
        this.lvl = lvl;
    }
}