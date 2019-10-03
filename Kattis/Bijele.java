import java.util.*;

public class Bijele {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int king = 1-in.nextInt();
        int queen = 1-in.nextInt();
        int rook = 2-in.nextInt();
        int bishop = 2-in.nextInt();
        int knight = 2-in.nextInt();
        int pawn = 8-in.nextInt();
        System.out.printf("%d %d %d %d %d %d",king,queen,rook,bishop,knight,pawn);
    }

}
