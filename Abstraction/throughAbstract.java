import java.util.ArrayList;

import java.util.*;

abstract class Mobile{
    ArrayList<String> contacts = new ArrayList<>();

    abstract public void calling(String number);
    abstract public void sendMessage(String number, String message);
    public void addContact(String number){
        contacts.add(number);
    }
}


class Apple extends Mobile{
    public void calling(String number){
        System.out.println("Calling number......" + number);
    }

    public void sendMessage(String number, String message){
        System.out.println("Sending message to " + number + ":" + message);
    }

    public void HDPhotos(){
        System.out.println("Clicking photos");
    }

    public void videoCalling(String number){
        System.out.println("Video Calling to......" + number);
    }
}


class throughAbstract {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.calling("123456789");
        apple.sendMessage("458732156", "Hi, How are you");
        apple.HDPhotos();
        apple.videoCalling("423154526");
        apple.addContact("2369457523");
    }   
}
