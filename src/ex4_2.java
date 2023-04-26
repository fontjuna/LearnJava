/**
 * Created by 노승화 on 2017-06-16.
 */
public class ex4_2 {
    public static void main(String[] args) {
        int[] moneyList = new int[]{121902, 8302, 55100};
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println("moneyList[" + i + "] = " + moneyList[i]);
        }
        for (int won : moneyList) {
            System.out.println("moneyLists = " + won);
        }
    }
}
