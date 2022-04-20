package ie.tudublin;

import processing.core.PApplet;

public class MyArray extends PApplet {
    
    /**
 * Array 2D. 
 * 
 * Demonstrates the syntax for creating a two-dimensional (2D) array.
 * Values in a 2D array are accessed through two index values.  
 * 2D arrays are useful for storing images. In this example, each dot 
 * is colored in relation to its distance from the center of the image. 
 */

    float[][] distances;
    float maxDistance;
    int spacer;

    public void settings(){
        size(1024,500);
    }

    public void setup() {

        maxDistance = dist(width/2, height/2, width, height);
        distances = new float[width][height];

        for (int y = 0; y < height; y++) {

            for (int x = 0; x < width; x++) {
            float distance = dist(width/2, height/2, x, y);
            distances[x][y] = distance/maxDistance * 255;

            } // end nested for
        } // end for loop
        
        spacer = 10;
        strokeWeight(6);
        noLoop();  // Run once and stop
    }


    public void draw() {
    background(0);
    // This embedded loop skips over values in the arrays based on
    // the spacer variable, so there are more values in the array
    // than are drawn here. Change the value of the spacer variable
    // to change the density of the points
    for (int y = 0; y < height; y += spacer) {
        for (int x = 0; x < width; x += spacer) {
        stroke(distances[x][y]);
        point(x + spacer/2, y + spacer/2);
        }
    }
    }
}
