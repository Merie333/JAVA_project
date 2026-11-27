import java.awt.Graphics;
import javax.swing.JPanel;

public class GameRender extends JPanel {
    private Dungeon dungeon;
    private Hero hero;

    public GameRender(Dungeon dungeon, Hero hero) {
        this.dungeon = dungeon;
        this.hero = hero;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // le donjon d abord puis le heros par dessus
        for (Things t : dungeon.getRenderList()) {
            t.draw(g);
        }
        hero.draw(g);
    }
}
