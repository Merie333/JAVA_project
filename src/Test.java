// public class Test {
//    public static void main(String[] args){
//     // on crée 2 HB qui se touchent
//     HitBox hero = new HitBox(0,0,32,32, "heroo");
//     HitBox monstre = new HitBox(20,20,32,32, "monstre");

//     // crée une HB ou on aura pas de collision
//     HitBox murLointain = new HitBox(100, 100, 32, 32, "mur");
//     // on vérifie les collisions
//     System.out.println("test collision Hero vs montre " 
//         + hero.intersect(monstre)
//     );
//     System.out.println("test collision Hero vs mur " 
//         + hero.intersect(murLointain)
//     );
//    } 
   
// }

public class Test {
    public static void main(String[] args) {
        // 1. On instancie un TileManager de 32x32 pixels
        TileManager tileManager = new TileManager(32, 32);

        // 2. On instancie un Dungeon de 10 cases de large et 6 cases de haut
        Dungeon dungeon = new Dungeon(10, 6, tileManager);

        // 3. On crée un héros en position x=64, y=64 (ce qui correspond à la case col=2, row=2)
        HitBox hero = new HitBox(64, 64, 32, 32, "Héros");

        // 4. On affiche le donjon dans la console
        // dungeon.displayDungeonInConsole(hero);
        System.out.println("Nombre d'éléments générés : " + dungeon.getThingsArray().size());
        System.out.println("Type de la case (0,0) : " + dungeon.getThingsArray().get(0).getClass().getSimpleName());
    }
}
