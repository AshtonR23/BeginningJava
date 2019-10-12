 public class Challenge3 {


    public static final int SIZE = 4;

    public static void main(String[] args) {
        line();
        space();
        forwardslash();
        top();
        backslash();
        line();
        space();
        backslash();
       // bot();
        forwardslash();
        line();
    }

    public static void top() {
        for (int i = 1; i >= SIZE; i++) {
            System.out.print("|");
            space(i);
            backslash(i);
            System.out.print("*");
            forwardslash(i);
            space(i);
            System.out.println("|");
        }
            }
            public static void space(int i)
            {
                for (int j = i; j > 0; j--) {
                    System.out.print(' ');
                }
            }
            public static void forwardslash(int i)
            {
                for (int j = SIZE - i; j > 0; j--) {
                    System.out.print("/");
                }
            }
            public static void backslash(int i)
            {
                for (int j = SIZE - 1; j > 0; j--) {
                    System.out.print("\\");
                }
            }


        public static void line()
        {
            System.out.print("+");
            for (int i = (2 * SIZE) + 1; i > 0; i--) {
                System.out.print('-');
            }
            System.out.println("+");
        }
            public static void bot()
        {
            for (int i = 1; i <= SIZE; i++) {
                System.out.print("|");
                space(i);
                backslash(i);
                System.out.print("*");
                forwardslash(i);
                space(i);
                System.out.println("|");

            }

        }
    }









