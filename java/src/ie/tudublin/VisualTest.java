package ie.tudublin;

import processing.core.PApplet;
import ddf.minim.*;
import ddf.minim.signals.*;

public class VisualTest extends PApplet {
    

Minim minim;
AudioPlayer mySound;

public void setup(){
  noStroke();
  rectMode(CENTER);
  minim = new Minim(this);
  mySound = minim.loadFile("FirstClass.mp3");
  mySound.play();
  colorMode(RGB);
  frameRate(60);
}

public void settings(){

    size(1024, 1024, "processing.opengl.PGraphics3D");
} //end dsettings

int n=0;

public void draw(){

  background(10,180,155);
  translate(width/2,height/2);

  for(int i = 0; i < mySound.bufferSize() - 1; i++)  {
    
    rotateX((float) (n*-PI/3*0.05));
    //rotateY((float) (n*-PI/3*0.05));
    fill(255,150);
    float leftLevel = mySound.left.level() * 100; 
    ellipse(i,i,leftLevel,leftLevel);
    rotateZ((float) (n*-PI/3*0.05));
    fill(0,150);
    float rightLevel = mySound.right.level() * 100; 
    rect(i,i,rightLevel,rightLevel);
  }//end for

  n++;

}//end draw()

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
