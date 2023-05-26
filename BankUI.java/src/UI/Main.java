package UI;

import UI.BankUI;
import UI.Current_account;
import UI.savings_account;

import javax.swing.*;
import java.util.Scanner;




public class Main {
    public static void main(String[]args){
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                BankUI gui = new BankUI();
//
//            }
//        });
        BankUI bankUI = new BankUI();
        bankUI. mainUI();
    }
}