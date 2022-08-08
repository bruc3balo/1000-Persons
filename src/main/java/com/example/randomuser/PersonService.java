package com.example.randomuser;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {

    public void get1000Persons() {
        ResponseEntity<PersonModel> personEntity = new RestTemplate().getForEntity("https://randomuser.me/api/", PersonModel.class);
        Person person = personEntity.getBody().getPerson();
        person.greet();
    }

}
