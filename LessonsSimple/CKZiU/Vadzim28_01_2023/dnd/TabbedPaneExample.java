package LessonsSimple.CKZiU.Vadzim28_01_2023.dnd;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TabbedPaneExample {
    JComboBox<String> jcb = new JComboBox<>();
    JComboBox checkBox = new JComboBox();
    JTextField textField = new JTextField(10);


    private JTabbedPane jTabbedPane;

    JLabel jLabelTxt = new JLabel("Text");
    JLabel jLabelcb = new JLabel("Check");
    JLabel jLabelcbx = new JLabel("ComboBox");


    private JTabbedPane buildTabbedPane() {
        jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("Input", tabbed1());
        jTabbedPane.addTab("Output", tabbed2());
        jTabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            if (jTabbedPane.getSelectedIndex() == 1){
                //jLabelcbx.setText("Combobox " + jcb.getSelectedItem(),toString());
                jLabelTxt.setText("Text field " + textField.getText());
            }
            }
        });
        return new JTabbedPane();


    }

    private JPanel tabbed1() {
        JPanel panel = new JPanel();

        jcb.addItem("van");
        jcb.addItem("cok");
        jcb.addItem("str");

        panel.add(textField);
        panel.add(jcb);
        panel.add(checkBox);
        return panel;
    }

    private JPanel tabbed2() {
        JPanel panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.add(jLabelTxt);
        panel.add(jLabelcb);
        panel.add(jLabelcbx);
        return panel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        TabbedPaneExample tabbedPaneExample = new TabbedPaneExample();
        frame.setContentPane(tabbedPaneExample.buildTabbedPane());

        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
