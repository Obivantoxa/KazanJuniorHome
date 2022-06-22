package lesson5.hww;

public class Circle {

    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double dlinaCircle() {
        if (!pravinCircle(r)) {
            return -1;
        }
        return 2 * Math.PI * this.r;

    }

    public double circleSquare() {
        if (!pravinCircle(r)) {
            return -1;
        }
        return Math.PI * this.r * this.r;

    }

    public static boolean pravinCircle(int r) {
        String flag = "";
        if (r > 0) {

        } else {
            flag = "r <= 0";
        }
        if (flag != "") {
            System.out.println("error");
            System.out.printf("%S  enter R>0 ", flag);
            System.out.println();
        } else {
            return true;
        }
        return false;
    }


}
