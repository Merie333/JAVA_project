public class Test {
    public static void main(String[] args) {
        // test intersect
        HitBox hero = new HitBox(0, 0, 32, 32, "hero");
        HitBox monstre = new HitBox(20, 20, 32, 32, "monstre"); // touche le hero
        HitBox murLointain = new HitBox(100, 100, 32, 32, "mur");
        HitBox murCote = new HitBox(32, 0, 32, 32, "murCote"); // juste a cote
        HitBox murDessous = new HitBox(10, 50, 32, 32, "murDessous"); // en dessous

        System.out.println("hero vs monstre : " + hero.intersect(monstre));
        System.out.println("monstre vs hero : " + monstre.intersect(hero));
        System.out.println("hero vs murLointain : " + hero.intersect(murLointain));
        System.out.println("hero vs murCote : " + hero.intersect(murCote));
        System.out.println("hero vs murDessous : " + hero.intersect(murDessous));
        System.out.println();

        // affichage du donjon
        TileManager tileManager = new TileManager(32, 32);
        Dungeon dungeon = new Dungeon(10, 6, tileManager);
        HitBox heroDonjon = new HitBox(64, 64, 32, 32, "Héros"); // case (2,2)
        dungeon.displayDungeonInConsole(heroDonjon);
        System.out.println();

        // on compte les Things
        int nbSol = 0;
        int nbMur = 0;
        for (Things t : dungeon.getRenderList()) {
            if (t instanceof SolidThings) {
                nbMur++;
            } else {
                nbSol++;
            }
        }
        System.out.println("Nombre de Things : " + dungeon.getRenderList().size());
        System.out.println("Sol : " + nbSol + " / Murs : " + nbMur);
    }
}
