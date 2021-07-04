package test;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		System.out.println(pointA);
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		System.out.println(pointB);
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}	
	
	public void draw() {
		try{
			//System.out.println("X = [" + getPointA().getX() +  ", " + getPointB().getX() + ", " + getPointC().getX() + "]");
			System.out.println("Y = [" + getPointA().getY() +  ", " + getPointB().getY() + ", " + getPointC().getY() + "]");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
