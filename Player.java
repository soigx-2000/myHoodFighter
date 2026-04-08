public class Player{
    public enum Status{
        IDLE, JUMPING, PUNCHING, KICKING, BLOCKING, RUNNING, STUNNED, DOWN;
    }
    //player's x/y location with respect to map
    public double xPos;
    public double yPos;
    public int hp = 100;
    public Status status = Status.IDLE;
    public Player(int x, int y){
        xPos = x;
        yPos = y;
    }
}