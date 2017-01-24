package imageviewer;

import imageviewer.model.Image;
import imageviewer.persistence.ImageLoader;
import imageviewer.persistence.files.FileImageLoader;
import imageviewer.persistence.files.WebImageLoader;

public class Main {

    public static void main(String[] args) {
        ImageLoader imageLoader = new WebImageLoader("bear");
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().display(imageLoader.load());
    }
    
}
