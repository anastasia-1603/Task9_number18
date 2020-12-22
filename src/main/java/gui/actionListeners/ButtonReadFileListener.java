package gui.actionListeners;

import common.Utils;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.List;

public class ButtonReadFileListener implements ActionListener
{
    JTextField inputDataField;

    public ButtonReadFileListener(JTextField inputDataField)
    {
        this.inputDataField = inputDataField;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        List<Integer> inputList = null;
        try
        {
            inputList = Utils.readListFromFile("input.txt");
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
        inputDataField.setText(Utils.toString(inputList));
    }
}
