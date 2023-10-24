import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import org.apache.poi.util.StringUtil;


public class Main {
    public static void main(String[] args) {

      String s = args[0];


        if(Objects.equals(s, "MIN")){
            String s1 = args[1];
            int[] index ;
        }

        int[] index2 = new int[]{1, 4, 5, 8, 10, 15};
        int[] index1 = SOP_Inverse.getInverseIndex(index2);
        for (int j : index1) {
            System.out.println(j);
        }

        int[] i1 = new int[]{0, 1, 1, 0};
        int[] i2 = new int[]{1, 0, 1, 1};
        int[] i3 = new int[]{1, 0, 1, 0};
        int[] i4 = new int[]{1, 1, 1, 1};
        int[] i5 = new int[]{0, 0, 0, 0};

        System.out.println(Canonical_SOP.SOP_generation_byIndex(index2));
        System.out.println(SOP_Inverse.SOP_Inverse_Generation(index2));

        System.out.println(Canonical_POS.POS_generation_byIndex(index2));
        System.out.println(POS_Inverse.POS_Inverse_Generation(index2));

        System.out.println(Canonical_SOP.SOP_onset(index2));
        System.out.println(Canonical_SOP.SOP_offset(index2));

        KMAP.PIs(index2);
        System.out.println();

        int[] out_and = Gate_or.OR_4(i1, i5, i5, i5);
        for (int i = 0; i < out_and.length; i++) {
            System.out.println(out_and[i]);
        }


        //int[] out_or = Gate_or.OR_3(i2,i3,i5);
        //for (int i=0;i<out_or.length;i++){
        //System.out.println(out_or[i]);
        //}

        String terms = "(a'*b'*c'*d') + (a'*b'*c*d') + (a'*b'*c*d) + (a'*b*c*d') + (a'*b*c*d) + (a*b'*c'*d) + (a*b'*c*d) + (a*b*c'*d') + (a*b*c'*d) + (a*b*c*d')";
        String[] terms_separated = terms.split("\\+");
        System.out.println(Arrays.toString(terms_separated));
        System.out.println((Split_Command.split_SOP(terms))[1]);

        System.out.println((Arrays.toString(Split_Command.split_SOP_literal(Split_Command.split_SOP(terms)[1]))));
    }
}