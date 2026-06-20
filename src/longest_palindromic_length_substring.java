public class longest_palindromic_length_substring {
    public  static  int ans(int i,int j,String s){
        if(i>=j) return 1;
        if(ispalindrome(i,j,s)) return j-i+1;
        int max=Integer.MIN_VALUE;
        for(int k=i;k<j;k++){
            if(ispalindrome(i,k,s)){
                int temp=Math.max((k-i+1),ans(k+1,j,s));
                max=Math.max(max,temp);
            }
        }
        return max;
    }
    public static  boolean ispalindrome(int i,int j,String s){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="afgfhhhhhhhhhtrtrtrtreete";
        int n=s.length();
        System.out.println(ans(0,n-1,s));

    }
}
