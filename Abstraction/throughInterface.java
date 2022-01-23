import java.util.ArrayList;

import java.util.*;

interface Mobile{
    public void calling(String number);
    public void sendMessage(String number, String message);
}

interface Camera{
    public void HDPhotos();
    public void videoCalling(String number);
}

class Apple implements Mobile, Camera{
    private ArrayList<String> contacts = new ArrayList<>();

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

    public boolean addContact(String number){
        contacts.add(number);
        return true;
    }
}


class throughInterface {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.calling("123456789");
        apple.sendMessage("458732156", "Hi, How are you");
        apple.HDPhotos();
        apple.videoCalling("423154526");
        apple.addContact("2369457523");
    }   
}
