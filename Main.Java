import java.util.Scanner;
import java.lang.StringBuilder;

class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // Remove leading and trailing spaces

        String[] words = s.split("\\s+");
        StringBuilder str = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            str.append(words[i]);
            if(i != 0){
                str.append(" ");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution solution = new Solution();
        String reversed = solution.reverseWords(s);

        System.out.println(reversed);
    }
}
