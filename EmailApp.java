package emailApp;


public class EmailApp {
    public static void main(String[] args) {
        Email E = new Email("Abhishek","Vishwakarma");

        System.out.println(E.showInfo());
//
        E.setAlternateEmail("abhishekvishwakarma087@gmail.com");
        System.out.println("Your New Email Id is " + E.getAlternateEmail());

        E.changePassword("Abhishek687@");
        System.out.println("Your New Password is " + E.getPassword());

        E.setMailBoxCapacity(5000);
        System.out.println("Your New Mailbox Capacity is " + E.getMailBoxCapacity());



    }
}
