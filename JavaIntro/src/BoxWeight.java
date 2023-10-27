public class BoxWeight extends Box{
    private int weight ;

    public BoxWeight(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight(Box box, int weight) {
        super(box);
        this.weight = weight;
    }

    public BoxWeight() {
    }

    public BoxWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void fun( ){
        System.out.println(super.width+ " " + this.weight );
    }
}
