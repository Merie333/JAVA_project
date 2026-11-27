// singleton : un seul heros possible
public final class Hero extends DynamicThings {

    private static volatile Hero instance = null;

    // constructeur privé donc pas de new Hero() ailleurs
    private Hero() {
        super(64, 64, new TileManager(32, 32).getTile(0, 1));
    }

    public static final Hero getInstance() {
        if (Hero.instance == null) {
            synchronized (Hero.class) {
                if (Hero.instance == null) {
                    Hero.instance = new Hero();
                }
            }
        }
        return Hero.instance;
    }
}
