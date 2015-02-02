import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

double setAngle = 0;
float dis = 1.0f;
public void setup()
{
	background(0);
	size(400,400);
	stroke(0, 255, 255);
	strokeWeight(2);
}

public void draw()
{
	fractal(0,0,setAngle);
}

public void fractal(int x, int y, double angle)
{
	if(x < 400)
	{
		while(angle < setAngle+100)
		{
			int endX = (int)(dis*Math.cos(angle) + x);
			int endY = (int)(dis*Math.sin(angle) + y);
			point(endX, endY);
			angle += 0.5f;
			dis += 0.02f;
		}
		fractal(x+10, y+10, ++setAngle);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
