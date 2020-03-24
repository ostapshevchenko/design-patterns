package com.patterns.structural.bridge.shape1;

public class Shape1BridgeDemo {

    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        circle.applyColor();

        Square square = new RedSquare();
        square.applyColor();

        Square greenSquare = new GreenSquare();
        greenSquare.applyColor();

        //what if another color and we should create every time new color and shape
//        it works just fine but classes will increase
    }
}
