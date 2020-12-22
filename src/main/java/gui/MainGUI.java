package gui;

public class MainGUI
{
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Frame();
            }
        });
    }
}
