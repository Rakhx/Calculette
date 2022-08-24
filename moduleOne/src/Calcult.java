import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    
        public Calcult() {
        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double nombreone = convertText(textChiffreOne.getText());
                double nombretwo= convertText(textChiffreDeux.getText());
               double rest=  calculGrp3.addition(nombreone,nombretwo);
                Resultat.setText(""+rest);


            }
        });
        pourcentageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double nombreone = convertText(textChiffreOne.getText());
                double nombretwo= convertText(textChiffreDeux.getText());
                double pourcentage= calculGrp3.pourcentage(nombreone,nombretwo);
                Resultat.setText(""+pourcentage + "%");

            }
        });


        cosinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double nombreone= convertText(textChiffreOne.getText());
                double cosinus = calculGrp3.cosinus(nombreone);
                Resultat.setText("" + cosinus);

            }
        });
            soustractionButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String s1 = textChiffreOne.getText();
                    String s2 = textChiffreDeux.getText();
                    double d1 = convertText(s1);
                    double d2 = convertText(s2);
                    double soustraction = CalculGrp2.soustraction(d1,d2);


                }
            });



            sinusButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    double nombreone= convertText(textChiffreOne.getText());

                    double sinus = CalculGrp2.sinus(nombreone);
                    Resultat.setText("" + sinus);

                }
            });

            racineCarreeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    double nombreone= convertText(textChiffreOne.getText());
                    double racineCarree = CalculGrp2.racineCarree(nombreone);
                    Resultat.setText("" + racineCarree);

                }
            });
        }

    public static void  main(String[] args) {
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
