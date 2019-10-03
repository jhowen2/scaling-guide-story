public class Hello { 
    public static void main(String [] args) {
        try {
            String name = args[0];
            System.out.println("Hello "+name);
        } catch (ArrayIndexOutOfBoundsException e) {
            print("Hello, World!\n");
            usage();
        } catch (Exception e) { 
            print("Unexpected problem: maybe this will help:\n");
            e.printStackTrace();
            usage();
        }
    }
    private static void print(Object o) {
        System.out.print(o.toString());
    }
    private static void usage() {
        print("Usage: java Hello your-name-here  \n");
    }
}
