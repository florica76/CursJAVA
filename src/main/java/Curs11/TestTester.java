package Curs11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestTester {
    public static void main(String[] args) {
        Tester t1 = new Tester("Oana", 22, "QA");
        Tester t2 = new Tester("Ion", 28, "DEV");
        Tester t3 = new Tester("Maria", 30, "QA");
        List<Tester> testerList = new ArrayList<>();
        //System.out.println(t1.name);
        //System.out.println(t2.name);
        testerList.add(t1);
        testerList.add(t2);
        testerList.add(t3);
        System.out.println(testerList.get(0).name);
        for(Tester t: testerList){
            System.out.println(t.name +" : "+ t.age +" : "+t.department);
        }
        Iterator<Tester> iterator = testerList.iterator();
        //System.out.println(iterator.next().age);
        while (iterator.hasNext()){
            Tester tes = iterator.next();
            System.out.println(tes.department);
        }
    }
}
