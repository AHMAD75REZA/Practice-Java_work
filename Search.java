import java.util.Scanner;
public class Search 
{
        public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i = 0; i<N; i++)
        {
             int[] arr = sc.nextInt();
                int flag =0;
                 System.out.println(" Enter the number which you want to search: ");
                 int key = sc.nextInt();
                 int index=0;
                 for(int i = 0 ; i<N; i++ )
                 {
                     if(arr[i]<key){
                    arr[i] = key;
                     index = i;
                     flag =1;
                    }
                     if(flag==1){
                     System.out.println("Element has found at index: " + index);
                    }
                    else{
                     System.out.println("Element has not found:");
                     }
        }    
        
}