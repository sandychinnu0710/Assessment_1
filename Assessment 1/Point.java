package Test1;

public class Point
 {
			private int x;
			private int y;
			
			public Point(int x, int y) {
			    this.x = x;
			    this.y = y;
			}

			public double distance() {
			    return(Math.sqrt(x*x + y*y));
			}

			public double distance(Point point) {
			    int xcoordinate = x - point.x;
			    int ycoordinate = y - point.y;
			    return(Math.sqrt(xcoordinate*xcoordinate + ycoordinate*ycoordinate));
			    
			}

			public int getX() {
			    return x;
			}

			public int getY() {
			    return y;
			}

}
