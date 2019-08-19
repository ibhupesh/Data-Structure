import java.util.Scanner;
public class Array
{
public static void main(String args[]) {
Scanner sc= new Scanner(System.in);

System.out.println("Enter the total number of elemnts of array ");
int n=sc.nextInt();
int a[]=new int[n+1];
for(int i=0;i<n;i++){
    System.out.println("Enter the "+i+"th element");
a[i]=sc.nextInt();
}
System.out.println("Enter the index at which you want to insert the element");
int e=sc.nextInt();
System.out.println("Enter the element to be inserted");
int s= sc.nextInt();
for(int j=n;j>e;j--){
    a[j]=a[j-1];
    for(int k=0;k<(n+1);k++){
        System.out.print(a[k]+" ");
    }
    System.out.println();
}
a[e]=s;
for(int k=0;k<(n+1);k++){
        System.out.print(a[k]+" ");
    }


}
}
