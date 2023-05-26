

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrentAccount {
    private final int DEFAULT_PIN = 5555;

    private JFrame currentFrame;
    private JButton currentAccountWithdrawalButton;
    private JButton currentAccountDepositButton;
    private JTextField currentAmountField;
    private JTextField currentPinField;

    public CurrentAccount() {
        initializeUI();
        addEventListeners();
    }

    private void initializeUI() {
        currentFrame = new JFrame("CURRENT ACCOUNT");
        currentAccountWithdrawalButton = new JButton("WITHDRAWAL");
        currentAccountDepositButton = new JButton("DEPOSIT");
        currentAmountField = new JTextField("AMOUNT");
        currentPinField = new JTextField("PIN");

        currentFrame.setLayout(new FlowLayout());
        currentFrame.add(currentAccountWithdrawalButton);
        currentFrame.add(currentAccountDepositButton);
        currentFrame.add(currentAmountField);
        currentFrame.add(currentPinField);
        currentFrame.setSize(300, 150);
    }

    private void addEventListeners() {
        currentAccountWithdrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pin = Integer.parseInt(currentPinField.getText());
                if (pin == DEFAULT_PIN) {
                    double amount = Double.parseDouble(currentAmountField.getText());
                    // Perform withdrawal logic for current account
                    JOptionPane.showMessageDialog(null, "Withdrawal successful.");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid PIN.");
                }
            }
        });

        currentAccountDepositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pin = Integer.parseInt(currentPinField.getText());
                if (pin == DEFAULT_PIN) {
                    double amount = Double.parseDouble(currentAmountField.getText());
                    // Perform deposit logic for current account
                    JOptionPane.showMessageDialog(null, "Deposit successful.");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid PIN.");
                }
            }
        });
    }

    public void show() {
        currentFrame.setVisible(true);
    }
}
