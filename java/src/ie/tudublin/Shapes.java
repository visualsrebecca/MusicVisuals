package ie.tudublin;

import processing.core.PApplet;

public class Shapes extends PApplet {
    
    public void setup() {
        size(1024, 500, P3D);
        noStroke();
      }
      
    public void draw() {
        lights();
        background(0);

        double cameraY = (height/2.0);
        float fov = mouseX/width * PI/2;
        double cameraZ = cameraY / tan((float) (fov / 2.0));
        float aspect = width/height;

        if (mousePressed) {
          aspect = (float) (aspect / 2.0);
        }
        perspective(fov, aspect, cameraZ/10.0, cameraZ*10.0);
        
        translate(width/2+30, height/2, 0);
        rotateX(-PI/6);
        rotateY(PI/3 + mouseY/(height) * PI);
        box(45);
        translate(0, 0, -50);
        box(30);
      }

    private void perspective(float fov, float aspect, double d, double e) {
    }
}
