package Model;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.stage.Screen;

public class board {

    private ImageView CockpitPic;



    public board(){

    }
    public void initSpaceShip(String typeV){

        if (typeV.equals("V1")) {
         CockpitPic = new ImageView("Asset/Images/p34vueScene.PNG");

     }else if (typeV.equals("V2")){
         CockpitPic = new ImageView("Asset/Images/p56vueScene.PNG");


     }
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃ©cupÃ©ration de la taille de l'Ã©cran
        double posX = (primaryScreenBounds.getWidth() * 40) / 100;
        double posY = (primaryScreenBounds.getHeight() * 20) /100;
        CockpitPic.setX(posX);
        CockpitPic.setY(posY);

    }

    public ImageView getSprite() {
        return CockpitPic;
    }



    public void setSprite(ImageView cockpitPic) {
        CockpitPic = cockpitPic;
    }


}
