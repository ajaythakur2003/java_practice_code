package Recursion.strings;

public class AppNotApple {
    public static void main(String[] args) {
        System.out.println(appNotApple("afhevuappeely"));
    }

    static String appNotApple(String word){
        if(word.isEmpty()){
            return"";
        }

        if(word.startsWith("app") && !word.startsWith("apple")){
            return appNotApple(word.substring(3));
        }
        else {
            return   word.charAt(0) + appNotApple(word.substring(1));
        }
    }
}
