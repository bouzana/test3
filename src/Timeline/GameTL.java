package Timeline;

import Controller.ControllerGameScene;
import javafx.animation.AnimationTimer;


public class GameTL extends AnimationTimer {
    private final ControllerGameScene controlleurGS;
    private long countDownUpdate = 0;
    private long lastUpdate = 0;
    private boolean isSpaceBarKeyTyped;
    private double timeSpaceBarPressed;
    private double initTimeSpaceBarPressed;


    public GameTL(ControllerGameScene controlleurGS) {

        this.controlleurGS = controlleurGS;
        isSpaceBarKeyTyped = false;
        timeSpaceBarPressed = 0;
        initTimeSpaceBarPressed = 0;


    }

    @Override
    public void handle(long now) {

        if (now - lastUpdate >= 10_000) {

            if (controlleurGS.isEscapeKeyTyped()) {
                System.out.println("Escapepressed");
                controlleurGS.getLauncher().setVueCompleteMenu();
                controlleurGS.setEscapeKeyTyped(false);

            } else if (controlleurGS.isRightKeyTyped()) {
                System.out.println("rightpressed");
                controlleurGS.getLauncher().setVueCompleteChoixVaisseaux();
                controlleurGS.setRightKeyTyped(false);

            } else if (controlleurGS.isLeftKeyTyped()) {
                System.out.println("Leftpressed");
                controlleurGS.getLauncher().setVueCompleteOptions();
                controlleurGS.setLeftKeyTyped(false);


            }


        }
    }
}