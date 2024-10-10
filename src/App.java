import javax.swing.*;
import java.lang.module.ModuleReader;

public class App {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               new MorseCodeTransGUI().setVisible(true);
            }
        });
    }
}
