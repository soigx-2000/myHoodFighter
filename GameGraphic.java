import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
public class GameGraphic extends JPanel{
    final int panelWidth = 800;
    final int paneHeight = 400;
    public GameGraphic(){
        this.setPreferredSize(new Dimension(panelWidth, paneHeight));
        this.setBackground(Color.DARK_GRAY);
        this.setDoubleBuffered(true);//no idea what this does
    }
}
