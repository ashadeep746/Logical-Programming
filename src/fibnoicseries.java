public class fibnoicseries {
    public int fibnoic(int x1, int x2) {
        int sum = 0;
        System.out.println("enter a input" + x1);
        System.out.println("enter a input" + x2);
        sum = x1 + x2;
        return sum;
    }

    public static void main(String[] args) {
        fibnoicseries u = new fibnoicseries();
        System.out.println(u.fibnoic(10,20));
    }
}