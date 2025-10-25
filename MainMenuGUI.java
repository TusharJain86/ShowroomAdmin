import javax.swing.*;

import CarRentSystem.SimpleCarRentalUI;

import java.awt.*;

public class MainMenuGUI extends JFrame {

    public MainMenuGUI() {
        setTitle("Main Menu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 10, 10));

        JLabel title = new JLabel("Select a System", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        add(title);

        JButton payrollButton = new JButton("Open Payroll System");
        JButton carRentalButton = new JButton("Open Car Rental System");

        add(payrollButton);
        add(carRentalButton);

        // Open Payroll System
        payrollButton.addActionListener(e -> new PayrollUI().setVisible(true));

        // Open Car Rental System
        carRentalButton.addActionListener(e -> new SimpleCarRentalUI().setVisible(true));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainMenuGUI().setVisible(true));
    }
}
