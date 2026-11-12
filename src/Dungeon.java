public class Dungeon {
    private final int height;
    private final int width;
    private char[][] map;
    private TileManager tileManager;
// Le constructeur doit recevoir la largeur, la hauteur et un TileManager, puis initialiser le tableau map avec les bordures en murs ('W') et l'intérieur vide (' ').
    public Dungeon(int width, int height, TileManager tileManager){
        this.width = width;
        this.height = height;
        this.tileManager = tileManager;

        this.map = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i== 0 || i == height - 1 || j == 0 || j == width - 1) {
                    this.map[i][j] = 'W';
                } else {
                    this.map[i][j] = ' ';
                }
            }
        }
    }
 
    public void displayDungeonInConsole(HitBox hero){
        int heroCol = (int) (hero.getX() / tileManager.getWidth());
        int heroRow = (int) (hero.getY() / tileManager.getHeight());
    
        for (int i=0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == heroRow && j == heroCol) {
                    System.out.print('H');
                } else {
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
    }
}

