package chapter13;

import javax.swing.*;

public class ThreadEx6 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter any value");
        System.out.println("the value you entered : " + input);

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
