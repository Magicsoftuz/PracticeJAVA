public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Umid");
        Friend friend2 = new Friend("Plux");
        Friend friend3 = new Friend("Taka");
        Friend friend4 = new Friend("Nata");
        System.out.println(Friend.numberOfFriends);

       Friend.displayFriends();
    }
}