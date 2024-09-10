package classes;

abstract class Animais {
    protected String nome;
    protected String som;

    public Animais(String nome, String som) {
    	this.nome = nome;
        this.som = som;
    }
    public abstract void intro();
    public abstract void emitirSom();
}
