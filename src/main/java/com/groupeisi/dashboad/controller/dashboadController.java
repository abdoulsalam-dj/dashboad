package com.groupeisi.dashboad.controller;

import com.groupeisi.dashboad.entities.dashboad;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/dashboad")
public class dashboadController {
    /*@GetMapping
    public List<dashboad> getAll() {
        //     String apivaluefromadminserviceUri = "http://localhost:8889/ADMINS-SERVICES/user";
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<dashboad>> responseEntity = restTemplate.exchange(
                "http://localhost:8889/ADMINS-SERVICES/user",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<dashboad>>() {
                });
        List<dashboad> pojoObjList = responseEntity.getBody();

        return pojoObjList;

    }
    @GetMapping("/test0")
    public String getAll1() {
        String apivaluefromadminserviceUri = "http://172.20.10.3:8082/user";
        RestTemplate restTemplate = new RestTemplate();
        String val = restTemplate.getForObject(apivaluefromadminserviceUri, String.class);
        return val;

    }
    @RequestMapping(value = "/{id}")
    public String getTestMessage(@PathVariable int id) {
        String apivaluefromadminserviceUri = "http://172.20.10.3:8082/user/"+id;
        RestTemplate restTemplate = new RestTemplate();
        String val = restTemplate.getForObject(apivaluefromadminserviceUri, String.class);
        return val;
    }


     */
    @RequestMapping(value = "/{id}")
    public dashboad getUser(@PathVariable int id) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<dashboad> responseEntity = restTemplate.exchange(
                "http://localhost:8082/appuser/"+id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<dashboad>() {
                });
        dashboad pojoOb = responseEntity.getBody();
        return pojoOb;
    }
}
