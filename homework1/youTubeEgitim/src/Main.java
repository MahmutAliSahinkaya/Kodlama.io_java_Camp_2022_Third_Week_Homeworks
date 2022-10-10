public class Main {
    public static void main(String[] args) {
        //IoC Container
        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();

/*
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer(); // örneğini oluşturmak, instance oluşturmak, instance creation
        customer.id= 1;
        customer.city= "Ankara";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();
        Company company = new Company();
        company.taxNumber="10000";
        company.companyName="Arçelik";
        company.id=100;
        CustomerManager customerManager2 = new CustomerManager(new Person());
        Person person = new Person();
        person.nationalIdentity = "asd";

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
*/
 /*     int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2=100;
        System.out.println(number1);
*/
/*
        int [] numbers1 = {1,2,3};
        int [] numbers2 = {10,20,30};
        numbers1=numbers2;
        numbers2[0]=1000;
        System.out.println(numbers1[0]);
*/
    }
}