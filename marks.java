import java.util.Scanner;
public class marks {
    public static void main(String[] ars){
        System.out.println("enter marks:");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>90 && mark<=100){
            System.out.println("5star");
        }
        else if(mark>80&&mark<=90){
            System.out.println("4star");
        }
        else if(mark>70&&mark<=80){
            System.out.println("3star");
        }
        else if(mark>60&&mark<=70){
            System.out.println("3star");
        }
        else if(mark>50&&mark<=60){
            System.out.println("2star");
        }
        else if(mark>0&&mark<=50){
            System.out.println("avg student");
        }
        else{
            System.out.println("incorrect marks");
        }
        sc.close(); 
    }
}
