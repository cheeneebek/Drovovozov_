package Prack_work_5;

import javax.swing.*;

public class MacanKrasava {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите путь к изображению: java SimpleImageViewer <путь>");
            return;
        }

        JFrame frame = new JFrame("Изображение: " + args[0]);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JLabel label = new JLabel(new ImageIcon(args[0]));
        frame.add(label);

        frame.setVisible(true);
    }
}