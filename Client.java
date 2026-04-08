import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;


public class Client {// code from the chat room project: what can possiblly go wrong
    // private String userName;
    private final int PORT = 9878;
    private InetAddress host;
    private Socket socket = null;
    private ObjectOutputStream oos = null;
    private ObjectInputStream ois = null;
    
    public Client(InetAddress host, String userName) {
       // this.userName = userName;
        this.host = host;
        try{
            //make a gui
            JFrame frame = new JFrame("Client");
            GameGraphic graphic = new GameGraphic();
            frame.add(graphic);
            frame.setVisible(true);
            //connect to the server
            socket = new Socket(host.getHostName(), PORT);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
            graphic.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent e) {
                    if(e.getKeyChar() == 'w' ){
                        System.out.println("w pressed");
                    }
                }
                @Override
                public void keyPressed(java.awt.event.KeyEvent e) {}
                @Override
                public void keyReleased(java.awt.event.KeyEvent e) {}
            });
        } catch(Exception e){
            
        }
    }
	
	/*
	 * Modify this example so that it opens a dialogue window using java swing, 
	 * takes in a user message and sends it
	 * to the server. The server should output the message back to all connected clients
	 * (you should see your own message pop up in your client as well when you send it!).
	 *  We will build on this project in the future to make a full fledged server based game,
	 *  so make sure you can read your code later! Use good programming practices.
	 *  ****HINT**** you may wish to have a thread be in charge of sending information 
	 *  and another thread in charge of receiving information.
	*/
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
        //get the localhost IP address, if server is running on some other IP, you need to use that
        JFrame f = new JFrame("Chat Client 1");
        f.setSize(300,300);
        f.setLocation(100,100);
        JTextField inputBox = new JTextField(50);
        JButton submitButton = new JButton("send");
        f.getContentPane().add(BorderLayout.NORTH, inputBox);
        InetAddress host = InetAddress.getLocalHost();
        Client c1 = new Client(host, "Client 1");
    }
}