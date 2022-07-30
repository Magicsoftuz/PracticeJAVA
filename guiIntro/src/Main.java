import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "Your age is " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Your height: "));
        JOptionPane.showMessageDialog(null, "Your height is "+ height);

    }
}