package com.whoWins;
import java.util.ArrayList;
import java.util.List;
public interface PromotionEventsAndBouts {
    public static void main(String[] args) {
        
    List<Object[][]> objects = new ArrayList<Object[][]>();

    Object[][] nestedArray1 = new Object[][] {
            {new Object(), new Object()},
            {new Object(), new Object()}
    };

    Object[][] nestedArray2 = new Object[][] {
            {new Object(), new Object()},
            {new Object(), new Object()}
    };

        objects.add(nestedArray1);
        objects.add(nestedArray2);

        System.out.println(objects.get(0)[0][0]);
}

}

