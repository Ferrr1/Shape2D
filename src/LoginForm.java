import javax.swing.*;

public class LoginForm {
  public static void main(String[] args) {
    // Create a new JFrame container
    JFrame frame = new JFrame("Login Form");

    // Set the size of the frame
    frame.setSize(300, 150);

    // Terminate the program when the user closes the application
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a panel to hold the labels and text fields
    JPanel panel = new JPanel();

    // Add the username label
    JLabel usernameLabel = new JLabel("Username: ");
    panel.add(usernameLabel);

    // Add the text field for the username
    JTextField usernameField = new JTextField(20);
    panel.add(usernameField);

    // Add the password label
    JLabel passwordLabel = new JLabel("Password: ");
    panel.add(passwordLabel);

    // Add the text field for the password
    JTextField passwordField = new JTextField(20);
    panel.add(passwordField);

    // Add the login button
    JButton loginButton = new JButton("Login");
    panel.add(loginButton);

    // Add the panel to the frame
    frame.add(panel);

    // Show the frame
    frame.setVisible(true);
  }
}
