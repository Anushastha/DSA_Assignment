package GUI.Front;

import javax.swing.*;
import java.awt.*;

public class task extends JFrame {

    private JLabel taskIdLabel;
    private JTextField taskIdField;
    private JLabel taskNameLabel;
    private JTextField taskNameField;
    private JButton addButton;
    private JButton createJobButton;

    public task() {
        super("Add Task Here");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        Font labelFont = new Font("Arial", Font.BOLD, 20);
        Font inputFont = new Font("Arial", Font.PLAIN, 20);

        taskIdLabel = new JLabel("Task ID:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        taskIdLabel.setFont(labelFont);
        panel.add(taskIdLabel, constraints);

        taskIdField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        taskIdField.setFont(inputFont);
        panel.add(taskIdField, constraints);

        taskNameLabel = new JLabel("Task Name:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        taskNameLabel.setFont(labelFont);
        panel.add(taskNameLabel, constraints);

        taskNameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        taskNameField.setFont(inputFont);
        panel.add(taskNameField, constraints);

        addButton = new JButton("Add Task");
        addButton.setBackground(new Color(255, 192, 203));
        addButton.setForeground(Color.WHITE);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        addButton.setFont(labelFont);
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(addButton, constraints);

        createJobButton = new JButton("Create Job");
        createJobButton.setBackground(new Color(255, 192, 203));
        createJobButton.setForeground(Color.WHITE);
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        createJobButton.setFont(labelFont);
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(createJobButton, constraints);

        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new task();
    }
}
