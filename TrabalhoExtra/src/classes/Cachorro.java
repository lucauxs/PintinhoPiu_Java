package classes;

public class Cachorro extends Animais{

	public Cachorro() {
		super("cachorro", "auau");
	}
	public void intro() {
		for(int i = 0; i <2; i ++) {
			System.out.println("Lá em casa tinha um " + nome);			
		}
	}
	@Override
	public void emitirSom() {
		System.out.println("E o " + nome + " " + som);
	}
	
}
