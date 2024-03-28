import java.util.Scanner;

public class Array1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of claeeses");
        int classes=sc.nextInt();
        System.out.println("Enter the number of Students");
        int student=sc.nextInt();

        int arr[][]=new int[classes][student];
        System.out.println("Enter the marks "+classes+"*"+student+" of the student");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("The marks of the students are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}