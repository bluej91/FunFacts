package com.joshuacentre.funfacts;

import java.util.*;

public class FactBook {
    //Fields (Member Variables) - Properties about the object
    private String[] mFacts = {"Around 60 percent of the country’s farm-raised catfish comes directly from Mississippi.",
            "The first heart transplant surgery in the world was performed by Dr. James D. Hardy at the Mississippi Medical Center in 1964.",
            "The sport of water-skiing was founded in Mississippi on a stretch called Lake Pepin in the 1920s.",
            "The oldest book in America which is an ancient Biblical manuscript is housed at the University of Mississippi.",
            "The Mississippi River is nicknamed Old man River. It is the largest river in America and is also the nation’s chief waterway.",
            "Barq’s Root Beer was invented in Biloxi,MS in 1898 by Edward Adolf Barq, Sr.",
            "Pine Sol was invented in 1929 by Jackson,MS native Harry A. Cole, Sr.",
            "In 1894, Coca-Cola was first bottled by Joseph A. Biedenharn in Vicksburg, Mississippi.",
            "Shoes were first sold as pairs in 1884 at Phil Gilbert’s Shoe Parlor in Vicksburg, Mississippi.",
            "Mississippi is the birthplace of the Blues.",
            "The first female rural mail carrier in the United States was Mrs. Mamie Thomas. She delivered mail by buggy to the area southeast of Vicksburg in 1914"};


    //Methods - Actions the object can take
    public String getFact(){
        String fact = "";


        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;


    }






}
