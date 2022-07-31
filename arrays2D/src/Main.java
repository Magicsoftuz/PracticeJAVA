public class Main {
    public static void main(String[] args) {

        // Static joy ajratish
        String[][] phones = new String[3][3];
        phones[0][0] = "Samsung";
        phones[0][1] = "Iphone";
        phones[0][2] = "Oppo";
        phones[1][0] = "Simens";
        phones[1][1] = "Motorola";
        phones[1][2] = "Microsoft";
        phones[2][0] = "Mi";
        phones[2][1] = "Xiaomi";
        phones[2][2] = "Tesla";

        for (int i = 0; i < phones.length; i++) {
            System.out.println();
            for (int j = 0; j < phones[i].length; j++) {
                System.out.print(phones[i][j]+" ");

            }
        }

        // Dynamic oldindan ajratish
        System.out.println("\n------------Laptops------------------");
        String[][]  laptops = {{"Apple", "Samsung"}, {"MSI", "HP"} };
        for (int i = 0; i < laptops.length; i++) {
            System.out.println();
            for (int j = 0; j < laptops[i].length; j++) {
                System.out.print(laptops[i][j]+ " ");
            }
        }


    }
}