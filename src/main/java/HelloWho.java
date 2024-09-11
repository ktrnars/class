public class HelloWho {
    public static void main(String[] args) {
        if(args.length == 0)
        {
            System.out.println("Input Error");
            System.exit(1);
        }
        System.out.println(args[0]);
    }
}
