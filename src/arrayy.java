public class arrayy {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[4];
        arrayString[0] = "Nyimas";
        arrayString[1] = "Tsabitah";
        arrayString[2] = "Nasywa";
        arrayString[3] = "Shabirah";
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);

        String[] arrayString2 = {
                "Nyimas", "Tsabitah", "Nasywa", "Shabirah"
        };
        System.out.println(arrayString2 [0]);
        System.out.println(arrayString2 [1]);
        System.out.println(arrayString2 [2]);
        System.out.println(arrayString2 [3]);


        int[] arrayint = {
                10, 90, 100, 20
        };

        System.out.println(arrayint[0]);

        String[][] member = {
                {"Muhammad", "Yusuf", "Rahman"},
                {"Nyimas", "Tsabitah", "Nasywa", "Shabirah"},
                {"ucup"}
        };
        System.out.println(member[0][1]);
        System.out.println(member[1][2]);
    }

}
