/** Created by James Buettner on Wednesday, November 18, 2020 for CSC 422. */

public class Main {
    public static void main(String[] args) {
        ImmutableListInterface list1 = new ImmutableList(new int[] {1, 2, 3});
        ImmutableListInterface list2 = new ImmutableList(list1);
        ImmutableListInterface list3 = list1.concat(list2);
        ImmutableListInterface list4 = new ImmutableList(new int[] {4, 5, 6, 7});
        ImmutableListInterface list5 = list1.concat(list4.concat(list3));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list5);

    }

}