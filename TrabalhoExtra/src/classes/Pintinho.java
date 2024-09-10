package classes;

public class Pintinho extends Animais{
	
	public Pintinho() {
		super("pintinho", "piu");
	}
	
	public void intro() {
		for(int i = 0; i <2; i ++) {
			System.out.println("Lá em casa tinha um " + nome);			
		}
	}
	@Override
	public void emitirSom() {
		repetirSom(5);
	}
	public void emitirSomExtra() {
		repetirSom(1);
	}

	private void repetirSom(int vezes) {
		for (int i = 0; i < vezes; i++) {
			System.out.println("E o " + nome + " " + som);
		}
	}
}
