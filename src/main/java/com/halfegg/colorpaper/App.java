package com.halfegg.colorpaper;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        var rectangle = new Rectangle(screenBounds.getWidth(), screenBounds.getHeight());
        var group = new Group(rectangle);
        var scene = new Scene(group);
        group.setCursor(Cursor.NONE);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        stage.show();
        Animator.animate(rectangle);
    }

    public static void main(String[] args) {
        launch();
    }

}