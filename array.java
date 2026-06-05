// import java.util.Scanner;
// class array{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int marks[]=new int[3];    //type arrayname[]=new type[size];
//         marks[0]=sc.nextInt();
//          marks[1]=sc.nextInt();
//           marks[2]=sc.nextInt();
//           System.out.println(marks[0]);
//           System.out.println(marks[1]);
//           System.out.println(marks[2]);
//     }
// }





// import java.util.Scanner;
// class array{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int marks[]=new int[5];   
       
//         for(int i=0;i<=4;i++){
//             marks[i]=sc.nextInt();
//         }
//         for(int i=0;i<=4;i++){
//         System.out.println(marks[i]);
//         }
        
        
//     }
// }




// import java.util.Scanner;
// class array{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int marks[]=new int[n];  
//         for(int i=0;i<=n-1;i++){
//             marks[i]=sc.nextInt();
//         }
//         for(int i=0;i<=n-1;i++){
//             System.out.println(marks[i]);
//         } 
       
        
        
//     }
// }





// import java.util.Scanner;
// class array{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int marks[]=new int[n];  
//         for(int i=0;i<=n-1;i++){
//             marks[i]=sc.nextInt();
//         }
//         int x=sc.nextInt();
//         for(int i=0;i<marks.length;i++){ //marks.length=size of marks array
//             if(marks[i]==x)   {
//                 System.out.println(i);
//             }
       
        
        
//     }
// }
// }




// import java.util.Scanner;
// class array{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         String names[]=new String[n];
//         for(int i=0;i<n;i++){
//             names[i]=sc.next();
//         }
//        for(int i=0;i<n;i++){
//         System.out.println(names[i]);
//        }
        
        
//     }
// }






// import java.util.Scanner;
// class array{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int num[]=new int[n];
//          int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             num[i]=sc.nextInt();
        
       
//         if(num[i]>max){
//             max=num[i];
//         }
//         if(num[i]<min){
//             min=num[i];
//         }
//     }
//         System.out.println("maximum" + max);
//         System.out.println("minimum" + min);
         
//     }
// }






//2D array
//type[][] array name = new type[row][column];
// import java.util.Scanner;
// class array{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         int num[][]=new int[r][c];
//         for(int i=0 ;i<r;i++){
            
//         for(int j=0;j<c;j++){
//             num[i][j]=sc.nextInt();
//         }
//     }
//     for(int i =0; i<r;i++){
//         for(int j =0;j<c;j++){
//             System.out.print(num[i][j] + " ");
//         }
//         System.out.println();
//     }
// }
// }



//location of number
// import java.util.Scanner;
// class array{
//     public static void main(String arg[]){
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//          int c=sc.nextInt();
//          int matrix[][]= new int[r][c];
//          for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//          }
        
//          for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//          }
//           int x=sc.nextInt();
        
        
//          for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(matrix[i][j]==x){
//                 System.out.print(i);
//                 System.out.print(","+j);
//             }
            
//          }
         
         
//     }
         
         
//     }
// }






//tranpose of matrix
import java.util.Scanner;
class array{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
         int c=sc.nextInt();
         int matrix[][]= new int[r][c];
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
         }
        
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
         }
         for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
          
        
        
         
         
         
    }
}