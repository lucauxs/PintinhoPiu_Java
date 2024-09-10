package classes;

public class Galinha extends Animais{

	public Galinha() {
		super("galinha", "có");
	}
	public void intro() {
		for(int i = 0; i <2; i ++) {
			System.out.println("Lá em casa tinha uma " + nome);			
		}
	}
	@Override
	public void emitirSom() {
		System.out.println("E a " + nome + " " + som);
	}
}
