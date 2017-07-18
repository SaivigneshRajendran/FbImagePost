
import com.restfb.BinaryAttachment;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import static com.restfb.Parameter.with;
import com.restfb.types.FacebookType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String accessToken = "EAACEdEose0cBAMy03AQz67ibZAZCQ8KwMu9xnbdgEY4vnPGpeRCLxBZA6dNIccf20x0NWcNY5Pj0iU4H6gCKqboop5S30udcMmZC3ydr21i5cBfzt7fsrP0p8nMADHoNUtnb1d7R8359sZBn5Og5Pasnppk3yZAZCk9WoHbI8heUNu9maMfPErUg3HStQtJ1RMZD";
        FacebookClient fbClient = new DefaultFacebookClient(accessToken);
        FileInputStream fis = new FileInputStream(new File("F:\\god.jpg"));
        
       FacebookType response =  fbClient.publish("me/photos",FacebookType.class,
               BinaryAttachment.with("god.jpg",fis),Parameter.with("message","God is Great"));
        System.out.println("fb.com/"+response.getId());
        
        
        
        // post
    }
    
}
