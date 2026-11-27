public class TestHero {
    public static void main(String[] args) {
        // test singleton
        Hero h1 = Hero.getInstance();
        Hero h2 = Hero.getInstance();
        System.out.println("h1 : " + h1);
        System.out.println("h2 : " + h2);
        System.out.println("h1 == h2 : " + (h1 == h2));
        System.out.println();

        // on avance vers la droite jusqu au mur
        Dungeon dungeon = new Dungeon(10, 6, new TileManager(32, 32));
        for (int i = 0; i < 50; i++) {
            int xAvant = h1.getX();
            h1.moveIfPossible(16, 0, dungeon);
            System.out.println("pas " + i + " : x = " + h1.getX());
            if (h1.getX() == xAvant) {
                System.out.println("Collision avec un mur, le heros est bloque en x = " + h1.getX());
                break;
            }
        }
    }
}
