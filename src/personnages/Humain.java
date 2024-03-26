package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent = 0;

	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}

	private void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);

	}

	private void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".\r\n");
	}

	private void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !\r\n");
	}

	private void acheter(String bien, int prix) {
		if (prix <= this.quantiteArgent) {
			parler("J'ai " + quantiteArgent + "sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " à " + prix + " sous");
		} else {
			parler("Je n'ai que" + quantiteArgent + "sous en poche. Je ne peux même pas m'offrir un(e) " + bien + " à " + prix + " sous");
		}
		
	}

	protected void gagnerArgent(int gain) {
		assert gain > -1;
		quantiteArgent += gain;
	}

	protected void perdreArgent(int perte) {
		assert perte < 1;
		quantiteArgent -= perte;
	}

	public static void main(String[] args) {
		Humain prof = new Humain("prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire("");
	}

}
