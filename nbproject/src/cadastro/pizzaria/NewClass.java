package cadastro.pizzaria;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import org.json.JSONException;
public class NewClass {
    
    public static void main(String [] args) throws MalformedURLException, IOException, JSONException{
       
        URL url = new URL("https://viacep.com.br/ws/01001000/json/");
        URLConnection urlConnection = url.openConnection();
        JSONObject json = new JSONObject();
        urlConnection.connect();
        
        BufferedReader in = new BufferedReader(
        new InputStreamReader(url.openStream()));
        String inputLine;
        while((inputLine = in.readLine())!=null)
          
            System.out.println(inputLine);
            
        in.close();
        
        
    }
}


