
import javax.swing.*;       //needed for swing classes
import java.awt.event.*;    //for actionListener interface

public class Micro1Viewer extends JFrame
{
    private JPanel panel; 
    private JLabel messageLabel;
    private JTextField R0Field;
    private JTextField R1Field;
    private JTextField R2Field;
    private JTextField R3Field;
    private JTextField R4Field;
    private JTextField R5Field;
    private JTextField R6Field;
    private JTextField R7Field;
    private JButton stepButton;
    private JButton loadButton;
    private JButton memoryButton;
    private JButton registersButton;
    private final int WINDOW_WIDTH = 350;
    private final int WINDOW_HEIGHT = 450;
    
    public Micro1Viewer() 
    {
        //set window
        setTitle("Micro1Viewer");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //close window with 'x' at window's right, top corner
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //build panel and add it to frame
        buildPanel();
        add(panel);
        
        //display window
        setVisible(true);
    }
        private void buildPanel() 
        {
            //get register values
            messageLabel = new JLabel("Enter register values");
            R0Field = new JTextField(16);
            R1Field = new JTextField(16);
            R2Field = new JTextField(16);
            R3Field = new JTextField(16);
            R4Field = new JTextField(16);
            R5Field = new JTextField(16);
            R6Field = new JTextField(16);
            R7Field = new JTextField(16);
            
            //create command buttons
            stepButton = new JButton("Step");
            stepButton.addActionListener(new StepButtonListener());
            
            loadButton = new JButton("Load");
            memoryButton = new JButton("Memory");
            registersButton = new JButton("Registers");
            
            //create JPanel object
            panel = new JPanel();
            
            //add label, textfield, button componenets to panel
            panel.add(messageLabel);
            panel.add(R0Field);
            panel.add(R1Field);
            panel.add(R2Field);
            panel.add(R3Field);
            panel.add(R4Field);
            panel.add(R5Field);
            panel.add(R6Field);
            panel.add(R7Field);
            panel.add(stepButton);
            panel.add(loadButton);
            panel.add(memoryButton);
            panel.add(registersButton);
        }
        
        private class StepButtonListener implements ActionListener 
        {
            public void actionPerformed(ActionEvent e) 
            {
                //step();
            }
        }
}
