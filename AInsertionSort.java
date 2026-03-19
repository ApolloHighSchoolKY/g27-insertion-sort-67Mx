
    import java.util.Arrays;
    public class AInsertionSort
{
    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        int temp=0;

        //loop through the "deck"
        for(int i=1; i<myNumbers.length; i++){
            //loop for for each pair (0,1 | 1,2 | 2,3)
            for(int j=0; j<i; j++){
                if(myNumbers[i]<myNumbers[j]){
                    temp=myNumbers[i];
                    for(int k=i; k>j; k--)
                    myNumbers[k]=myNumbers[k-1];
                    myNumbers[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(myNumbers));
    }
}
