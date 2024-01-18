import java.io.*;
import java.util.*;
class GFG{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int [] a=new int [n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                Solution g=new Solution();
                ArrayList<Integer> ans =g.duplicates(a, n);
                for(Integer val:ans) System.out.println(val +" ");
                System.out.println();
            }
            
        }
    }
}
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        // ArrayList<Integer> lst2=new ArrayList<>();
        // lst2.add(-1);
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int in=0;in<arr.length;in++){
        //     if(map.containsKey(arr[in])){
        //         map.put(arr[in],(map.get(arr[in])+1));
        //     }
        //     else{
        //         map.put(arr[in],1);
        //     }
        // }
        // for(int key:map.keySet()){
        //     if(map.get(key)>1){
        //         lst.add(key);
        //     }
        // }
        // if(lst.isEmpty()){
        //     return lst2;
        // }
        // else{
        //     return lst;
        // }
         Arrays.sort(arr);
        int index = 0;

		for (int i = 0; i < n - 1; i++) {
			if (!list.isEmpty()) {
				if (arr[i] == arr[i + 1] && list.get(index) != arr[i]) {
					i = i + 1;
					list.add(arr[i]);
					index++;
				}
			} else {
				if (arr[i] == arr[i + 1]) {
					i = i + 1;
					list.add(arr[i]);
				}
			}
		}

		if(list.isEmpty()) {
			list.add(-1);
		}
		return list;
    }
}