package ie.tudublin;

import ddf.minim.*;
import ddf.minim.signals.*;
import processing.core.PApplet;


public class Visualizer extends PApplet {
    
    float n4;
    float n6;

    Minim minim;
    AudioPlayer mySound;
     
    //MAIN SETUP
    public void setup () {

        colorMode(RGB);
        noCursor();
        smooth();
        background (255,255,255);
        frameRate(60);

     
        //MUSIC | Add mp3 to file and change name of "Murph.mp3" to your song name
        minim = new Minim(this);
        mySound = minim.loadFile("FirstClass.mp3");    
        mySound.play();
    } // end setup

    public void settings(){

        size(1024, 1024, "processing.opengl.PGraphics3D");
    } //end dsettings
     
    public void draw () {
     
        fill(0,50);  
        noStroke();
        rect(0, 0, width, height);
        translate(width/2, height/2);
     
        for (int i = 0; i < mySound.bufferSize() - 1; i++) {
        
            float angle = sin(i+n4)* 10; 
            float angle2 = sin(i+n6)* 300; 
        
            float x = sin(radians(i))*(angle2+30); 
            float y = cos(radians(i))*(angle2+30);
        
            float x3 = sin(radians(i))*(500/angle); 
            float y3 = cos(radians(i))*(500/angle);
        
            fill(255, 255, 0, 90); //yellow
            ellipse(x, y, mySound.left.get(i)*10, mySound.left.get(i)*10);
        
            fill(255, 255, 255, 60); //wt
            rect(x3, y3, mySound.left.get(i)*20, mySound.left.get(i)*10);
        
            fill(255, 128, 0, 90); //orange
            rect(x, y, mySound.right.get(i)*10, mySound.left.get(i)*10);
     
        
            fill(255, 255, 255, 70); //wt
            rect(x3, y3, mySound.right.get(i)*10, mySound.right.get(i)*20);
        }
     
    n4 += 0.008;
    n6 += 0.04;
     
    } //end draw
}
