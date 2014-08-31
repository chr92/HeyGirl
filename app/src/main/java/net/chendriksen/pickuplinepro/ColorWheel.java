package net.chendriksen.pickuplinepro;

import android.graphics.Color;
import java.util.Random;

public class ColorWheel {

    // Member variable (properties about the object)
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#000000"  // light gray
    };

    private int oldColor = 0;

    // Method (abilities: things the object can do)
    public int getColor() {

        String color = "";

        // Randomly select a fact
        int randomColor = oldColor;

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new random color generator

        while (randomColor == oldColor) {
            randomColor = randomGenerator.nextInt(mColors.length);
        }

        // Convert the randomColor to a text fact
        color = mColors[randomColor];
        int colorAsInt = Color.parseColor(color);
        oldColor = randomColor;

        return colorAsInt;
    }
}
