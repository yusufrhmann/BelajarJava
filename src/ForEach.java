public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "Muhammad", "Yusuf", "Rahman",
                "Nyimas", "Tsabitah", "Nasywa", "Shabirah"
        };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }// for each
        for (var a : array) {
            System.out.println(a);
        }
    }
}
