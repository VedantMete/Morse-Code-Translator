import javax.swing.*;
import java.awt.*;

public class MorseCodeTransGUI extends JFrame {
    public MorseCodeTransGUI(){
        // adds text to title
        super("Morse Code Translator");
        setSize(new Dimension(560,760));
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#C62E2E"));
        setLocationRelativeTo(null);
    }
}
