import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser
{

    public Optional<URL> back()
    {
        try {
            if(Math.random() < 0.5){
                return Optional.of(new URL("http://google.de"));

            }else{
                return Optional.empty();
            }
        } catch(MalformedURLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    public String retrieveSite(URL url) {
            return url.toString();
    }
    public static void main(String[] args) {
        System.out.println("Normal back");
        Browser browser = new Browser();
        browser.back().ifPresent(url -> System.out.println(browser.retrieveSite(url)));
        }
    }