import java.util.Scanner;
import java.util.regex.Pattern;

public class Literals {

    public static String[] getLiteral(String term){
        Scanner sc = new Scanner(term);
        StringBuilder sb = new StringBuilder();
        String[] literal = new String[4];


      sb.append(sc.next(Pattern.compile("\\w\b")));



        System.out.println(sb);

        return literal;
    }


    public enum literal{
        a("a"),
        b("b"),
        c("c"),
        d("d"),
        an("a'"),
        bn("b'"),
        cn("c'"),
        dn("d'");


        private final String literal_name;

        literal(String literal_name){
            this.literal_name=literal_name;
        }
        private String getLiteral_name(){
            return this.literal_name;
        }
    }
}
