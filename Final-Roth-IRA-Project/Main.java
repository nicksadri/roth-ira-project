import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Main {
  public static void main(String[] args) {

    JTextField nameField = new JTextField(5);
    JTextField ageField = new JTextField(5);
    JTextField ageOfRetireField = new JTextField(5);
    JTextField currentBalanceField = new JTextField(5);
    JTextField monthlyField = new JTextField(5);
    JTextField rateField = new JTextField(5);

    JPanel myPanel = new JPanel();
    myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.PAGE_AXIS));
    myPanel.add(new JLabel("Enter your name:"));
    myPanel.add(nameField);
    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
    myPanel.add(new JLabel("Enter your age:"));
    myPanel.add(ageField);
    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
    myPanel.add(new JLabel("Enter your retirement age:"));
    myPanel.add(ageOfRetireField);
    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
    myPanel.add(new JLabel("Enter your current balance:"));
    myPanel.add(currentBalanceField);
    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
    myPanel.add(new JLabel("Enter your monthly contribution:"));
    myPanel.add(monthlyField);
    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
    myPanel.add(new JLabel("Enter your rate of return as a decimal (for example, 0.07):"));
    myPanel.add(rateField);

    int result = JOptionPane.showConfirmDialog(null, myPanel, "Please enter the values listed below.", JOptionPane.OK_CANCEL_OPTION);

    double futureBalance = Double.parseDouble(currentBalanceField.getText()); 
    int age = Integer.parseInt(ageField.getText()); 
    int ageOfRetire = Integer.parseInt(ageOfRetireField.getText());
    int monthly = Integer.parseInt(monthlyField.getText());
    double rate = Double.parseDouble(rateField.getText());
    
    for (int i = age + 1; i < ageOfRetire; i++) {
      futureBalance += monthly * 12;
      futureBalance *= (double)(1 + rate);
    }
    
    futureBalance += monthly * 12;
    
    if (result == JOptionPane.OK_OPTION) {
      JOptionPane.showMessageDialog(null, "Hello, " + nameField.getText() + "!\nYour future balance at retirement age will be: $" + String.format("%.2f", futureBalance));
    }

    
    
    
  }
}

// xField.getText()





// String name = JOptionPane.showInputDialog("Enter your name: ");
//     int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
//     int ageOfRetire = Integer.parseInt(JOptionPane.showInputDialog("Enter your retirement age: "));
//     double currentBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter the current balance: "));
//     double monthly = Double.parseDouble(JOptionPane.showInputDialog("Enter your monthly contribution: "));
//     double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter your rate of return as a decimal (for example, 0.07): "));

//     // int numYears = ageOfRetire - age - 1;
    // double futureBalance = currentBalance;

    // for (int i = age + 1; i < ageOfRetire; i++) {
    //   futureBalance += monthly * 12;
    //   futureBalance *= (double)(1 + rate);
    // }
    // futureBalance += monthly * 12;
    
//     // currentBalance * Math.pow((1.07), numYears)) + ((monthly * 12) * Math.pow((1.07), numYears));
    
//     JOptionPane.showMessageDialog(null, "Hello, " + name + "!\nYour future balance at retirement age will be: $" + String.format("%.2f", futureBalance));





