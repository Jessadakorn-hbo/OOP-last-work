import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstDemo {
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    private JButton subButton;
    private JButton multiplyButton;
    private JPanel mainForm;

    public FirstDemo() {
        addButton.addActionListener(new ActionListener() {
            @Override
            try {
            public void actionPerformed(ActionEvent e) {
                double result = doAdd(Double.parseDouble(textNumber1.getText()),
                        doAdd(Double.parseDouble(textNumber2.getText()));
                displayResult("Add Result", msg:result "",JOptionPane.INFORMATION_MESSAGE);
            } catch (Exeption err) {
                displayResult("ERROR" )
                }
            }
        });
    }
    private double doAdd(double n1, double n2) {
        return n1+n2;
    }
    private void
}
