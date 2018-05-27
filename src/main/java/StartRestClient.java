

import ch.qos.logback.core.net.server.Client;
import mppcurse.curse.Model.Curse;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class StartRestClient {


    public static void main(String[] args) {
        RestTemplate restTemplate=new RestTemplate();
        Curse cursa=new Curse(99,250,20);
        final String URL = "http://localhost:8080";
        try{
              Curse result= restTemplate.postForObject("http://localhost:8080/save",cursa, Curse.class);

              System.out.println("Result received "+result);

//
//            int id=1;
//
//            Curse[] result2= restTemplate.getForObject(URL+"/find/"+id, Curse[].class);
//            for(Curse c :result2)
//                System.out.println(c.toString());


//            Curse cursaUpdate= new Curse(1,6,6);
//            restTemplate.postForObject(URL+"/update",  cursaUpdate, Curse.class);
//
//            Curse resultDelete= restTemplate.postForObject(URL+"/deleteCursa/"+id,cursa, Curse.class);
//
//            System.out.println("Result received "+resultDelete);
//
//
//
//
//

            Curse[] resultGetAll= restTemplate.getForObject(URL+"/curse", Curse[].class);
            for(Curse c :resultGetAll)
                System.out.println(c.toString());


        }catch(RestClientException ex){
            System.out.println("Exception ... "+ex.getMessage());
        }

    }





}
