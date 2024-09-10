package classes;

public class Main {

	public static void main(String[] args) {
		musica();
	}
	public static void musica() {
		
		Pintinho pintinho = new Pintinho();
		Galo galo = new Galo();
		Galinha galinha = new Galinha();
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		pintinho.intro();
		pintinho.emitirSom();
		pintinho.emitirSomExtra();
		
		galo.intro();
		
		galo.emitirSom();
		pintinho.emitirSom();
		
		galinha.intro();
		
		galinha.emitirSom();
		galo.emitirSom();
		pintinho.emitirSom();
		
		cachorro.intro();
		
		cachorro.emitirSom();
		galinha.emitirSom();
		galo.emitirSom();
		pintinho.emitirSom();
		
		gato.intro();
		
		gato.emitirSom();
		cachorro.emitirSom();
		galinha.emitirSom();
		galo.emitirSom();
		pintinho.emitirSom();
	}
}
