import java.util.*;

public class MovablePoint implements Movable {
	int x, y, xSpeed, ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public void moveUp() {
		y += ySpeed;
	}
	
	public void moveDown() {
		y -= ySpeed;
	}
	
	public void moveRight() {
		x += xSpeed;
	}
	
	public void moveLeft() {
		x -= xSpeed;
	}
	
	public String toString() {
		return "point attributes are (" + x + "," + y + "," + xSpeed + "," + ySpeed + ")";
	}
	
	public static Comparator<MovablePoint> xSpeedComparator = new Comparator<MovablePoint>() {
		public int compare(MovablePoint p1, MovablePoint p2) {
			return p1.xSpeed - p2.xSpeed;
		}
	};
	
	public static Comparator<MovablePoint> ySpeedComparator = new Comparator<MovablePoint>() {
		public int compare(MovablePoint p1, MovablePoint p2) {
			return p1.ySpeed - p2.ySpeed;
		}
	};

}
