import javax.swing.*;

public class Calcult{
    private JButton button1;
    private JButton button2;
    private JTextField textChiffreOne;
    private JTextField textChiffreDeux;
    private JLabel Resultat;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JTextField textField1;
    private JButton button11;
    private JPanel Principale;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calcult");
        frame.setContentPane(new Calcult().Principale);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
