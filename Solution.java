package Solution;

import java.util.Arrays;

public class Solution {
	
	
	
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        System.out.println("Size: "+ m+ ", "+n);

        
        //m+1, and n+1
        boolean[][] f = new boolean[m + 1][n + 1];
        //both empty is true 
        f[0][0] = true;
        
        //print
        for (int k=0;k<=m;k++)
            System.out.println ( Arrays.toString (f[k]));
        System.out.println("\n");
        
        
        for (int i = 0; i <= m; ++i) {
        	//because (0,0) is finished, so starting from (0,1)
            for (int j = 1; j <= n; ++j) {
                System.out.println("i:" + i + "; j: "+ j);
                System.out.println("Real: " + (i-1) + "  "+ (j-1));
            	//char is *
                if (p.charAt(j - 1) == '*') {

                    if (matches(s, p, i, j - 1)) {
                    	System.out.println("* match");
                    	System.out.println("f["+i+"]["+j+"]"+f[i][j]);
                    	System.out.println("f["+(i-1)+"]["+j+"]"+f[i-1][j]);
                        f[i][j] = f[i][j-2] || f[i - 1][j];
                    }else{
                    	
                    	//isn't matching，throw a*
                    	System.out.println("* not match");
                    	System.out.println("f["+i+"]["+(j-2)+"]"+f[i][j - 2]);
                        f[i][j] = f[i][j - 2];
                    }
                //char isn't *
                } else {
                	System.out.println("is not *");
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
                

                //print
                for (int k=0;k<=m;k++)
                    System.out.println ( Arrays.toString (f[k]));
                System.out.println("\n");
            }
        }
        
        
        return f[m][n];
        
    }

    public static boolean matches(String s, String p, int i, int j) {
    	//string couldn't be empty
        if (i == 0) {
        	System.out.println("i==0");
            return false;
        }
        
        //core
        if (p.charAt(j - 1) == '.') {
        	System.out.println("any");
            return true;
        }
        
        System.out.println("equal?" + (i-1)  +" "+ (j-1 )+ "   "+ s.charAt(i - 1) +"  " +p.charAt(j - 1));
        return s.charAt(i - 1) == p.charAt(j - 1);
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaaa";
		String p = "a*";
		System.out.println(s+ "    " + p);
		System.out.print(isMatch(s,p));

	}

}
