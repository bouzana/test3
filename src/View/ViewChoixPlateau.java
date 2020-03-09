package View;

import Controller.ControllerMenu;
import Model.Menu;
import Tools.Path;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

import static Tools.Music.Bip;
import static Tools.Music.Piou;

public class ViewChoixPlateau {

    private Button btnMenuP;
    private Button V1;
    private Button V2;

    private Text titre;
    private ImageView imgBGChoixV;
    private Group root;
    private Menu model;


    public ViewChoixPlateau(Menu model, Group root) {
        this.root = root;
        this.model = model;
        initTitre();
        initBackground();
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // RÃ©cupÃ©ration de la taille de l'Ã©cran
        double posX = (primaryScreenBounds.getWidth() * 5) / 100;
        double posY = (primaryScreenBounds.getHeight() * 20) /100;
        btnMenuP = initButton(posX+110,posY);
        V1 = Vbutton(posX+910, posY+270,"V1");
        V2 = Vbutton(posX+300, posY+270,"V2");

        V1.setOnMouseEntered(mouseEvent -> Bip());
        V2.setOnMouseEntered(mouseEvent -> Bip());

    }


    private void initTitre() {
        titre = new Text(15, 180, "Plateau");
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), 40);
        titre.setFont(policeTitre);
        titre.setLayoutX(60);
        titre.setLayoutY(-20);
        titre.setFill(Color.WHITE);
    }

    public Button initButton(double posX, double posY) {
        ImageView icon = new ImageView("Asset/Images/menuPrincipaleBtn.png");
        // Création d'un bouton
        Button b = new Button();
        b.setGraphic(icon);
        b.setLayoutX(posX);
        b.setLayoutY(posY);
        b.setBackground(null);

        return b;
    }
    public Button Vbutton(double posX, double posY, String typebtn) {


        // Création d'un bouton
        Button b = new Button();


        if (typebtn.equals("V1"))

            b.setGraphic(new ImageView("Asset/Images/p34.png"));

        else if (typebtn.equals("V2"))

            b.setGraphic(new ImageView("Asset/Images/p56.PNG"));



        b.setLayoutX(posX);
        b.setLayoutY(posY);


        //b.setBackground(null);


        return b;

    }

    /**
     * Mise en place de l'image de fond en fonction de la taille de l'écran de l'utilisateur
     */
    private void initBackground() {
        imgBGChoixV = new ImageView("Asset/Images/choixPlateau.PNG");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds(); // Récupération de la taille de l'écran
        imgBGChoixV.setFitHeight((int) primaryScreenBounds.getHeight());
        imgBGChoixV.setFitWidth((int) primaryScreenBounds.getWidth());
    }


    void setImgBGChoixV() {
        root.getChildren().clear();

        root.getChildren().add(imgBGChoixV);
        root.getChildren().add(titre);
        root.getChildren().add(btnMenuP);
        root.getChildren().add(V1);
        root.getChildren().add(V2);


    }

    void setEvents(ControllerMenu mc) {
        btnMenuP.setOnMouseClicked(mc);
        V1.setOnMouseClicked(mc);
        V2.setOnMouseClicked(mc);

    }

    public Object getRetourMenuPrincipale(){
        return btnMenuP;
    }

    public Object getLancerLeJeuV1() {
        return V1;
    }
    public Object getLancerLeJeuV2() {
        return V2;
    }

}
