class Solution {
    public String reverseWords(String s) {
        char[] word =  s.toCharArray();
        int start = 0;
        for(int i=0; i<=s.length(); i++){
            if (i== word.length || word[i] == ' '){
                int left = start;
                int right = i-1;
                while(left < right){
                    char temp = word[left];
                    word[left] = word[right];
                    word[right] = temp;
                    left++;
                    right--;
                }
    
        start = i+1;
            }
        }
        return new String(word);
    }
}