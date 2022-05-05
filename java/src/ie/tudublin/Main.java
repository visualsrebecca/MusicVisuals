package ie.tudublin;

public class Main
{	


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
		//main.visualizer(); // this one works
		//main.visualTest(); // works but not using
		main.soundVisualizer(); // works
		//main.flower();
		
				
	}
}