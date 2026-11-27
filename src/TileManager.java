import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class TileManager {
    private final int width;
    private final int height;
    private Image[][] tiles;
    private BufferedImage tileSheet;

    // par defaut on prend la tileSheet de moodle
    public TileManager(int width, int height) {
        this.width = width;
        this.height = height;
        setTiles(width, height, "tileSet.png");
    }

    public TileManager(int width, int height, String fileName) {
        this.width = width;
        this.height = height;
        setTiles(width, height, fileName);
    }

    // on ouvre l image puis on la coupe en tuiles de 32x32
    private void setTiles(int width, int height, String fileName) {
        try {
            tileSheet = ImageIO.read(new File(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        int nbCol = tileSheet.getWidth() / width;
        int nbRow = tileSheet.getHeight() / height;
        tiles = new Image[nbCol][nbRow];
        for (int i = 0; i < nbCol; i++) {
            for (int j = 0; j < nbRow; j++) {
                tiles[i][j] = tileSheet.getSubimage(i * width, j * height, width, height);
            }
        }
    }

    // x colonne, y ligne
    public Image getTile(int x, int y) {
        return tiles[x][y];
    }

    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
}
