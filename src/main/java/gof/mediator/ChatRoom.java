package src.main.java.gof.mediator;

import javax.crypto.interfaces.PBEKey;
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
