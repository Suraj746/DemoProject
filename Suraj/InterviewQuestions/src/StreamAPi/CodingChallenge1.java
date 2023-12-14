package StreamAPi;

public class CodingChallenge1 {

    public static void main(String[] args) {
        String s1 = "10#11#12";
        String s2 = "1326#";
        String output1 = convertedString(s1);
        String output2 = convertedString(s2);
        System.out.println("Input: " + s1 + ", Output: " + output1);
        System.out.println("Input: " + s2 + ", Output: " + output2);
    }

    public static String convertedString(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
//                System.out.println(num);
                sb.append((char) ('a' + num - 1));
                i += 3;
            }
            else if (i + 1 < s.length() && s.charAt(i + 1) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 1));
                sb.append((char) ('a' + num - 1));
                i += 2;
            }
            else {
                int num = Integer.parseInt(s.substring(i, i + 1));
//                System.out.println(num);
                sb.append((char) ('a' + num - 1));
                i++;
            }
        }
}
