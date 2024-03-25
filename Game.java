import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Game extends JFrame {

    public Game() throws FontFormatException, IOException{

        File font_file = new File("joystix.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, font_file);
        Font sizedFont = font.deriveFont(40f);

        // JLabel title = new JLabel();
        // title.setText("food truk");
        // title.setBounds(300,57,10000000,100);
        // title.setForeground(Color.black);
        // title.setFont(sizedFont);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.getContentPane().setBackground(new Color(255,238,255));
        this.setLayout(null);
        this.setResizable(true);
        this.setTitle("Food Truk");
        this.setVisible(true);

        // this.add(title);
        
    }
}
