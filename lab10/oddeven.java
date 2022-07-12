// wap to count the odd even number 

class oddeven{
    public static void main (String [] args ){

        int a [] = {1,2,3,4,5};
         

        int e = 0 , o= 0;

        for (int i =0 ; i<a.length; i++){
            if(a[i]%2==0){
                e++;
                System.out.print("Even : "+a[i]);
            }
            else{
                o++;
                System.out.print(a[i]);
            }
        } 


    }
}