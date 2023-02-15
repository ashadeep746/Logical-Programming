public class Stopwatch {
    public double Stopwatch(double start, double end) {
        double elapsed = start * end / 2;
        double stopwatch = start + end - elapsed;
        {
            if (stopwatch >= elapsed) {
                System.out.println(elapsed);
            } else {
                System.out.println("no watch");
            }
        }
        return stopwatch;
    }

        public static void main (String[]args){
        Stopwatch u = new Stopwatch();
            System.out.println(u.Stopwatch(1,20));
        }
    }





