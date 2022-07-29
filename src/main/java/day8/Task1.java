package day8;

public class Task1 {
    public static void main(String[] args) {
    String s = "";

    long before = System.currentTimeMillis();

    for (int i = 0; i<20001; i++ ) s += i + " ";

    long after = System.currentTimeMillis();
        System.out.println("Time String -> "+(after-before));
//        System.out.println(s);


        StringBuilder sb = new StringBuilder("");

        before = System.currentTimeMillis();
        for (int i = 0; i<=20000; i++ )
            sb.append(i).append(" ");
        after = System.currentTimeMillis();
//        System.out.println(sb);
        System.out.println("Time StringBuilder -> "+ (after-before));

    }



}
