package HW_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public void init() {

        setVisible(true);
        setSize(500,500);
        setLocation(700, 150);
        setTitle("Geek Brains");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridLayout layout = new GridLayout(1, 2);
        JPanel panel = new JPanel(layout);

        JButton button1 = new JButton("Старт");
        panel.add(button1);

        JButton button2 = new JButton("Выход");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(button2);

        add(panel, BorderLayout.SOUTH);


    }

}
