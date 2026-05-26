import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        //VARIABLES
        Scanner keyboard = new Scanner(System.in);
        char character1 = 'o';
        char character2 = ' ';
        int height = 0;
        //CODE
        System.out.println(" ----------------------------------- ");
        System.out.println("|               PYRAMID             |");
        System.out.println(" ----------------------------------- ");
        System.out.println(" ----------------------------------- ");
        System.out.println("| Allowed pyramid height            |");
        System.out.println("| Minimum height 2                  |");
        System.out.println("| Maximum height 10                 |");
        System.out.println(" ----------------------------------- ");
        do {
            System.out.println(" ----------------------------------- ");
            System.out.println("| What height do you want to build? |");
            System.out.println(" ----------------------------------- ");
            height = keyboard.nextInt();
            System.out.println();
            int space = height;
            if ((height < 11) && (height > 1)) {
                System.out.println(" ----------------------------------- ");
                System.out.println("| PYRAMID OF HEIGHT " + height + "              |");
                System.out.println(" ----------------------------------- ");
                for (int i = 0; i < height; i++) {
                    System.out.println();
                    for(int e = 0; e < space;e++) {
                        System.out.print(character2);
                    }
                    space=space-1;
                    int x = (height - 1);
                    int k = i;
                    int s = (x - k);
                    for (int j = s; j < height; j++) {
                        System.out.print(character1);
                        System.out.print(character2);
                    }
                }
            }else{
                System.out.println(" ----------------------------------- ");
                System.out.println("| Height not allowed                |");
                System.out.println(" ----------------------------------- ");
            }
        }while(height<2 || height>10);
        System.out.println();
    }
}