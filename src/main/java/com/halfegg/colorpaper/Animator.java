package com.halfegg.colorpaper;

import javafx.animation.FillTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

public class Animator {

    private static FillTransition primaryFiller;
    private static Shape primaryShape;
    private static final Double TIME = 1200.0;

    private Animator() {}

    public static void animate(Shape shape) {
        primaryShape = shape;
        primaryFiller = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.YELLOW, Color.rgb(255, 204, 0));
        primaryFiller.setOnFinished(e1 -> filler1());
        primaryFiller.play();

    }

    private static void filler1() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.rgb(255, 204, 0), Color.ORANGE);
        filler.setOnFinished(actionEvent -> filler2());
        filler.play();
    }

    private static void filler2() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.ORANGE, Color.ORANGERED);
        filler.setOnFinished(actionEvent -> filler3());
        filler.play();
    }

    private static void filler3() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.ORANGERED, Color.RED);
        filler.setOnFinished(actionEvent -> filler4());
        filler.play();
    }

    private static void filler4() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.RED, Color.rgb(117, 59, 65));
        filler.setOnFinished(actionEvent -> filler5());
        filler.play();
    }

    private static void filler5() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.rgb(117, 59, 65), Color.PURPLE);
        filler.setOnFinished(actionEvent -> filler6());
        filler.play();
    }

    private static void filler6() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.PURPLE, Color.BLUEVIOLET);
        filler.setOnFinished(actionEvent -> filler7());
        filler.play();
    }

    private static void filler7() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.BLUEVIOLET, Color.BLUE);
        filler.setOnFinished(actionEvent -> filler8());
        filler.play();
    }

    private static void filler8() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.BLUE, Color.rgb(13, 152, 186));
        filler.setOnFinished(actionEvent -> filler9());
        filler.play();
    }

    private static void filler9() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.rgb(13, 152, 186), Color.GREEN);
        filler.setOnFinished(actionEvent -> filler10());
        filler.play();
    }

    private static void filler10() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.GREEN, Color.YELLOWGREEN);
        filler.setOnFinished(actionEvent -> filler11());
        filler.play();
    }

    private static void filler11() {
        var filler = new FillTransition(
                Duration.millis(TIME), primaryShape, Color.YELLOWGREEN, Color.YELLOW);
        filler.setOnFinished(actionEvent -> primaryFiller.play());
        filler.play();
    }
}
