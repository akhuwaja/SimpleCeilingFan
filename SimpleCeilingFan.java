public class SimpleCeilingFan {
	private int speed;
	private boolean reverse;

	public SimpleCeilingFan() {
		speed = 0;
		reverse = false;
	}

	public SimpleCeilingFan(int speed) {
		this.speed = speed;
	}

	public SimpleCeilingFan(int speed, boolean reverse) {
		this.speed = speed;
		this.reverse = reverse;
	}
	public void increaseSpeed() {
		speed++;

		if(speed == 3)
			speed = 0;
	}

	public void reverseDirection() {
		if(!reverse) 
			reverse = true;
		else 
			reverse = false;
	}

	public int getSpeed() {
		return speed;
	}

	public boolean getReverse() {
		return reverse;
	}

	public static void main(String[] args) {
		SimpleCeilingFan fan = new SimpleCeilingFan();
		System.out.println("Speed: " + fan.getSpeed() + ", Reversed: " + fan.getReverse());
		fan.increaseSpeed();
		System.out.println("Speed: " + fan.getSpeed() + ", Reversed: " + fan.getReverse());
		fan.increaseSpeed();
		System.out.println("Speed: " + fan.getSpeed() + ", Reversed: " + fan.getReverse());
		fan.increaseSpeed();
		System.out.println("Speed: " + fan.getSpeed() + ", Reversed: " + fan.getReverse());
		fan.reverseDirection();
		System.out.println("Speed: " + fan.getSpeed() + ", Reversed: " + fan.getReverse());
		fan.increaseSpeed();
		System.out.println("Speed: " + fan.getSpeed() + ", Reversed: " + fan.getReverse());
		fan.increaseSpeed();
		System.out.println("Speed: " + fan.getSpeed() + ", Reversed: " + fan.getReverse());
		fan.increaseSpeed();
		System.out.println("Speed: " + fan.getSpeed() + ", Reversed: " + fan.getReverse());

	}
}