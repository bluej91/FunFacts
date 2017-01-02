package com.joshuacentre.funfacts;

import
        android.graphics.Color;

import java.util.Random;

public class ColorWheel {

        //Fields (Member Variables) - Properties about the object
        private String[] mColor = {"#39add1","#3079ab","#c25975","#e15258","#f9845b","#838cc7","#7d669e",
"#53bbb4","#51b46d","#e0ab18","#637a91","#f092b0","#b7c0c7"};


        //Methods - Actions the object can take
    public int getColor() {
        String color;
        // Randomly select a color
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColor.length);
        color = mColor[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }

    }
