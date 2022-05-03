package ie.tudublin;

import example.AudioBandsVisual;
import example.CubeVisual;
//import example.CubeVisual;
import example.MyVisual;
//import example.RotatingAudioBands;
import example.RotatingAudioBands;
//import example.WaveForm;
import example.WaveForm;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());		
	}

	public void rotatingAudioBands()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new RotatingAudioBands());
    }

	public void cubeVisual()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual());
    }

	public void my_Array()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyArray());
    }


	public void cubes()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Cubes());
    }

	public void visualizer()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Visualizer());
    }

	public void visualTest()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new VisualTest());
    }

	public void soundVisualizer()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new SoundVisualizer());
    }

	public void flower()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Flower());
    }





	public static void main(String[] args)
	{
		Main main = new Main();
		//main.visualizer();
		//main.visualTest();
		//main.soundVisualizer();
		main.flower();


		


		
		
				
	}
}