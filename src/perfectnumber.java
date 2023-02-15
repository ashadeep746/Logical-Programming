public class perfectnumber {
    //int number1;
    public int perfectnumber(int number) {
       // System.out.println("enter a input" + number);
        int number1 =number%2;
        int sum=number1+number;
        while (number!=number1){
            System.out.println(sum);
            System.out.println("perfect number");
        }

        return 1;
    }
    public static void main(String[] args) {
        perfectnumber u = new perfectnumber();
        System.out.println(u.perfectnumber(20));
       // System.out.println(u.perfectnumber());
    }
}
