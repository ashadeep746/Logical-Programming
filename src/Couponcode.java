public class Couponcode {
    public long Couponcode(long couponcode) {
        int randomcouponcode = (int) (Math.random() * 10 / 2) + 100;
        System.out.println(randomcouponcode);
        if (randomcouponcode == couponcode) {
            System.out.println("samecoupon");
        } else {
            System.out.println("not a samecoupon");
        }
        return couponcode;
    }

    public static void main(String[] args) {
        Couponcode n = new Couponcode();
        System.out.println(n.Couponcode(50));
    }

    }


