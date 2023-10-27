public class Box {
    protected int width = 10, height , depth ;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box(Box box) {
        this.width = box.width ;
        this.height = box.height ;
        this.depth = box.depth ;
    }

    public Box() {
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int volume( ){
        return this.width*this.height*this.depth ;
    }
}
