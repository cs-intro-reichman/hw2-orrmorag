public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int times = Integer.parseInt(args[1]);
                boolean flag = false;
                for (int i = 0; i < word.length(); i++) {
                        char ch = word.charAt(i);
                        if ("AEFHILMNORSX".indexOf(ch) != -1) {
                                flag = true;
                                break;
                        }
                }
                if (flag == true) {
                        for (int i = 0; i < word.length(); i++) {
                                char ch = word.charAt(i);
                                if ("AEFHILMNORSX".indexOf(ch) == -1) {
                                        System.out.println("Give me a  " + ch + ": " + ch + "!");
                                }
                                else {
                                        System.out.println("Give me an " + ch + ": " + ch + "!");
                                }
                        }
                }
                else {
                        for (int i = 0; i < word.length(); i++) {
                                char ch = word.charAt(i);
                                System.out.println("Give me a " + ch + ": " + ch + "!");
                        }
                }
                System.out.println("What does that spell?");
                for (int i = 0; i < times; i++) {
                        System.out.println(word + "!!!");
                }
        }
}