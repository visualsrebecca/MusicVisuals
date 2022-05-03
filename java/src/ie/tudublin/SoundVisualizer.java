package ie.tudublin;

import ddf.minim.*;
import ddf.minim.signals.*;
import processing.core.PApplet;

public class SoundVisualizer extends PApplet{
    
    Minim minim;
    AudioPlayer mySound;

    public void setup(){
        noStroke();
        rectMode(CENTER);
        minim = new Minim(this);
        mySound = minim.loadFile("FirstClass.mp3");
        mySound.play();
        frameRate(60);
    }

    public void settings(){
        size(1024,1024,P3D);
    }

    int n=0;

    public void draw(){
        background(0);
        translate(width/2,height/2);

        for(int i = 0; i < mySound.bufferSize() - 1; i++)  {
            rotateX((float) (n*-PI/6*0.05));
            rotateY((float) (n*-PI/6*0.05));
            rotateZ((float) (n*-PI/6*0.05));
            fill(random(255),random(255),random(255));
            rect(i,i,mySound.left.get(i)*50,mySound.left.get(i)*50);
        }//end for

        n++;
    }

    //mute out
    public void keyPressed(){
        if ( key == 'm'|| key == 'M' ){
            if ( mySound.isMuted() ){
            mySound.unmute();
            }
            else{
            mySound.mute();
            }
        }
    }

    public void stop(){
        mySound.close();
        minim.stop();
        super.stop();
    }




}
