package game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Wall extends Actor {

    private Image image;

    public Wall(int x, int y) {
        super(x, y);
        
        initWall();
    }
    
    private void initWall() {
        // Khởi tạo hình ảnh của bức tường
        ImageIcon iicon = new ImageIcon("src/resources/wall.png");
        image = iicon.getImage();
        setImage(image);
    }
}
