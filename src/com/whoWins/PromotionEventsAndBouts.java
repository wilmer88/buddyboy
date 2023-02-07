package com.whoWins;
import java.util.*;
public interface PromotionEventsAndBouts {
    public static void main() {
      List<Object[][]> promotion = new ArrayList<>();

        Map<String,Object> place1 = new HashMap<>();
        place1.put("arena","TMobile");
        place1.put("time", "12:30");

        Map<String,Object> fighter1 = new HashMap<>();
        fighter1.put("fighterName", "george");
        fighter1.put("fighterOdds", -200);

        Map<String,Object> fighter2 = new HashMap<>();
        fighter2.put("fighterName", "Jon");
        fighter2.put("fighterOdds", 100);

        Object[][] arena = new Object[][]{{place1}};

        Object[] bout1 = new Object[]{fighter1,fighter2};

        arena[0]= bout1;

        promotion.add(arena);

        System.out.println(Arrays.deepToString(promotion.get(0)));

    }
}
























//        Object[] bout2 = new Object[]{fighter1,fighter2};
//      List<PromotionEventsAndBouts> promotion = new ArrayList<>();
//         promotion.add(bout1);
//        promotion.add(bout2);
//        System.out.println(promotion.get(0));

//        System.out.println(promotion.get(0)[0][0]);

//        System.out.println(promotion.get(0)[i][1]);

//        Object[][] bout2 = new Object[][]{
//                {fighter1,fighter2}
//
//        };

//                    promotion.add(event1);

//            promotion.set(0, event1);
//            promotion.set(1, event2);

//        Object[][] event2 = new Object[][]{
//                {place2}
//
//        };
//        Map<String,Object> place1 = new HashMap<>();
//        place1.put("arena","TMobile");
//        place1.put("time", "12:30");
//        Map<String,Object> place2 = new HashMap<>();
//        place2.put("arena","squareGarden");
//        place2.put("time", "8:30");
//        Object[][] event2 = new Object[][]{
//                {fighter1,fighter2}
//
//        };

//        promotion.add(event1);
//        promotion.add(event2);

//        System.out.println(promotion.get(0)[0][0]);
//        System.out.println(promotion.get(0)[0][1]);
//        System.out.println(promotion.get(1)[0][0]);
//        System.out.println(promotion.get(1)[0][1]);
//        promotion.get(0)[0][0]= arena;
//    List<Object[][]> objects = new ArrayList<Object[][]>();
//
//    Object[][] nestedArray1 = new Object[][] {
//            {new Object(), new Object()},
//            {new Object(), new Object()}
//    };
//
//    Object[][] nestedArray2 = new Object[][] {
//            {new Object(), new Object()},
//            {new Object(), new Object()}
//    };
//
//        objects.add(nestedArray1);
//        objects.add(nestedArray2);
//
//        System.out.println(objects.get(0)[0][0]);
//}
//
//}

