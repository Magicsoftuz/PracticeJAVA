public class Main {
    public static void main(String[] args) {

        String name = "    Umid    ";

        // Equals method (Bu teng busa true bumasa false)
        boolean resultEqauls = name.equals("Umid");
        System.out.println(resultEqauls);

        // Length method (Bu nechta character borligini kursatadi)
        int resultLength = name.length();
        System.out.println(resultLength);

        // CharAt method (Bu qaysi raqamni bersayiz usha raqamda turgan harfni oladi ASC|| dagi)
        int resultCharAt = name.charAt(1);
        System.out.println(resultCharAt);

        // indexOf mehtod (Bu harfni bersayiz qaysi urinda turgani
        int resultIndexOf = name.indexOf("U");
        System.out.println(resultIndexOf);

        // isEmpty (Bush yoki bush emasligini tekshirish)
        boolean resultIsEmpty = name.isEmpty();
        System.out.println(resultIsEmpty);

        // toUpperCase, toLowerCase (Hammasini katta yoki kichik harfga utkazish)
        String resultUpper = name.toUpperCase();
        System.out.println(resultUpper);

        // trim method (Ikki yon tomonida bush joylarni olib tashlash)
        String resultTrim = name.trim();
        System.out.println(resultTrim);

        // replace method (bir harfi joyiga boshqasini joylashtirish)
        String resultReplace = name.replace("U", "K");
        System.out.println(resultReplace);





    }
}