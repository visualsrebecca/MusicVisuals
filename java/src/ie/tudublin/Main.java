package ie.tudublin;

//import example.AudioBandsVisual;
import example.CubeVisual;
//import example.CubeVisual;
import example.MyVisual;
//import example.RotatingAudioBands;
import example.RotatingAudioBands;
//import example.WaveForm;

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

	public void shapes()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Shapes());
    }


	//public void cubeVisual1()
	//{
	//	String[] a = {"MAIN"};
    //    processing.core.PApplet.runSketch( a, new CubeVisual1());
    //}


	public static void main(String[] args)
	{
		Main main = new Main();
		main.shapes();
		//main.startUI();
		//main.RotatingAudioBands();

		
		
				
	}
}