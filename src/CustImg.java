import java.awt.*;
import javax.swing.*;

public class CustImg 
{
    Image image;
    String filename;
    
    public void setImage()
    {
        this.image = new ImageIcon(filename).getImage();
    }

    public void setFilename(String filename)
    {
        this.filename = filename;
    }

    public String getFilename()
    {
        return this.filename;
    }

    public Image getImage()
    {
        return this.image;
    }

    



}
