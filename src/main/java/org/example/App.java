package org.example;

public class App {

    public static void main(String[] args) {
        Person person1 = new Person("Dima", "Ivanov", "1913", "Magadan");
        Person person2 = new Person("Oleg", "Sergeev", "1943","Chikago" );

        Person person3 = new Person("Olga", "GlebovnaV", "1986", "Sevastopol");
        Person person4 = new Person("Slava", "Ivanov", "1987", "Magadan");

        Person person5 = new Person("Marina", "Sergeeva", "2011","SPB" );
        Person person6 = new Person("Olga", "GlebovnaV", "2014", "SPB");

        Tree tree = new Tree();
        tree.addLink(person1, person2, Relation.BROTHER, Relation.BROTHER);

        tree.addLink(person1, person3, Relation.FATHER, Relation.CHILD);
        tree.addLink(person2, person4, Relation.FATHER, Relation.CHILD);
        tree.addLink(person1, person4, Relation.UNCLE, Relation.NEPHEW);
        tree.addLink(person2, person3, Relation.UNCLE, Relation.NIECE);

        tree.addLink(person3, person5, Relation.FATHER, Relation.CHILD);
        tree.addLink(person3, person6, Relation.FATHER, Relation.CHILD);
        tree.addLink(person4, person5, Relation.UNCLE, Relation.NIECE);
        tree.addLink(person4, person6, Relation.UNCLE, Relation.NIECE);
        tree.addLink(person5, person6, Relation.SISTER, Relation.SISTER);
        tree.addLink(person1, person6, Relation.GRANDFATHER, Relation.GRANDDAUGHTER);
        tree.addLink(person1, person5, Relation.GRANDFATHER, Relation.GRANDDAUGHTER);

        Research.printAllChildren("Oleg", tree);
        Research.printAllBrother("Dima", tree);
        Research.printTown("SPB", tree);
    }

}