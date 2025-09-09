class InnerClasses {

    static class Test {
        static String name;

        public Test(String name) {
            Test.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("hello ");
        Test b = new Test("shash");

        String m = "Shash";
        String n = "Shash";

        System.out.println(m.hashCode() + " "+ "n" + " " + n.hashCode());

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
