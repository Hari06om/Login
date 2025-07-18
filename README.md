# Java Login Page GUI

A simple and elegant login interface built with Java Swing components, featuring a modern GUI design with customizable styling.

## Features

- **User-friendly Interface**: Clean and intuitive login form with username and password fields
- **Secure Password Input**: Password field with masked character display (*)
- **Interactive Buttons**: 
  - Sign In button with navigation confirmation
  - Reset button to clear form fields
- **Custom Styling**: 
  - Magenta background color
  - Serif font family with bold styling
  - Centered window layout
- **Logo Support**: Displays company/application logo from image file
- **Responsive Design**: Fixed window size (700x800) with absolute positioning

## Screenshots

![Login Page](logo.jpg)
*Note: Add your actual screenshot here*

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, VS Code, etc.) or command line

## Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/java-login-page.git
   cd java-login-page
   ```

2. **Prepare the logo image**
   - Place your logo image file named `logo.jpg` in the same directory as the Java file
   - Recommended logo dimensions: 100x100 pixels

3. **Compile the program**
   ```bash
   javac login.java
   ```

4. **Run the application**
   ```bash
   java login
   ```

## Usage

1. **Launch the application** - The login window will appear centered on your screen
2. **Enter credentials**:
   - Click on the username field and replace "User Name" with your username
   - Click on the password field and enter your password (displayed as asterisks)
3. **Sign In** - Click the "Sign In" button to proceed (shows navigation confirmation)
4. **Reset Form** - Click the "Reset" button to clear both input fields

## File Structure

```
java-login-page/
├── login.java          # Main application file
├── logo.jpg           # Logo image file (required)
├── README.md          # This documentation file
└── conclave.jpg       # Optional background image (commented out)
```

## Customization

### Changing Colors
```java
// Modify background color
f.getContentPane().setBackground(Color.BLUE);  // Change MAGENTA to any color
```

### Updating Fonts
```java
// Modify font properties
Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 20);  // Change family, style, size
```

### Adjusting Window Size
```java
// Change window dimensions
f.setSize(800, 600);  // width x height
```

### Adding Background Image
Uncomment the background image code and ensure `conclave.jpg` exists:
```java
JLabel back = new JLabel(new ImageIcon("conclave.jpg"));
f.add(back);
back.setBounds(0, 0, 700, 800);
```

## Technical Details

- **Framework**: Java Swing
- **Layout Manager**: Absolute positioning (null layout)
- **Event Handling**: Lambda expressions for button actions
- **Components Used**:
  - JFrame (main window)
  - JTextField (username input)
  - JPasswordField (password input)
  - JButton (sign in/reset buttons)
  - JLabel (logo display)

## Known Issues

- The current implementation doesn't validate actual credentials
- Sign In button shows a simple dialog instead of proper authentication
- No database integration for user management

## Future Enhancements

- [ ] Add user authentication functionality
- [ ] Implement database connectivity
- [ ] Add "Remember Me" checkbox
- [ ] Include "Forgot Password" option
- [ ] Add input validation and error handling
- [ ] Implement responsive design for different screen sizes
- [ ] Add themes/dark mode support

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact


Project Link: [https://github.com/Hari06om/java-login-page](https://github.com/Hari06om/java-login-page)

## Acknowledgments

- Java Swing documentation
- Oracle Java tutorials
- Open source community for inspiration
