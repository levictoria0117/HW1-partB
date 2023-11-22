package com.example.square_animation;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class controller {

    @FXML
    private Rectangle square;
    @FXML
    private ColorPicker colorPicker;

    public void up(ActionEvent e){
        //System.out.println("up");
        TranslateTransition tu = new TranslateTransition();
        tu.setNode(square);
        tu.setDuration(Duration.seconds(0.75));
        tu.setCycleCount(2);
        tu.setByY(-100);
        tu.setAutoReverse(true);
        tu.play();
    }

    public void down(ActionEvent e){
        //System.out.println("down");
        TranslateTransition td = new TranslateTransition();
        td.setNode(square);
        td.setDuration(Duration.seconds(0.75));
        td.setCycleCount(2);
        td.setByY(100);
        td.setAutoReverse(true);
        td.play();
    }

    public void left(ActionEvent e){
        //System.out.println("left");
        TranslateTransition tl = new TranslateTransition();
        tl.setNode(square);
        tl.setDuration(Duration.seconds(1));
        tl.setCycleCount(2);
        tl.setByX(-250);
        tl.setAutoReverse(true);
        tl.play();
    }

    public void right(ActionEvent e){
        //System.out.println("right");
        TranslateTransition tr = new TranslateTransition();
        tr.setNode(square);
        tr.setDuration(Duration.seconds(1));
        tr.setCycleCount(2);
        tr.setByX(250);
        tr.setAutoReverse(true);
        tr.play();
    }

    public void rotateZ (ActionEvent e){
        //System.out.println("rotate");
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(square);
        rotate.setDuration(Duration.seconds(1));
        rotate.setCycleCount(1);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.play();
    }

    public void rotateY (ActionEvent e){
        //System.out.println("spin");
        RotateTransition spinY = new RotateTransition();
        spinY.setNode(square);
        spinY.setDuration(Duration.seconds(1));
        spinY.setCycleCount(1);
        spinY.setByAngle(360);
        spinY.setAxis(Rotate.Y_AXIS);
        spinY.play();
    }

    public void rotateX (ActionEvent e){
        //System.out.println("spin");
        RotateTransition spinX = new RotateTransition();
        spinX.setNode(square);
        spinX.setDuration(Duration.seconds(1));
        spinX.setCycleCount(1);
        spinX.setByAngle(360);
        spinX.setAxis(Rotate.X_AXIS);
        spinX.play();
    }

    public void changeColor(ActionEvent e) {
        Color squareColor = colorPicker.getValue();
        square.setFill(squareColor);
    }

//    public void reset(ActionEvent e){
//        square.setLayoutX(286);
//        square.setLayoutY(111);
//    }

}

