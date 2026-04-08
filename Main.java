import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allow us to close the window by clicking "X" botton
        window.setTitle("hood fighter");
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        GameGraphic graphic = new GameGraphic();
        window.add(graphic);
        window.pack();
        window.setVisible(true);
    }
}
