import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI(){
        JFrame frame = new JFrame();
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Service");


        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        JTextField usernameText = new JTextField(25);
        usernameText.setBounds(80,20,165,25);
        panel.add(usernameText);


        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10,50,80,25);
        panel.add(passLabel);
        JPasswordField passwordText = new JPasswordField(32);
        passwordText.setBounds(80,50,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(200,100,80,30);
        panel.add(loginButton);
        frame.setVisible(true);
    }
}
