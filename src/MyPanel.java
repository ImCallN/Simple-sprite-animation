import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener
{
    final int PANEL_WIDTH = 220;
    final int PANEL_HEIGHT = 220;

    ImgManager imageManager = new ImgManager();
    String root = "images/player";

    int animationTimer = 1000;
    int imageNumber = 0;
    Image character;
    Timer timer;
    int x = 110;
    int y = 110;

    public MyPanel()
    {   
        imageManager.loadImages(root);
        imageManager.showNames();

        System.out.println(imageManager.getSize());
        character = imageManager.returnImage(imageNumber);
        //Setting up the settings on the JPanel
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.BLACK);

        //initializing the Timer
        timer = new Timer(1000, this);
        timer.start();
    }

    //Paint method to paint everything
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(character, x, y, null);
    }
    
    
    @Override
    //Action Method to fire off on every timer event
    public void actionPerformed(ActionEvent e)
    {
        
        if(imageNumber >= imageManager.getSize() - 1)
        {
            imageNumber = 0;
        }
        else imageNumber++;
        character = imageManager.returnImage(imageNumber);
        System.out.println(imageNumber);
        repaint();
    }
}
