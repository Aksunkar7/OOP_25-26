public class StarTriangle {
    private final String shape = "[*]";
    private int width;

    public StarTriangle(int width){
        this.width = width;
    }

    @Override
    public String toString(){
        String triangle = "";
        for(int i = 1; i <= this.width; ++i){
            triangle = triangle + this.shape.repeat(i) + "\n";
        }
        return triangle;
    }
    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());
    }
}
