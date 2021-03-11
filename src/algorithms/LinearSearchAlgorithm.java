package algorithms;

public class LinearSearchAlgorithm {

    public static void main(String[] args){
        if (args.length != 2){
            System.err.println("usage: java Linear search Integers integer");
            return;
        }

        int[] ints = readIntegers(args[0]);
        if (ints == null){
            return;
        }

        int srchint = Integer.parseInt(args[1]);

        System.out.println(srchint + (search(ints, srchint) ? " found"
                : " not found"));
    }

    private static int[] readIntegers(String s)
    {
        String[] tokens = s.split(",");
        int[] integers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++)
            integers[i] = Integer.parseInt(tokens[i]);
        return integers;
    }

    private static boolean search(int[] x, int srchint)
    {
        for (int i = 0; i < x.length; i++)
            if (srchint == x[i])
                return true;

        return false;
    }
}
