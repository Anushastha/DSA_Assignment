package GUI.Front;

import javax.swing.*;
import java.awt.*;

public class dependency {

    public static void main(String[] args) {

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE); // Set panel background color
        JFrame frame = new JFrame();
        frame.setTitle("Job Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.anchor = GridBagConstraints.WEST;

        JLabel label = new JLabel("Job ID:");
        label.setFont(new Font("Arial", Font.PLAIN, 20)); // Set label font size
        label.setForeground(Color.BLACK); // Set label foreground color
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(label, constraints);

        JTextField IDText = new JTextField(20);
        IDText.setFont(new Font("Arial", Font.PLAIN, 20)); // Set text field font size
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(IDText, constraints);

        // Add first dropdown
        JLabel label1 = new JLabel("Current Task:");
        label1.setFont(new Font("Arial", Font.PLAIN, 20)); // Set label font size
        label1.setForeground(Color.BLACK); // Set label foreground color
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(label1, constraints);

        String[] options1 = {"Option A", "Option B", "Option C"};
        JComboBox<String> dropdown1 = new JComboBox<>(options1);
        dropdown1.setFont(new Font("Arial", Font.PLAIN, 20)); // Set dropdown font size
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(dropdown1, constraints);

        // Add second dropdown
        JLabel label2 = new JLabel("Dependent Task:");
        label2.setFont(new Font("Arial", Font.PLAIN, 20)); // Set label font size
        label2.setForeground(Color.BLACK); // Set label foreground color
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(label2, constraints);

        String[] options2 = {"Option X", "Option Y", "Option Z"};
        JComboBox<String> dropdown2 = new JComboBox<>(options2);
        dropdown2.setFont(new Font("Arial", Font.PLAIN, 20)); // Set dropdown font size
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(dropdown2, constraints);

        JButton button = new JButton("Select");
        button.setBackground(new Color(255, 192, 203)); // Set button background color
        button.setForeground(Color.WHITE); // Set button foreground color
        button.setFont(new Font("Arial", Font.PLAIN, 20)); // Set button font size
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(button, constraints);

        frame.add(panel);
        frame.setVisible(true);
    }
}
