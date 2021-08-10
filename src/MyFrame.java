import javax.swing.JFrame;

public class MyFrame extends JFrame
{
    public MyFrame()
    {
        MyPanel r = new MyPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(r);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
    

