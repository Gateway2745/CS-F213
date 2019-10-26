import java.util.*;

public class MovableCircle implements Movable, Comparable<MovableCircle> {
	private int radius;
	private MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	public void moveUp() {
		center.y += center.ySpeed;
	}

	public void moveDown() {
		center.y -= center.ySpeed;
	}

	public void moveRight() {
		center.x += center.xSpeed;
	}

	public void moveLeft() {
		center.x -= center.xSpeed;
	}

	public String toString() {
		return "center coordinates are (" + center.x + "," + center.y + ")"
				+ '\n' + "radius = " + radius;
	}

	public int compareTo(MovableCircle c) {
		return this.radius - c.radius;
	}

	public static void main(String[] args) {
//		Movable m1 = new MovablePoint(5, 6, 10, 10); // upcast
//		System.out.println(m1);
//		m1.moveLeft();
//		System.out.println(m1);
//		Movable m2 = new MovableCircle(2, 1, 2, 20, 5); // upcast
//		System.out.println(m2);
//		m2.moveRight();
//		System.out.println(m2);

		
		System.out.println("*****MOVABLE CIRCLE SORT*****");
		System.out.println();
		
		MovableCircle[] arr = new MovableCircle[3];
		for (int i = 0; i < arr.length; i++) {
			int randomInteger = (int) (100.0 * Math.random());
			arr[i] = new MovableCircle(2, 1, 2, 20, randomInteger);
		}

		System.out.println("Before sorting array:");
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		
		System.out.println("After sorting array by radius:" );
		System.out.println();
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		
		System.out.println();
		System.out.println("*****MOVABLE POINT SORT*****");
		System.out.println();
		
		MovablePoint[] arr2 = new MovablePoint[3];
		Random rand = new Random();
		for (int i = 0; i < arr2.length; i++) {

			int x = rand.nextInt(100);
			int y = rand.nextInt(100);
			int xSpeed = rand.nextInt(100);
			int ySpeed = rand.nextInt(100);

			arr2[i] = new MovablePoint(x, y, xSpeed, ySpeed);
		}

		System.out.println("Before sorting array:");

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println();

		Arrays.sort(arr2, MovablePoint.xSpeedComparator);
		System.out.println("After sorting array according to xSpeed:" + '\n');
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println();
		
		Arrays.sort(arr2, MovablePoint.ySpeedComparator);
		System.out.println("After sorting array according to ySpeed:" + '\n');
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
