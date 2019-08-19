import java.util.Scanner;
public class Delete
{
public static void main(String args[]) {
Scanner sc= new Scanner(System.in);

System.out.println("Enter the total number of elemnts of array ");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
    System.out.println("Enter the "+i+"th element");
a[i]=sc.nextInt();
}
System.out.println("Enter the index at which you want to delete the element");
int e=sc.nextInt();
a[e]=0;
for(int k=0;k<n;k++){
        System.out.print(a[k]+" ");
    }


}
}
