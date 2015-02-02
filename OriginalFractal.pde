double setAngle = 0;
float dis = 1.0;
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
			angle += 0.5;
			dis += 0.02;
		}
		fractal(x+10, y+10, ++setAngle);
	}
}
