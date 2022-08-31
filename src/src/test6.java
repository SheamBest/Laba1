package src;

public class test6 {
    public static void main(final String[] args) {
        final User user1 = new User("Maksym","Ivanchenko",17,"tickle.pickle@gmail.com");
        final User user2 = new User("Petro","Rubyk",21,"never.gonna.give.u.up@ukr.net");

        System.out.println("Comparison of user1 and user2 " + user1.equals(user2));
        System.out.println("Hash of user1:" + user1.hashCode());
        System.out.println("Hash of user2:" + user2.hashCode());
    }
}
