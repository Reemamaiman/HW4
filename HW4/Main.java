package HW4;

public class Main {

    public class MainClass {

        public static void main(String[] args) {

            Customer customer = new Customer(123, "Reema", 'f');
            System.out.println(customer.getId());
            System.out.println(customer.getName());
            System.out.println(customer.getGender());
      System.out.println(customer.toString());
        }

    }

}
