import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class MainInterface extends JFrame {
    private Dungeon dungeon;
    private Hero hero;
    private GameRender panel;

    public MainInterface() throws HeadlessException {
        super();
        dungeon = new Dungeon(12, 18, new TileManager(32, 32));
        hero = Hero.getInstance();
        panel = new GameRender(dungeon, hero);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        this.setVisible(true);
        this.setSize(new Dimension(400, 640));
    }

    public static void main(String[] args) {
        MainInterface mainInterface = new MainInterface();
    }
}
