public class ArrayJagged {
    public static void main(String[] args){
        System.out.println("Welcome to jagged array");
        int[][] arr=new int[3][];

        arr[0] =new int[2];
        arr[1]=new int[4];
        arr[2]=new int[3];

        arr[0][0]=84;
        arr[0][1]=11;

        arr[1][0]=4;
        arr[1][1]=1;
        arr[1][2]=8;
        arr[1][3]=2;

        arr[2][0]=21;
        arr[2][1]=51;
        arr[2][2]=108;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



        
    }
    
}
