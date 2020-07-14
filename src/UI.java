import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class UI {

    private JLabel number;
    private JTextField numberField;
    private JLabel result;
    private JTextField resultField;
    private JButton button;

    private FlowLayout flowLayout;
    private JPanel windowPane;
    private JFrame frame;

    public UI(){

        Engine engine = new Engine(this);

        windowPane = new JPanel();
        flowLayout = new FlowLayout();

        windowPane.setLayout(flowLayout);

        number = new JLabel("Number");
        numberField = new JTextField(5);
        result = new JLabel("Result");
        resultField = new JTextField(5);
        button = new JButton("Calculate");

        resultField.setEditable(false);

        button.addActionListener(engine);

        windowPane.add(number);
        windowPane.add(numberField);
        windowPane.add(result);
        windowPane.add(resultField);
        windowPane.add(button);

        frame = new JFrame("Swing Factorial");
        frame.setContentPane(windowPane);

        frame.setSize(new Dimension(400, 80));
        frame.setVisible(true);
    }

    public void setText(String _text){
        this.resultField.setText(_text);
    }

    public String getText(){
        return this.numberField.getText();
    }
}
