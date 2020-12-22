package gui.actionListeners;

import common.Utils;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class ButtonWriteToFileListener implements ActionListener
{
    JTextField outputDataField;

    public ButtonWriteToFileListener(JTextField outputDataField)
    {
        this.outputDataField = outputDataField;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String outputData = outputDataField.getText();
        try
        {
            Utils.writeLineToFile(outputData, "outputGUI.txt");
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }
}
