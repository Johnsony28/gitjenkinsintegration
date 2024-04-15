public class patterns2{


    public static void hollow_rectangle(int totrows, int totcol){
        for(int i=1; i<=totrows; i++){
            for(int j=1;j<=totcol;j++){
                //cel iand j
                if(i ==1 ||i==totrows || j ==1 || j== totcol){ // boumdary condition
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
     public static void main(String[]args){
      
hollow_rectangle(10,7);
    }
}


