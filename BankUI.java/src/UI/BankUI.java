

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BankUI {
    private final int DEFAULT_PIN = 5555;

    private JFrame bankFrame;
    private JLabel bank_label;
    private JTextArea bank_area;
    private JButton bank_button;
    private JButton getBank_button;

    private JFrame currentFrame;
    private JButton currentAccountWithdrawalButton;
    private JButton currentAccountDepositButton;
    private JTextField currentAmountField;
    private JTextField currentPinField;

    private JFrame savingsFrame;
    private JLabel savingsLabel;
    private JButton savingsWithdrawalButton;
    private JButton savingsDepositButton;
    private JTextField savingsAmountField;
    private JTextField savingsPinField;

    public BankUI() {
        initializeUI();
        addEventListeners();
    }

    private void initializeUI() {
        bankFrame = new JFrame("JD BANK");
        bankFrame.setLayout(new FlowLayout());
        bankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bank_label = new JLabel("WELCOME TO JD BANK");
        bank_area = new JTextArea("Dear customer, which account would you like to use?");
        bank_button = new JButton("CURRENT ACCOUNT");
        getBank_button = new JButton("SAVINGS ACCOUNT");

        bankFrame.add(bank_label);
        bankFrame.add(bank_area);
        bankFrame.add(bank_button);
        bankFrame.add(getBank_button);
        bankFrame.setSize(300, 250);
        bankFrame.setVisible(true);

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
        currentFrame.setSize(300, 250);

        savingsFrame = new JFrame("JD SAVINGS ACCOUNT");
        savingsLabel = new JLabel("THANK YOU FOR CHOOSING JD SAVINGS ACCOUNT");
        savingsWithdrawalButton = new JButton("WITHDRAWAL");
        savingsDepositButton = new JButton("DEPOSIT");
        savingsAmountField = new JTextField("            ");
        savingsPinField = new JTextField("             ");

        savingsFrame.setLayout(new FlowLayout());
        savingsFrame.add(savingsLabel);
        savingsFrame.add(savingsWithdrawalButton);
        savingsFrame.add(savingsDepositButton);
        savingsFrame.add(savingsAmountField);
        savingsFrame.add(savingsPinField);
        savingsFrame.setSize(300, 150);
    }

    private void addEventListeners() {
        bank_button.addActionListener(e -> {
            bankFrame.setVisible(false);
            currentFrame.setVisible(true);
        });

        getBank_button.addActionListener(e -> {
            bankFrame.setVisible(false);
            savingsFrame.setVisible(true);
        });

        currentAccountWithdrawalButton.addActionListener(e -> {
            int pin = Integer.parseInt(currentPinField.getText());
            if (pin == DEFAULT_PIN) {
                double amount = Double.parseDouble(currentAmountField.getText());
                // Perform withdrawal logic for current account
                JOptionPane.showMessageDialog(null, "Withdrawal successful.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid PIN.");
            }
        });

        currentAccountDepositButton.addActionListener(e -> {
            int pin = Integer.parseInt(currentPinField.getText());
            if (pin == DEFAULT_PIN) {
                double amount = Double.parseDouble(currentAmountField.getText());
                // Perform deposit logic for current account
                JOptionPane.showMessageDialog(null, "Deposit successfulLY DONE.");
            } else {
                JOptionPane.showMessageDialog(null, "WRONG PIN.");
            }
        });

        savingsWithdrawalButton.addActionListener(e -> {
            int pin = Integer.parseInt(savingsPinField.getText());
            if (pin == DEFAULT_PIN) {
                double amount = Double.parseDouble(savingsAmountField.getText());
                // Perform withdrawal logic for savings account
                JOptionPane.showMessageDialog(null, "Withdrawal successful done.");
            } else {
                JOptionPane.showMessageDialog(null, "Wrong PIN.");
            }
        });

        savingsDepositButton.addActionListener(e -> {
            int pin = Integer.parseInt(savingsPinField.getText());
            if (pin == DEFAULT_PIN) {
                double amount = Double.parseDouble(savingsAmountField.getText());
                // Perform deposit logic for savings account
                JOptionPane.showMessageDialog(null, "Deposit successful.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid PIN.");
            }
        });
    }

    public void mainUI() {
        SwingUtilities.invokeLater(() -> {
            new BankUI();
        });
    }
}













































