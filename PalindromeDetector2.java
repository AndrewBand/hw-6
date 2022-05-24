package module6.hw6;
class PalindromeDetector2 {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        char[] chars = word.toCharArray();
        for(char c: chars) {
//            result = c + result;
            sb.append(c);
        }
        result = String.valueOf(sb.reverse());
//        System.out.println("result = " + result);
        return result;
    }
}

class PalindromeDetectorTest {
    public static void main(String[] args) {
        //false
        System.out.println(new PalindromeDetector2().isPalindrome("Java"));

        //true
        System.out.println(new PalindromeDetector2().isPalindrome("Noon"));
    }
}
