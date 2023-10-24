import org.apache.commons.lang3.*;

public class Split_Command {
        public static String[] split_SOP(String SOP){
            return SOP.split("\\+");
        }

        public static String[] split_SOP_literal(String SOP_term) {
            String temp = StringUtils.substringBetween(SOP_term, "(",")");
            String[] temp_1 = temp.split("\\*");
            return temp_1;
        }
        public static String[] split_POS(String POS){


            return POS.split("\\*");
        }

        public static String[] split_POS_literal(String POS){
            return POS.split("\\(\\+\\)");
        }
}
