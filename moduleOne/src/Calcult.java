import javax.swing.*;

public class Calcult {
    private JButton expButton;
    private JButton logButton;
    private JTextField textChiffreOne;
    private JTextField textChiffreDeux;
    private JLabel Resultat;
    private JButton additionButton;
    private JButton soustractionButton;
    private JButton multiplicationButton;
    private JButton divisionButton;
    private JButton racineCarreeButton;
    private JButton puissanceButton;
    private JButton pourcentageButton;
    private JButton cosinusButton;
    private JTextField textField1;
    private JButton sinusButton;
    private JPanel Principale;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calcult");
        frame.setContentPane(new Calcult().Principale);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public double convertText(String texteAConvertir) {
        double res;
        try {
            res = Double.parseDouble(texteAConvertir);
            return res;
        } catch (Exception e) {
            System.out.println("impossible de convertir");
        }
        return -1;

    }
}