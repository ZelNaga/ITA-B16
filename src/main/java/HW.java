/**
 * Created by asv on 08.05.17.
 */
public class HW {

    public static void main(String[] args) {

        if (args.length > 0) {

            System.out.println("Hello " + args[0] + " !!!");

            for (int i = 0; i < args.length; i++) {

                System.out.println(args[i]);
            }
        } else {

            System.out.println("Hello world!");
        }

    }
}
