public class StringCountMatching {
    public static int countOccurrences(String s, String key){
        int count=0;
        if(key.isEmpty()){
            return 0;
        }
        int keyLength=key.length();
        for(int i=0;i<=s.length()-keyLength;i++){
            if(s.substring(i,i+keyLength).equals(key)){
                count++;
                i +=keyLength-1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        StringCountMatching solution = new StringCountMatching();

        // Test cases
        System.out.println(solution.countOccurrences("abcabcabba", "abc")); // Output: 2
        System.out.println(solution.countOccurrences("", "abc")); // Output: 0
        System.out.println(solution.countOccurrences("abcabcabba", "")); // Output: 0
        System.out.println(solution.countOccurrences("abcabcabba", "abba")); // Output: 1
        System.out.println(solution.countOccurrences("abcabcabc", "abc")); // Output: 3
        System.out.println(solution.countOccurrences("abababab", "ab")); // Output: 4
        System.out.println(solution.countOccurrences("aaa", "a")); // Output: 3
        System.out.println(solution.countOccurrences("mississippi", "iss")); // Output: 2
    }
}
