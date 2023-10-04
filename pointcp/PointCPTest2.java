import java.util.Random;
public class PointCPTest2 {

    public static void main(String args[]) {
		int ex = 10000;
		Random rand = new Random();
        /*
        Instead of getting input from user the data is simply stored as it would be if input was used
        as the execution time for getting the values is what's being tested.
         */
		PointCP2[] point2 = new PointCP2[ex];
		PointCP3[] point3 = new PointCP3[ex];
		PointCP5[] point5 = new PointCP5[ex];


		//getX and getY execution time for pointCP2
		int i = 0;
		long[] Time = new long[6];
		int x;
		long tmp;
		while (i < ex) {
			x = rand.nextInt(1);
			if (x == 1) {
				tmp = System.currentTimeMillis();
				point2[i] = new PointCP2(Double.valueOf(i), Double.valueOf(i));
				Time[0] += System.currentTimeMillis() - tmp;
				tmp = System.currentTimeMillis();
				point3[i] = new PointCP3(Math.cos(Math.toRadians(i)) * i,
						(Math.sin(Math.toRadians(i)) * i));
				Time[1] += System.currentTimeMillis() - tmp;
				tmp = System.currentTimeMillis();
				point5[i] = new PointCP2(Double.valueOf(i), Double.valueOf(i));
				Time[2] += System.currentTimeMillis() - tmp;
			} else {
				tmp = System.currentTimeMillis();
				point2[i] = new PointCP2(Math.sqrt(Math.pow(i, 2) + Math.pow(i, 2)),
						Math.toDegrees(Math.atan2(i, i)));
				Time[0] += System.currentTimeMillis() - tmp;
				tmp = System.currentTimeMillis();
				point3[i] = new PointCP3(Double.valueOf(i), Double.valueOf(i));
				Time[1] += System.currentTimeMillis() - tmp;
				tmp = System.currentTimeMillis();
				point5[i] = new PointCP3(Double.valueOf(i), Double.valueOf(i));
				Time[2] += System.currentTimeMillis() - tmp;
			}
			i++;
		}
		Time[3] = System.currentTimeMillis();
		for (PointCP2 c : point2) {
			System.out.println(c.getX());
			System.out.println(c.getY());
			System.out.println(c.getRho());
			System.out.println(c.getTheta());
		}
		Time[3] = System.currentTimeMillis() - Time[3];

		Time[4] = System.currentTimeMillis();
		for (PointCP3 c : point3) {
			System.out.println(c.getX());
			System.out.println(c.getY());
			System.out.println(c.getRho());
			System.out.println(c.getTheta());
		}
		Time[4] = System.currentTimeMillis() - Time[4];

		Time[5] = System.currentTimeMillis();
		for (PointCP5 c : point5) {
			System.out.println(c.getX());
			System.out.println(c.getY());
			System.out.println(c.getRho());
			System.out.println(c.getTheta());
		}
		Time[5] = System.currentTimeMillis() - Time[5];

		System.out.println("\n" + "CP2 Time: " + "\n" + "Adding: " + Time[0] + "\n" + "Getting: " + Time[3] + "\n"
						+ "CP3 Time: " + "\n" + "Adding: " + Time[1] + "\n" + "Getting: " + Time[4] + "\n"
						+ "CP5 Time: " + "\n" + "Adding: " + Time[2] + "\n" + "Getting: " + Time[5] + "\n");
	}
}
