import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.util.StringUtil;


public class Main {
    public static void main(String[] args) {

      StringBuilder sb = new StringBuilder();

      String term_form = args[0];

      String gate_form = args[1];

      sb.append(args[1]);

      String S3 = sb.toString();

            String[] s3 =StringUtils.split(S3,",");
            System.out.println(Arrays.toString(s3));
            int[] index = new int[s3.length];
            for (int i = 0; i < index.length; i++) {
                index[i] = Integer.parseInt(s3[i]);

        }

        for(int i =0;i<index.length;i++){
          System.out.println(index[i]);
        }

        int[] index1 = SOP_Inverse.getInverseIndex(index);
        for (int j : index1) {
            System.out.println(j);
        }
/*
        int[] i1 = new int[]{0, 1, 1, 0};
        int[] i2 = new int[]{1, 0, 1, 1};
        int[] i3 = new int[]{1, 0, 1, 0};
        int[] i4 = new int[]{1, 1, 1, 1};
        int[] i5 = new int[]{0, 0, 0, 0};
*/
        if(Objects.equals(term_form, "MIN")) {
          System.out.println(Canonical_SOP.SOP_generation_byIndex(index));
          System.out.println(SOP_Inverse.SOP_Inverse_Generation(index));
          System.out.println(Canonical_SOP.SOP_onset(index));
          System.out.println(Canonical_SOP.SOP_offset(index));
        }

        if(Objects.equals(term_form, "MAX")) {
          System.out.println(Canonical_POS.POS_generation_byIndex(index));
          System.out.println(POS_Inverse.POS_Inverse_Generation(index));
          System.out.println(Canonical_POS.POS_onset(index));
          System.out.println(Canonical_POS.POS_offset(index));
        }

        System.out.println(Literals.simplifyLiteral(Literals.getLiteral("(a'*b*c*d')"),Literals.getLiteral("(a*b*c*d)")));
        //int[] out_or = Gate_or.OR_3(i2,i3,i5);
        //for (int i=0;i<out_or.length;i++){
        //System.out.println(out_or[i]);
        //}
/*
        String terms = "(a'*b'*c'*d') + (a'*b'*c*d') + (a'*b'*c*d) + (a'*b*c*d') + (a'*b*c*d) + (a*b'*c'*d) + (a*b'*c*d) + (a*b*c'*d') + (a*b*c'*d) + (a*b*c*d')";
        String[] terms_separated = terms.split("\\+");
        System.out.println(Arrays.toString(terms_separated));
        System.out.println((Split_Command.split_SOP(terms))[1]);

        System.out.println((Arrays.toString(Split_Command.split_SOP_literal(Split_Command.split_SOP(terms)[1]))));
        */

    }
}