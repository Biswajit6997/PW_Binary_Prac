

public class eg1 {
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        arr[0]=new int[4];
        arr[1]=new int[2];
        arr[2]=new int[3];
        for(int i=0;i<=2;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		} 
/*   Jagged Array */

   


        int nums[][]={{2,3,0,5},{1,4,5},{6,7,8,9}};
        for(int i=0;i<4;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
