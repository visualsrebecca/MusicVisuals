package ie.tudublin;

//import example.CubeVisual;
import example.MyVisual;
//import example.RotatingAudioBands;
import example.RotatingAudioBands;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());		
	}

	public void RotatingAudioBands()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new RotatingAudioBands());
    }

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();
		
				
	}
}