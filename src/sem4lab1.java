import java.util.*;
public class sem4lab1 {
    public static  void ans(int arr[],int first,int last,int ans1[]){
        if(first==last) {
            ans1[0]=arr[first];
            ans1[1]=arr[last];
            return;
        }
        if(first+1==last){
            int x=arr[first];
            int y=arr[last];
         int  maxp=Math.max(x,y);
           int minp=Math.min(x,y);
           ans1[0]=maxp;
           ans1[1]=minp;
           return;
        }
        int mid=(first+last)/2;
        int left[]=new int[2];
        int right[]=new int[2];
        ans(arr,first,mid,left);
        ans(arr,mid+1,last,right);
        int x=Math.max(left[0],right[0]);
        int y=Math.min(left[1],right[1]);
       ans1[0]=x;
       ans1[1]=y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<min) min=arr[i];
//            if(arr[i]>max) max=arr[i];
//
//        }
         // now using divide and conquer approach
        int first=0;
        int last=arr.length-1;
        int ans1[]=new int[2];
        ans(arr,first,last,ans1);
        System.out.println("Max value is "+ans1[0]);
        System.out.println("Min value is "+ans1[1]);
    }
}