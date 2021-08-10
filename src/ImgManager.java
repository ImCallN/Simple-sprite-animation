import java.io.File;
import java.util.ArrayList;
import java.awt.*;
public class ImgManager 
{
    private ArrayList<CustImg> charArr = new ArrayList<CustImg>();

    public void addImg(CustImg img)
    {
        charArr.add(img);
    }

    public void loadImages(String rootname)
    {
        File rootFile = new File(rootname);
        File[] playerImages = rootFile.listFiles();
        for(File f : playerImages)
        {
            CustImg newImage = new CustImg();
            newImage.setFilename(rootname + "/" + f.getName());
            newImage.setImage();
            addImg(newImage);
        }
    }

    public Image returnImage(int index)
    {
        if(index < charArr.size()) return charArr.get(index).getImage();
        else return null;
    }

    public void showNames()     //Displays all of the names in the charArr
    {
        for(CustImg r : charArr)
        {
            System.out.println(r.getFilename());
        }
    }

    public int getSize()        //Returns the size of the charArr
    {
        return charArr.size();
    }
}
