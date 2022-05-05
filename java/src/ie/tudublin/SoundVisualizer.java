package ie.tudublin;

import ddf.minim.Minim;
import ddf.minim.signals.*;
import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import processing.core.PApplet;

public class SoundVisualizer extends PApplet{
    
    Minim minim;
    AudioPlayer mySound;
    AudioBuffer audioBuffer;

    int mode = 0;

    public void setup(){
        noStroke();
        rectMode(CENTER);

        minim = new Minim(this);

        //loading the sound file
        mySound = minim.loadFile("Amster.mp3");

        //audioBuffer helps process the sound file
        audioBuffer = mySound.mix;
        mySound.play();

        frameRate(60);
    }

    public void settings(){

        size(displayWidth, displayHeight, P3D);
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


        switch(mode) {

            case 1:
                background(0);

                break;



            case 2:
                background(0);


                break;


            
        } //end switch
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
