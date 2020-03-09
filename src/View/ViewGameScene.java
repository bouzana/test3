package View;

import Model.GameScene;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.stage.Screen;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static Tools.Music.Explosion;
import static Tools.Music.Piou;

public class ViewGameScene {

    private GameScene model;
    private Group root;

    private Rectangle2D primaryScreenBounds;


    /**
     * Constructeur du menu principal
     *
     * @param model (ModÃ¨le correspondant au menu)
     * @param root  (Groupe principal de la vue)
     */
    ViewGameScene(GameScene model, Group root, String typeV) {
        this.root = root;
        this.model = model;

        primaryScreenBounds = Screen.getPrimary().getBounds();

        this.model.initBackground(typeV);
        this.model.initSpaceShipSkills(typeV);
        this.model.getSpaceShip().initSpaceShip(typeV);//recupere v et le cockpit
        this.model.initScore();
    }


    void setVueGameScene() {
        //je crée ma vue
        root.getChildren().clear();
        root.getChildren().add(this.model.getImgBg());
        root.getChildren().add(this.model.getSpaceShip().getSprite());


    }

}