import person.Programmer;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("John");
        p.setYearOfBrith(2000);
        p.setAddres("street 149");
        p.setStartDate(new Date());
        p.setSalary(500_000L);
        p.setProgrammingLanguages(new String[] {"Java", "Scala", "Kotlin", "Julia"});
        System.out.println(p.getName());
        System.out.println(p.getSalary());
        System.out.println(Arrays.toString(p.getProgrammingLanguages()));
    }
}