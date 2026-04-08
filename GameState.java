public class GameState {
    private boolean paused = false;
    private Player player1;
    private Player player2;
    public GameState(){
        player1 = new Player(-150, 0);
        player2 = new Player(150, 0);
    }
}
