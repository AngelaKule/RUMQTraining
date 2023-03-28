import Classes.Person;

public class Tester {
    public static void  main (String[] args){
        Person Anxhela = new Person("Angie");
        Person obj = new Person("An");

        Person [] names = new Person[2];
        names [0] = Anxhela;
        names [1] = obj;
        System.out.println(names);
        Person[] method2 = new Person[]{Anxhela, obj};
        System.out.println(method2);

        for (Person name :names){
            System.out.println(name.getName());
        }

        System.out.println(Anxhela);
        System.out.println("To string : " + Anxhela.toString());
        System.out.println("Hash code : " + Anxhela.hashCode());
        System.out.println("Get Class : " + Anxhela.getClass());
        System.out.println(Anxhela.getName());
        System.out.println(obj);
        System.out.println(obj.getName());
    }
}
