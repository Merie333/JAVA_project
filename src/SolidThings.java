public class SolidThings extends Things {
    // Attribut propre à SolidThings
    private HitBox hitBox;

    // Constructeur
    public SolidThings(int x, int y, int height, int width) {
        // 1. On transmet la position et la taille au parent "Things"
        super(x, y, height, width);

        // 2. On crée la HitBox spécifique à cet objet solide
        // (Comme demandé : même position et même taille)
        this.hitBox = new HitBox(x, y, width, height, "Solid");
    }
}