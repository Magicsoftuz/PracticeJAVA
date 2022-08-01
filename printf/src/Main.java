public class Main {
    public static void main(String[] args) {
        /* printf ->        an optional method to control format and display text to the console window
                            two arguments = format string + (object/variable/value)
                            % [flags] [precision] [width] [conversion-character]

         */

        boolean myBoolean = true;
        int myInt = 22;
        String myString = "Umid";
        double myDouble = 2200.2;

        // [conversion-character] uzgaruvchilarni xoxlagan urinda quyish

        System.out.printf("%b", myBoolean);
        System.out.printf("%d", myInt);
        System.out.printf("%s", myString);
        System.out.printf("%f", myDouble);
        System.out.println();

        // [width] joy tashlash musbat bulsa chap tomondan manfiy ung

        System.out.printf("Hello %20s", myString);
        System.out.println();

        // [precision] nechta raqam qatnashishi
        System.out.printf("%.2f", myDouble); // verguldan keyin 2 ta raqam
        System.out.println();
        // [flag]
        // - -> left justify // ung tomondan joy tashlash
        // + -> output (+ or -) +22, -22
        // 0 -> bush joylarni nol bilan tuldirish
        // , => minglik xonalarni vergul bilan ajratish (1,000)

        System.out.printf("You have this much money %,.2f", myDouble);

    }
}