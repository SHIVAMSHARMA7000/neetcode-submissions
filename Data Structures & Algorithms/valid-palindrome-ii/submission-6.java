class Solution {
    public boolean validPalindrome(String s) {
        int c = 0;
        int i = 0;
        int j = s.length()-1;
        int a = 0;
        int b = 0;

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                 a = i;
                 b = j;
                break;


                
                
                
            }

            i++;
            j--;

                
            

           

        }
        a = a+1;
        b = b-1;
        int l = 0;


        while(a<=j){
            if(s.charAt(a)!=s.charAt(j)){
                l++;
                break;
                

            }
            a++;
            j--;


        }
        while(i<=b){
            if(s.charAt(i)!=s.charAt(b)){
                l++;
                break;


            }
            i++;
            b--;


        }

        if(l<=1){
            return true;
        }
        else{
            return false;
        }

     
        
    }
}