import java.awt.Graphics;
import java.awt.Image;

public class Things {
    // protected pour que les classes filles puissent changer x et y
    protected int height;
    protected int width;
    protected int x;
    protected int y;
    protected Image image;

    // constructeur TP1
    public Things(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    // constructeur TP2, la taille vient de l'image
    public Things(int x, int y, Image image) {
        this.x = x;
        this.y = y;
        this.image = image;
        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
    }

    public void draw(Graphics g) {
        g.drawImage(image, x, y, null);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
