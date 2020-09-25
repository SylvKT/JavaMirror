import io.github.tehcjs.javamirror.Mirror;

public class Main {
	public static void main(String[] args) {
		Mirror.callStatic(TinyPotato.class, "submitPotato");
		Mirror.call(new TinyPotato(), "sayHi");
	}
}
