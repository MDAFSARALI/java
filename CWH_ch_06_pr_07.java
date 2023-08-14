public class CWH_ch_06_pr_07 {
    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE);//ye line bataye ga ki maximum kitna value tax integer store kar skata hai..
        // System.out.println(Integer.MIN_VALUE);//ye line bataye ga ki minimum kitna value tax integer store kar skata hai..
        int []arr={1,2100,3,455,5,-6,0};
        int min=Integer.MAX_VALUE;//Maximum value of an integer so jo bhi hoga isse chota hoga tab update ho jayega ..//Ye linw sabse chota number dega integer ka 
       for (int elements : arr) {
            if (elements<min) {
                min=elements;
            }
       }
       System.out.println("The maximum of teh elemnt in array is "+min);
    
    }
}
