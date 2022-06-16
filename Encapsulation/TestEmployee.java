package OOP.Encapsulation;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpName("Khalid Hasan");
        e1.setEmpACno(172045589);
        e1.setEmpBalance(70000);
        e1.setEmpEmail("khalidwasif590@gmail.com");
        e1.getEmpBalance();
    }
}
