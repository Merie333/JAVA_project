public class TileManager {
    private final int width;
    private int height;

    public TileManager(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
}
