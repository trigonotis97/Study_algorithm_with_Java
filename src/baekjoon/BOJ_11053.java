package baekjoon; //DELETE

import java.io.*;

public class BOJ_11053 { //Main

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int []arr=new int[1001];
        int [] maxLength=new int [1001];
        String [] s=br.readLine().split(" ");

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }

        //top-down
        // 뒤에서 부터 하나씩 최고길이 따지기

        int i,j,res=0;
        for(i=n-1;i>=0;i--){
            maxLength[i]=0;
            for(j=i;j<n;j++){
                if(arr[i]<arr[j]) {
                    maxLength[i]=Math.max(maxLength[i],maxLength[j]);
                }
            }
            maxLength[i]++;
            res=Math.max(res,maxLength[i]);
        }
       System.out.println(res);
        br.close();
    }
}


