package GUI.Front;

import javax.swing.*;
import java.awt.*;

public class job extends JFrame {

    private JLabel jobIdLabel;
    private JTextField jobIdField;
    private JLabel profitLabel;
    private JTextField profitField;
    private JButton jobButton;

    public job() {
        super("Add Jobs Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(20, 20, 20, 20);

        Font labelFont = new Font("Arial", Font.BOLD, 20);
        Font inputFont = new Font("Arial", Font.PLAIN, 20);

        jobIdLabel = new JLabel("Job ID:");
        jobIdLabel.setFont(labelFont);
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(jobIdLabel, constraints);

        jobIdField = new JTextField(20);
        jobIdField.setFont(inputFont);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(jobIdField, constraints);

        profitLabel = new JLabel("Add job:");
        profitLabel.setFont(labelFont);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(profitLabel, constraints);

        profitField = new JTextField(20);
        profitField.setFont(inputFont);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(profitField, constraints);

        jobButton = new JButton("Add job");
        jobButton.setBackground(new Color(255, 193, 193)); // baby pink color
        jobButton.setForeground(Color.WHITE);
        jobButton.setFont(labelFont);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(jobButton, constraints);

        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new job();
    }
}
