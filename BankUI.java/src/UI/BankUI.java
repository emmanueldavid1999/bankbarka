package UI;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BankUI {
    JFrame bankFrame = new JFrame("HELLO!!");
    JLabel bank_label = new JLabel("WELCOME TO JD BANK");
    JTextArea bank_area = new JTextArea(" Dear customer which account would you like to use? ");
    JButton bank_button = new JButton("CURRENT ACCOUNT");
    JButton getBank_button = new JButton("SAVINGS ACCOUNT");


    JFrame CurrentFrame = new JFrame("hello");
    JButton currentaccount = new JButton("WITHDRAWAL");
    JButton getCurrentaccount = new JButton("DEPOSIT");
    JTextField current_amount1 = new JTextField("AMOUNT");
    JTextField current_amount = new JTextField("AMOUNT");
    JTextField current_pin = new JTextField("insert PIN");
    JFrame SavingsFrame = new JFrame("THANK YOU FOR CHOOSING JD SAVINGS ACCOUNT");
    JLabel Savings = new JLabel("THANK YOU FOR CHOOSING JD SAVINGS ACCOUNT");
    JButton Withdrawalbutton = new JButton("WITHDRAWAL");
    JButton getSaving_account = new JButton("DEPOSIT");

    JTextField Savings_account2 = new JTextField("AMOUNT");
    JTextField Savings_pin = new JTextField( "PIN");
    JFrame WithdrawlFrame1 = new JFrame();
    JFrame Depositframe1 = new JFrame();
    JFrame WithdrawalFRAME2= new JFrame();

    JFrame getDepositframe2= new JFrame();


    public void mainUI() {
        bankFrame.add(bank_label);
        bankFrame.add(bank_area);
        bankFrame.add(bank_button);
        bankFrame.add(getBank_button);


        //NEED TO SEFlT BUTTON SIZE SO IT DONT OVERFLOW
////    bankFrame.add(Current_account);       //NOT WORKING
        bankFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        bankFrame.setVisible(true);
        bankFrame.setSize(200, 250);

        CurrentFrame = new JFrame();
        CurrentFrame.add(currentaccount);
        CurrentFrame.add(getCurrentaccount);
        CurrentFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        CurrentFrame.setVisible(true);
        CurrentFrame.setSize(200, 250);




        WithdrawlFrame1.add(current_amount);




        bank_button.addActionListener(e ->{
           // CurrentFrame;
            CurrentFrame.add(currentaccount);
            CurrentFrame.add(getCurrentaccount);

            CurrentFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
            CurrentFrame.setVisible(true);
            CurrentFrame.setSize(200, 250);

        });

       getBank_button.addActionListener(e ->{
            SavingsFrame.add(SavingsFrame);
            SavingsFrame.add(Savings);
           SavingsFrame.add(Savings_pin);
            SavingsFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
            SavingsFrame.setVisible(true);
            SavingsFrame.setSize(250, 300);


        });

        currentaccount.addActionListener(e ->{
            WithdrawlFrame1.setSize(200, 300);
           WithdrawlFrame1.setLayout(new FlowLayout(FlowLayout.TRAILING));
            WithdrawlFrame1.setVisible(true);
        });

        Depositframe1.add(current_amount1);

        getCurrentaccount.addActionListener(e -> {
                    Depositframe1.setSize(200, 300);
            Depositframe1.setLayout(new FlowLayout(FlowLayout.TRAILING));
            Depositframe1.setVisible(true);
                }  );

        getBank_button.addActionListener(e ->{
            SavingsFrame= new JFrame();
            SavingsFrame.add(SavingsFrame);
            SavingsFrame.add(Savings);
            SavingsFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
            SavingsFrame.setVisible(true);
            SavingsFrame.setSize(200, 250);


        });

            SavingsFrame= new JFrame();
            SavingsFrame.add(Withdrawalbutton);
            SavingsFrame.add(getSaving_account);
            SavingsFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        SavingsFrame.setVisible(true);
        SavingsFrame.setSize(200, 250);

        WithdrawalFRAME2.add(Savings_account2);
        getBank_button.addActionListener(e -> {
            SavingsFrame.add(SavingsFrame);
            SavingsFrame.add(Savings);

            SavingsFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
            SavingsFrame.setVisible(true);
            SavingsFrame.setSize(200, 250);


        });
        Withdrawalbutton.addActionListener(e ->{
            WithdrawalFRAME2.setSize(200, 300);
            WithdrawalFRAME2.setLayout(new FlowLayout(FlowLayout.TRAILING));
            WithdrawalFRAME2.setVisible(true);
        });


       getDepositframe2.add(Savings_account2);
       getSaving_account.addActionListener(e -> {

       });
    }
}




