public class Main{

        if(min(a,b)<min(c,d))
        {
            return min(a,b);
        }
        else
            {
                return min(c,d);
            }

    }

    public static int min(int a, int b) {
      return Math.min(a,b);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
