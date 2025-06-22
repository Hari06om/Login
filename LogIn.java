// Importing the necessary packages for GUI components and event handling
import java.awt.*;         // Contains classes for creating GUI elements like Color, Font, etc.
import java.awt.event.*;   // Contains classes for handling events like button clicks
import javax.swing.*;      // Contains Swing components like JFrame, JButton, JTextField, etc.

class login  // Declaring the main class named 'login'
{
    public static void main(String[] arg)  // Main method: starting point of the Java program
    {
        // Creating a JFrame (main window) with title "LogIn"
        JFrame f = new JFrame("LogIn");
        
        // Setting the size of the window to 700 (width) x 800 (height)
        f.setSize(700, 800);

        // Ensuring the application closes when the user clicks the close button
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        // Centering the frame on the screen
        f.setLocationRelativeTo(null);

        // Setting background color of the frame to MAGENTA
        f.getContentPane().setBackground(Color.MAGENTA);

        // Setting layout manager to null for absolute positioning
        f.setLayout(null);

        // Creating a new Font object with Serif typeface, bold style, and size 24
        Font font1 = new Font(Font.SERIF, 1, 24);

        // Creating a text field with the default text "User Name"
        JTextField tf = new JTextField("User Name");

        // Adding the text field to the frame
        f.add(tf);

        // Applying the custom font to the text field
        tf.setFont(font1);

        // Setting the position and size of the text field (x, y, width, height)
        tf.setBounds(200, 200, 300, 50);

        // Creating a password field (for secure input)
        JPasswordField pf = new JPasswordField();

        // Adding the password field to the frame
        f.add(pf);

        // Setting a masking character (*) for the password field
        pf.setEchoChar('*');

        // Applying the custom font to the password field
        pf.setFont(font1);

        // Setting the position and size of the password field
        pf.setBounds(200, 280, 300, 50);

        // Creating a "Sign In" button
        JButton submit = new JButton("Sign In");

        // Adding the button to the frame
        f.add(submit);

        // Applying the custom font to the button
        submit.setFont(font1);

        // Setting the position and size of the "Sign In" button
        submit.setBounds(240, 360, 220, 50);

        // Adding an action listener to handle button click events
        submit.addActionListener((x) -> {
            // When clicked, a dialog box appears (though input isn't used)
            JOptionPane.showInputDialog(f, "Navigating to Home Page");
        });

        // Creating a "Reset" button
        JButton reset = new JButton("Reset");

        // Adding the reset button to the frame
        f.add(reset);

        // Applying the custom font to the reset button
        reset.setFont(font1);

        // Setting the position and size of the reset button
        reset.setBounds(240, 440, 220, 50);

        // Adding an action listener to the reset button
        reset.addActionListener((ac) -> {
            // When clicked, it clears the text from both fields
            tf.setText(null);
            pf.setText(null);
        });

        // Creating a JLabel to show a logo image from file "logo.jpg"
        JLabel logo = new JLabel(new ImageIcon("logo.jpg"));

        // Adding the image label to the frame
        f.add(logo);

        // Setting position and size for the logo image
        logo.setBounds(300, 50, 100, 100);

        // Optional: Background image label (currently commented out)
        // JLabel back = new JLabel(new ImageIcon("conclave.jpg"));
        // f.add(back);
        // back.setBounds(0, 0, 700, 800);

        // Making the frame visible to the user
        f.setVisible(true);
    }
}
