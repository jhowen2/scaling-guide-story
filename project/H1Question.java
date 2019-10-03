public class H1Question { 
    public static void main(String [] args) {
        try {
            String word  = args[0];
            int hc = Math.abs(word.hashCode()) % 7901; // we will learn about hashCode later in the course
        System.out.println("The answer is this integer: " + hc);
        } catch (ArrayIndexOutOfBoundsException e) {
            print("Could not give a correct output.\n");
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
        print("Usage: java h1Question + <inputphrase>\n");
    }
}
