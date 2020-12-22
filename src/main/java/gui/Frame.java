package gui;

import gui.actionListeners.ButtonExecuteListener;
import gui.actionListeners.ButtonReadFileListener;
import gui.actionListeners.ButtonWriteToFileListener;
import javax.swing.*;

public class Frame extends JFrame
{
    private JPanel panel;
    private JTextField inputDataField;
    private JTextField outputDataField;
    private JButton buttonExecute;
    private JButton buttonReadFile;
    private JButton buttonWriteToFile;
    private JLabel inputTextLabel;
    private JLabel outputTextLabel;

    public Frame()
    {
        super("Calculations");

        panel = new JPanel();
        buttonExecute = new JButton("Execute");
        buttonReadFile = new JButton("Read data from file");
        buttonWriteToFile = new JButton("Write result to file");
        inputTextLabel = new JLabel("Enter a list of integers.");
        outputTextLabel = new JLabel("Result");
        inputDataField = new JTextField();
        outputDataField = new JTextField();

        addActionToButtons();
        addComponentsToPanel();
        initFrame(panel);
    }

    private void addActionToButtons()
    {
        buttonExecute.addActionListener(new ButtonExecuteListener(inputDataField, outputDataField));
        buttonReadFile.addActionListener(new ButtonReadFileListener(inputDataField));
        buttonWriteToFile.addActionListener(new ButtonWriteToFileListener(outputDataField));
    }

    private void addComponentsToPanel()
    {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(inputTextLabel);
        panel.add(inputDataField);
        panel.add(buttonExecute);
        panel.add(buttonReadFile);
        panel.add(buttonWriteToFile);
        panel.add(outputTextLabel);
        panel.add(outputDataField);
    }

    private void initFrame(JPanel panel)
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 500, 210);
        this.setContentPane(panel);
        this.setVisible(true);
    }
}
