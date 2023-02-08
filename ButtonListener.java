line user1
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    JLabel jLabel = null;

    public ButtonListener(JLabel jLabel) {
        this.jLabel = jLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jLabel != null && e.getSource() instanceof JButton) {
            String title = ((JButton) e.getSource()).getText();
            jLabel.setForeground(getButtonColor(title));

            jLabel.setText(title);
        }
    }
from branch add from master




    public Color getButtonColor(String nameButton) {
        if ("1".equals(nameButton)) {
            return Color.RED;
        } else if ("2".equals(nameButton)) {
            return Color.GREEN;
        } else if ("3".equals(nameButton)) {
            return Color.MAGENTA;
        }
        return Color.BLACK;
    }
}
