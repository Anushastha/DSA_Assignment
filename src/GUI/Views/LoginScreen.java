package GUI.Views;


import GUI.Controller.UserController;
import GUI.Model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame implements ActionListener {
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signupButton;
    public static int USER_ID=0;

    public LoginScreen() {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        getContentPane().setBackground(Color.WHITE);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(usernameLabel, constraints);

        usernameField = new JTextField(30);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 15));
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(usernameField, constraints);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(passwordLabel, constraints);

        passwordField = new JPasswordField(30);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(passwordField, constraints);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 18));
        loginButton.addActionListener(this);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(255, 192, 203));
        loginButton.setPreferredSize(new Dimension(120, 40));
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        add(loginButton, constraints);

        signupButton = new JButton("Sign Up");
        signupButton.setFont(new Font("Arial", Font.PLAIN, 18));
        signupButton.addActionListener(this);
        signupButton.setForeground(Color.WHITE);
        signupButton.setBackground(new Color(255, 192, 203));
        signupButton.setPreferredSize(new Dimension(120, 40));
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        add(signupButton, constraints);

        setTitle("Login Screen");
        setSize(550, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == loginButton) {
// Validate the username and password fields
            if (usernameField.getText().trim().isEmpty() || passwordField.getPassword().length == 0) {
                JOptionPane.showMessageDialog(this, "Username or password cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }        UserController userController = new UserController();
            User user = userController.loginCustomerPreparedStatement(usernameField.getText().trim(), new String(passwordField.getPassword()));
            if (user != null) {
                JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Add code here to move to the next screen or display the desired information
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username or password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (event.getSource() == signupButton) {
            // Show the sign-up screen
            SignUpScreen signUpScreen = new SignUpScreen();
            signUpScreen.setVisible(true);
            dispose();
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginScreen screen = new LoginScreen();
            screen.setVisible(true);
        });
    }
}
