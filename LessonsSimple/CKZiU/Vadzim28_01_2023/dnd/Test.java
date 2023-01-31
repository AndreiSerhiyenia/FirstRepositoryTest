package dnd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame implements ActionListener {

    final static String MotifLF = "com.sun.java.swing.plaf.motif.MotifLookAndFeel",
            JavaLF = UIManager.getCrossPlatformLookAndFeelClassName(),
            WindowsLF = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel",
            NimbusLF = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";


    Test(String tit) {
        super(tit);
        setLayout(new FlowLayout());
        add(new JCheckBox("CheckBox"));
        add(new JRadioButton("Radio"));
        JTextField tf = new JTextField(10);
        add(new JLabel("textField"), "align right");
        add(new JTextField(10), "span, wrap");
        add(new JLabel("Slider"), "align right");
        add(new JSlider(0, 100), "span, wrap");


        add(createButton("Motif", MotifLF), "align right");
        add(createButton("Java", JavaLF));
        add(createButton("Nimbus", NimbusLF));
        add(createButton("Windows", WindowsLF));

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    JButton createButton(String txt, String lafClass) {
        JButton b = new JButton(txt);
        b.setActionCommand(lafClass);
        b.addActionListener(this);
        return b;
    }

    public void actionPerformed(ActionEvent e) {
        String laf = e.getActionCommand();
        try {
            UIManager.setLookAndFeel(laf);
            setTitle(laf.substring(laf.lastIndexOf('.') +1));
        } catch (Exception exc) {
            System.out.println("Nie umiem ustalic L&F = " + laf);
        }
        SwingUtilities.updateComponentTreeUI(this);
        pack();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(JavaLF);
        } catch (Exception excp) {
            System.out.println("Nie umiem ustalic L&F");
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Test("MetalLookAndFeel");
            }
        });
    }
}
