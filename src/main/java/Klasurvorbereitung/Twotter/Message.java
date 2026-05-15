package Klasurvorbereitung.Twotter;

import java.time.LocalDate;
public class Message
{
    private final String text;
    private final String creationDate;

    private User author;

    public Message(String text)
    {
        this.text = text;
        creationDate = LocalDate.now().toString();
    }
    public String getText()
    {
        return text;
    }
    public User getAuthor(){
        return author;
    }
    public void setAuthor(User u){
        this.author=u;
    }
    public String getCreationDate()
    {
        return creationDate;
    }
    @Override
    public String toString()
    {
        return text;
    }
}