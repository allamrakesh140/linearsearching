import java.util.Scanner;
import java.util.Arrays;
class linearsearching{
public static int searching(int arr[],int n,int k){
         for(int i=0;i<n;i++){
              if(arr[i]==k){
                   return i;
                     }
                      }
                       return -1;                             

 }

public static void main(String []args)
{

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n=scanner.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
                 System.out.println("Enter the element to be founded");
                  int k=scanner.nextInt();
               int result=  searching(arr,n,k);
                                 		             
            if(result!=-1){
                          System.out.println("element is found at index: " + result);
                         }                  
                  else{
                           System.out.println("element is not found  at index " );
                       }

}
}
