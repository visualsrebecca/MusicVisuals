package ie.tudublin;

import ddf.minim.Minim;
import ddf.minim.signals.*;
import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import processing.core.PApplet;


public class Visualizer extends PApplet {
    
    float n4;
    float n6;

    Minim minim;
    AudioPlayer mySound;
    AudioBuffer ab;
     
    //MAIN SETUP
    public void setup () {

        colorMode(RGB);
        noCursor();
        smooth();
        background (255,255,255);
        frameRate(60);

     
        //adding the song data
        minim = new Minim(this);
        mySound = minim.loadFile("Amster.mp3"); 

        //audioBuffer helps process the sound file
        ab = mySound.mix;   
        mySound.play();


    } // end setup

    public void settings(){

        // fullScreen() won't run on mac so this solution works
        size(displayWidth, displayHeight, "processing.opengl.PGraphics3D");

    } //end settings
     
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
        
            //yellow
            fill(255, 255, 0, 90);
            ellipse(x, y, mySound.left.get(i)*10, mySound.left.get(i)*10);
        
            //white
            fill(255, 255, 255, 60);
            rect(x3, y3, mySound.left.get(i)*20, mySound.left.get(i)*10);
        
            //green 
            fill(152,251,152, 90);
            rect(x, y, mySound.right.get(i)*10, mySound.left.get(i)*10);
     
            //white
            fill(255, 255, 255, 70);
            rect(x3, y3, mySound.right.get(i)*10, mySound.right.get(i)*20);
        } //end for
    

    n4 += 0.008;
    n6 += 0.04;
     
    } //end draw


    //mute the song if M or m is pressed
    public void keyPressed(){
        if ( key == 'm'|| key == 'M' ){
            if ( mySound.isMuted() ){
            mySound.unmute();
            }
            else{
            mySound.mute();
            }
        }
    } // end keyPressed()
}
