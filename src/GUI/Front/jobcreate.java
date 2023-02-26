package GUI.Front;

import javax.swing.*;
import java.awt.*;

public class jobcreate extends JFrame {

    private JLabel jobIdLabel;
    private JTextField jobIdField;
    private JLabel profitLabel;
    private JTextField profitField;
    private JLabel numTaskLabel;
    private JTextField numTaskField;
    private JLabel jobNameLabel;
    private JTextField jobNameField;
    private JLabel endTimeLabel;
    private JTextField endTimeField;
    private JButton createButton;
    private JButton dependency;

    public jobcreate() {
        super("Create Job");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        getContentPane().setBackground(Color.WHITE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        jobIdLabel = new JLabel("Job ID:");
        jobIdLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(jobIdLabel, constraints);

        jobIdField = new JTextField(20);
        jobIdField.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(jobIdField, constraints);

        profitLabel = new JLabel("Profit:");
        profitLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(profitLabel, constraints);

        profitField = new JTextField(20);
        profitField.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(profitField, constraints);

        numTaskLabel = new JLabel("Number of Tasks:");
        numTaskLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(numTaskLabel, constraints);

        numTaskField = new JTextField(20);
        numTaskField.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(numTaskField, constraints);

        jobNameLabel = new JLabel("Job Name:");
        jobNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(jobNameLabel, constraints);

        jobNameField = new JTextField(20);
        jobNameField.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(jobNameField, constraints);

        endTimeLabel = new JLabel("End Time:");
        endTimeLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(endTimeLabel, constraints);

        endTimeField = new JTextField(20);
        endTimeField.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        constraints.gridy = 4;
        panel.add(endTimeField, constraints);

        createButton = new JButton("Create job");
        createButton.setBackground(new Color(255, 204, 229)); // Baby pink
        createButton.setForeground(Color.WHITE);
        createButton.setFont(new Font("Arial", Font.BOLD, 16));
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(createButton, constraints);

        dependency = new JButton("Dependency");
        dependency.setBackground(new Color(255, 204, 229)); // Baby pink
        dependency.setForeground(Color.WHITE);
        dependency.setFont(new Font("Arial", Font.BOLD, 16));
        constraints.gridx = 0;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(dependency, constraints);

        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new jobcreate();
    }
}
