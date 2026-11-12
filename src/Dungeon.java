import java.util.ArrayList;

public class Dungeon {
    private final int height;
    private final int width;
    private char[][] map;
    private TileManager tileManager;
    
    private ArrayList<Things> thingsArray;

    public Dungeon(int width, int height, TileManager tileManager) {
        this.width = width;
        this.height = height;
        this.tileManager = tileManager;

        this.thingsArray = new ArrayList<Things>();

        this.map = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    this.map[i][j] = 'W';
                } else {
                    this.map[i][j] = ' ';
                }
            }
        }
        
        this.fillThingsArray();
    }

    // 5.
    public void fillThingsArray() {
        this.thingsArray.clear();

        int tileW = this.tileManager.getWidth();
        int tileH = this.tileManager.getHeight();

        for (int i = 0; i < height; i++) {       // i = ligne (axe Y)
            for (int j = 0; j < width; j++) {    // j = colonne (axe X)
                int x = j * tileW;
                int y = i * tileH;

                if (this.map[i][j] == ' ') {
                    this.thingsArray.add(new Things(x, y, tileH, tileW));
                } else if (this.map[i][j] == 'W') {
                    this.thingsArray.add(new SolidThings(x, y, tileH, tileW));
                }
            }
        }
    }

    public ArrayList<Things> getThingsArray() {
        return this.thingsArray;
    }

    public void displayDungeonInConsole(HitBox hero) {
        // 
        int heroCol = (int) (hero.getX() / tileManager.getWidth());
        int heroRow = (int) (hero.getY() / tileManager.getHeight());
    
        for (int i = 0; i < height; i++) {
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