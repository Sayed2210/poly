public class poly {
    public static void main(String[] args) {
        var s=new Shapes();
        s.info();
        var c=new Circle();
        c.info();
        var r=new Rectangle();
        r.info();

        Shapes[] a=new Shapes[3];
        a[0]=new Shapes();
        a[1]=new Shapes();
        a[2]=new Shapes();

    }
    static class Shapes{
        public void info(){
            System.out.println("Shape");
        }
    }
    static class Circle extends Shapes{
        @Override
        public void info() {
            System.out.println("Circle");
        }
    }
    static class Rectangle extends Shapes{
        @Override
        public void info() {
            System.out.println("Rectangle");
        }
    }
}
