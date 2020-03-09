package Model;

import Tools.Path;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;


public class GameScene {

    public static int score = 0;
    public static Text ScoreT;
    private ImageView imgBg;
    private board spaceShip;
    private ImageView  backIMG;






    public GameScene() {
        super();
    }

    public void initScore() {
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃ©cupÃ©ration de la taille de l'Ã©cran

        double posXScore = (primaryScreenBounds.getWidth() * 70) / 100;
        double posYscore = (primaryScreenBounds.getHeight() * 10 ) /100;

        ScoreT = new Text(posXScore, posYscore, "Score 0");
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 30);
        ScoreT.setFont(policeTitre);

        ScoreT.setFill(Color.WHITE);
    }



    /**
     * Mise en place de l'image de fond en fonction de la taille de l'Ã©cran de l'utilisateur
     */
    public void initBackground(String typeV) {


        if (typeV.equals("V1")) {
            backIMG = new ImageView("Asset/Images/paysage.PNG");

        }else if (typeV.equals("V2")){
            backIMG = new ImageView("Asset/Images/paysage.PNG");


        }
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃ©cupÃ©ration de la taille de l'Ã©cran
        backIMG.setFitHeight((float) primaryScreenBounds.getHeight());
        backIMG.setFitWidth((float) primaryScreenBounds.getWidth());

    }




    public void initSpaceShipSkills(String typeV) {

        if ( typeV.equals("V1")){
            spaceShip = new board();
        }
        else if ( typeV.equals("V2")){
            spaceShip = new board();
        }


    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        GameScene.score = score;
    }

    public static Text getScoreT() {
        return ScoreT;
    }

    public static void setScoreT(Text scoreT) {
        ScoreT = scoreT;
    }

    public board getSpaceShip() {
        return spaceShip;
    }

    public void setSpaceShip(board spaceShip) {
        this.spaceShip = spaceShip;
    }

    public ImageView getImgBg() {
        return backIMG;
    }

    public void setImgBg(ImageView imgBg) {
        this.imgBg = imgBg;
    }

}