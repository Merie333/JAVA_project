public class DynamicThings extends AnimatedThings {
    private double speedX;
    private double speedY;

    public DynamicThings(int x, int y, int height, int width, double speedX, double speedY) {
        super(x, y, height, width);
        
        this.speedX = speedX;
        this.speedY = speedY;
    }


    public DynamicThings(int x, int y, int height, int width) {
        super(x, y, height, width);
        this.speedX = 0;
        this.speedY = 0;
    }
}