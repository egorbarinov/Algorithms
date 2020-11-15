package ru.geekbrains.ads.lesson4.home.fromguide;

class LinkedList{
    private Link first;


    public LinkedList(){
        first = null;

    }

    public void insert(String name, int age){
        Link newLink = new Link(name, age);
        newLink.next = first;
        first = newLink;
    }

    public Link delete(){

        Link temp = first;
        first = first.next;
        return temp;

    }



    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public LinkInterator getIterator(){
        return new LinkInterator(this);
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void display(){
        Link current = first;
        while(current != null){
            current.display();
            current = current.next;
        }
    }

}

