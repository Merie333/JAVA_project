import java.awt.Image;

public class DynamicThings extends AnimatedThings {
    private double speedX;
    private double speedY;

    public DynamicThings(int x, int y, int height, int width) {
        super(x, y, height, width);
        this.speedX = 0;
        this.speedY = 0;
    }

    public DynamicThings(int x, int y, Image image) {
        super(x, y, image);
        this.speedX = 0;
        this.speedY = 0;
    }

    // on bouge seulement si on ne rentre pas dans un mur
    public void moveIfPossible(double dx, double dy, Dungeon dungeon) {
        HitBox nextHitBox = new HitBox(x + dx, y + dy, width, height, "next");

        for (Things t : dungeon.getRenderList()) {
            if (t instanceof SolidThings && t != this) {
                if (nextHitBox.intersect(((SolidThings) t).getHitBox())) {
                    return; // collision donc on bouge pas
                }
            }
        }
        // pas de collision, on avance et on deplace la hitbox aussi
        x = (int) (x + dx);
        y = (int) (y + dy);
        hitBox = new HitBox(x, y, width, height, hitBox.getName());
    }
}
