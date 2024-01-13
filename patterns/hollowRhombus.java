
public class hollowRhombus {
 
    public static void main(String[] args) {
    
        //solid rhombus
        int n=5;

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=5; j++){
                if (j==1 || j==5 || i==1 || i==5) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       
    }
    
}
