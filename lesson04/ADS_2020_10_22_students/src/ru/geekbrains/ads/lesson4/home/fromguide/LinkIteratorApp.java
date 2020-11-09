package ru.geekbrains.ads.lesson4.home.fromguide;

public class LinkIteratorApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkInterator itr = new LinkInterator(list);

        itr.insertBefore("Sergey", 25);
        itr.insertBefore("Egor", 24);
        itr.insertBefore("Anton", 18);
        itr.insertAfter("Artem", 20);
        itr.insertAfter("Katerina", 20);
        itr.insertAfter("Evgen", 20);
        itr.insertAfter("Oleg", 20);
        itr.insertAfter("Olga", 20);
        list.display();
        System.out.println("//////////");
        System.out.println("delete: " + " " + itr.deleteCurrent()); // delete:  Olga

        System.out.println(itr.atEnd()); //false
        System.out.println(itr.getCurrent().name); //Egor
        System.out.println(itr.getCurrent().next.name); // Sergey
        list.display();

    }

}
