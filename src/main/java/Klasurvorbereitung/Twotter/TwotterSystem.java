package Klasurvorbereitung.Twotter;

import java.util.ArrayList;
import java.util.List;

public class TwotterSystem {
    List<Message> allMessages =new ArrayList<>();

    public void addMessage(User u,Message m){
        if(m.getText().length()<=140){
            allMessages.add(m);
            m.setAuthor(u);
        }else{
            System.out.println("Nachricht über 140 zeichen");
        }
    }
    public List<Message> getAllMessages(){
        return allMessages;
    }
    public List<Message> getAllMessagesFromUser(User u){
        List<Message> fromeUser =new ArrayList<>();

        for(Message m:allMessages){
            if (m.getAuthor().equals(u)){
                fromeUser.add(m);
            }
        }
        return fromeUser;
    }
    public List<Message> getAllMessagesFromDate(String date){
        List<Message> fromeDate = new ArrayList<>();
        for(Message m:allMessages){
            if(m.getCreationDate().equals(date)){
                fromeDate.add(m);
            }
        }
        return fromeDate;
    }

}
