import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MorseCodeTransGUI extends JFrame {
    private JTextArea textInputArea, morseCodeArea;
    public MorseCodeTransGUI(){
        super("Morse Code Translator");
        setSize(new Dimension(560,760));
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#C62E2E"));
        setLocationRelativeTo(null);
        addGuiComponent();
    }
    private void addGuiComponent(){
        JLabel titleLabel = new JLabel("Morse Code Translator");
        titleLabel.setFont(new Font("Dialog",Font.BOLD,32));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(0,0,540,100);
        JLabel textInputLabel = new JLabel("Text:");
        textInputLabel.setFont(new Font("Dialog",Font.BOLD,16));
        textInputLabel.setForeground(Color.WHITE);
        textInputLabel.setBounds(20,100,200,30);
        textInputArea = new JTextArea();
        textInputArea.setFont(new Font("Dialog",Font.PLAIN,18));
        textInputArea.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        textInputArea.setLineWrap(true);
        textInputArea.setWrapStyleWord(true);
        JScrollPane textInputScroll = new JScrollPane(textInputArea);
        textInputScroll.setBounds(20,132,484,256);
        JLabel morseCodeInputLabel = new JLabel("Morse Code:");
        morseCodeInputLabel.setFont(new Font("Dialog",Font.BOLD,16));
        morseCodeInputLabel.setForeground(Color.WHITE);
        morseCodeInputLabel.setBounds(20,390,200,30);
        morseCodeArea = new JTextArea();
        morseCodeArea.setFont(new Font("Dialog",Font.PLAIN,18));
        morseCodeArea.setEditable(false);
        morseCodeArea.setLineWrap(true);
        morseCodeArea.setWrapStyleWord(true);
        morseCodeArea.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        JScrollPane morseCodeScroll = new JScrollPane(morseCodeArea);
        morseCodeScroll.setBounds(20,430,484,256);
        add(titleLabel);
        add(textInputLabel);
        add(textInputScroll);
        add(morseCodeInputLabel);
        add(morseCodeScroll);
    }
}
