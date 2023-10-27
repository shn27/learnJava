package Basic;

public class OuterClass {
    int x = 10;

    public class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}
