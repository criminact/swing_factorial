import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Engine implements ActionListener {

    UI ui;
    long number;
    long fact = 1;

    public Engine(UI ui){
        this.ui = ui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            fact = 1;
            number = Long.parseLong(ui.getText());
            factorial(number);
            ui.setText(String.valueOf(fact));
        }
    }

    synchronized public void factorial(long _x){
        if(_x > 1){
            fact = fact * _x;
            factorial(_x - 1);
        }
    }
}
