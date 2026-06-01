import java.util.Scanner;

public class OccurenceForEach {
    public static void main(String[] args){
        System.out.println("find occurence of a specific element");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number that you you want to search: ");
        int element=input.nextInt();
        int[] nums={1,2,3,4,7,9,4,3,6,2,};
        int occ=countOccurence(nums,element);
        System.out.println("Your occurence was found: "+occ+" times");

    }
    public static int countOccurence(int[] nums,int element){
        int occ=0;
        for(int num:nums){
            if(num==element){
                occ++;
            }
        }
        return occ;
    }
    
}
