import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sum =0;
        Scanner in= new Scanner(System.in);
        System.out.println("Hello and welcome to Student Calculator!");
        System.out.println("Enter the no. of subjects ");
        int s =in.nextInt();
        System.out.println("Enter the student name ");
        String name = in.next();
        for(int i=1;i<=s;i++){
            System.out.println("Enter the subject name");
            String b=in.next();
            System.out.println("Enter the marks out of 100");
            int m =in.nextInt();
            sum = sum+m;
            if(m==100 || 91>=m){
                System.out.println("grade=A+");
            }
            if(m==90 || 81>=m){
                System.out.println("grade=A");
            }
            if(m==80 || 71>=m){
                System.out.println("grade=B+");
            }
            if(m==70 || 61>=m){
                System.out.println("grade=B");
            }
            if(m==60 || 51>=m){
                System.out.println("grade=C+");
            }
            if(m==50 || 41>=m){
                System.out.println("grade=C");
            }
            if(m==40 || 33>=m){
                System.out.println("grade=D");
            }
            else{
                System.out.println("grade=F");
            }

        }
        int a = (sum/s);
            System.out.println(a);
        if(a==100 || 91>=a){
            System.out.println("grade=A+");
        }
        if(a==90 || 81>=a){
            System.out.println("grade=A");
        }
        if(a==80 || 71>=a){
            System.out.println("grade=B+");
        }
        if(a==70 || 61>=a){
            System.out.println("grade=B");
        }
        if(a==60 || 51>=a){
            System.out.println("grade=C+");
        }
        if(a==50 || 41>=a){
            System.out.println("grade=C");
        }
        if(a==40 || 33>=a){
            System.out.println("grade=D");
        }
        else{
            System.out.println("grade=F");
        }


        }

    }
