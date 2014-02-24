public class Foo {
    private String bar = "BAR";
    public String getBar() {
        return bar;
    }
    
    public static void main(String args[]) {
        Foo foo = new Foo();
        System.out.println(foo.getBar());
        System.out.println(foo.hashCodeTest());
    }

    public int hashCodeTest() {
        return System.identityHashCode(null);
    }
}
