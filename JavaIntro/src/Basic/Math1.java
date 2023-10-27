package Basic;

public class Math1 {
    private int x , y ;

    public Math1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calculate(){
        System.out.println("Maximum = " + Math.max(this.x , this.y));
        System.out.println("Minimum = " + Math.min(this.x , this.y));
        System.out.println("sqrt of 49 = "  + Math.sqrt(49));
        System.out.println("abs of -4.7 = "  + Math.abs(-4.7));
        System.out.println("Random number"  + Math.random());
        System.out.println();
        System.out.println();
    }
}
