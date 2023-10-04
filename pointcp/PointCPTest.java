public class PointCPTest {

    public static void main(String args[]){
        /*
        Instead of getting input from user the data is simply stored as it would be if input was used
        as the execution time for getting the values is what's being tested.
         */
        PointCP2 point21;
        PointCP2 point22;
        PointCP3 point31;
        PointCP3 point32;
        PointCP5 point51;
        PointCP5 point52;

        point21 = new PointCP2(Double.valueOf(1),Double.valueOf(1));
        point31 = new PointCP3(point21.getX(),point21.getY());
        point32 = new PointCP3(Double.valueOf(1),Double.valueOf(1));
        point22 = new PointCP2(point32.getRho(),point32.getTheta());
        point51 = new PointCP3(Double.valueOf(1),Double.valueOf(1));
        point52 = new PointCP2(Double.valueOf(1),Double.valueOf(1));

        //getX and getY execution time for pointCP2
        int i = 0;
        int ex = 1000000;
        long p21 = System.currentTimeMillis();

        while (i < ex){
            point21.getX();
            point21.getY();
            i++;
        }
        p21 = System.currentTimeMillis() - p21;

        //getX and getY execution time for pointCP3
        i = 0;
        long p31 = System.currentTimeMillis();

        while (i < ex){
            point31.getX();
            point31.getY();
            i++;
        }
        p31 = System.currentTimeMillis() - p31;

        //getRho and getTheta execution time for pointCP2
        i = 0;
        long p22 = System.currentTimeMillis();

        while (i < ex){
            point22.getRho();
            point22.getTheta();
            i++;
        }
        p22 = System.currentTimeMillis() - p22;

        //getRho and getTheta execution time for pointCP3
        i = 0;
        long p32 = System.currentTimeMillis();

        while (i < ex){
            point32.getRho();
            point32.getTheta();
            i++;
        }
        p32 = System.currentTimeMillis() - p32;

        //getX and getY execution time for pointCP5 (stored as cartesian)
        i = 0;
        long p51 = System.currentTimeMillis();

        while (i < ex){
            point51.getX();
            point51.getY();
            i++;
        }
        p51 = System.currentTimeMillis() - p51;

        //getRho and getTheta execution time for pointCP5 (stored as cartesian)
        i = 0;
        long p52 = System.currentTimeMillis();

        while (i < ex){
            point51.getRho();
            point51.getTheta();
            i++;
        }
        p52 = System.currentTimeMillis() - p52;

        //getX and getY execution time for pointCP5 (stored as polar)
        i = 0;
        long p53 = System.currentTimeMillis();

        while (i < ex){
            point52.getX();
            point52.getY();
            i++;
        }
        p53 = System.currentTimeMillis() - p53;

        //getRho and getTheta execution time for pointCP5 (stored as polar)
        i = 0;
        long p54 = System.currentTimeMillis();

        while (i < ex){
            point52.getRho();
            point52.getTheta();
            i++;
        }
        p54 = System.currentTimeMillis() - p54;

        long[] Results = {p21,p31,p22,p32,p51,p52,p53,p54};
        printResults(Results);
    }
    public static void printResults(long[] R){
        System.out.println("Time taken for CP2 GetX and GetY 1000 executions: " + R[0] + "\n"
        + "Time taken for CP3 GetX and GetY 1000 executions: " + R[1] + "\n"
        + "Time taken for CP2 GetRho and GetTheta 1000 executions: " + R[2] + "\n"
        + "Time taken for CP3 GetRho and GetTheta 1000 executions: " + R[3] + "\n"
        + "(stored cartesian)" + "\n"
        + "Time taken for CP5 GetX and GetY 1000 executions: " + R[4] + "\n"
        + "Time taken for CP5 GetRho and GetTheta 1000 executions: " + R[5] + "\n"
        + "(Stored polar)" + "\n"
        + "Time taken for CP5 GetX and GetY 1000 executions: " + R[6] + "\n"
        + "Time taken for CP5 GetRho and GetTheta 1000 executions: " + R[7] + "\n");
    }
}
