

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavingsAccount {
    private final int DEFAULT_PIN = 5555;

    private JFrame savingsFrame;
    private JLabel savingsLabel;
    private JButton savingsWithdrawalButton;
    private JButton savingsDepositButton;
    private JTextField savingsAmountField;
    private JTextField savingsPinField;

    public SavingsAccount() {
        initializeUI();
        addEventListeners();
    }

    private void initializeUI() {
        savingsFrame = new JFrame("JD SAVINGS ACCOUNT");
        savingsLabel = new JLabel("THANK YOU FOR CHOOSING JD SAVINGS ACCOUNT");
        savingsWithdrawalButton = new JButton("WITHDRAWAL");
        savingsDepositButton = new JButton("DEPOSIT");
        savingsAmountField = new JTextField("        ");
        savingsPinField = new JTextField("         ");

        savingsFrame.setLayout(new FlowLayout());
        savingsFrame.add(savingsLabel);
        savingsFrame.add(savingsWithdrawalButton);
        savingsFrame.add(savingsDepositButton);
        savingsFrame.add(savingsAmountField);
        savingsFrame.add(savingsPinField);
        savingsFrame.setSize(300, 150);
    }

    private void addEventListeners() {
        savingsWithdrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pin = Integer.parseInt(savingsPinField.getText());
                if (pin == DEFAULT_PIN) {
                    double amount = Double.parseDouble(savingsAmountField.getText());
                    // Perform withdrawal logic for savings account
                    JOptionPane.showMessageDialog(null, "Withdrawal successful.");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid PIN.");
                }
            }
        });

        savingsDepositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pin = Integer.parseInt(savingsPinField.getText());
                if (pin == DEFAULT_PIN) {
                    double amount = Double.parseDouble(savingsAmountField.getText());
                    // Perform deposit logic for savings account
                    JOptionPane.showMessageDialog(null, "Deposit successful.");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid PIN.");
                }
            }
        });
    }

    public void show() {
        savingsFrame.setVisible(true);
    }
}
