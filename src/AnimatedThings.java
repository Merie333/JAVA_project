import java.awt.Image;

// pour la torche etc, pas encore d animation
public class AnimatedThings extends SolidThings {

    public AnimatedThings(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    public AnimatedThings(int x, int y, Image image) {
        super(x, y, image);
    }
}
