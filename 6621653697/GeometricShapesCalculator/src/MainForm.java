import javax.swing.*;

public class MainForm {
    private JButton circularConeButton;
    private JButton circularCylinderButton;
    private JButton rentangularPrismButton;
    private JLabel CircularConelabel;
    private JLabel CircularCylinderlabel;
    private JLabel RectangularPrismLabel;
    private JPanel MainPanel;

    public MainForm() {
        initialFormProperties();
    }
    private void initialFormProperties() {
        try {
            CircularConelabel.setIcon(new imageicon(this.getClass().getResource("/resources/circularcone.png")));
            CircularCylinderlabel.setIcon(new imageicon(this.getClass().getResource("/resources/circularcylinder.png")));
            RectangularPrismLabel.setIcon(new imageicon(this.getClass().getResource("/resources/rectangularprism.png")));
        }catch (Exception err) {
            displayError(err.getMessage());
        }

        private void displayError(String msg) {
            JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        }

        public static void main(String[] args)
    }
