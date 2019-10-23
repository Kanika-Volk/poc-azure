package com.poc.pocazure;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocControllers {

    @GetMapping("get")
    ResponseEntity<Employee> get(){
        JSONObject json = new JSONObject();
        json.put("name","ram");
        json.put("rollno","1");

        Employee emp =new Employee();
        emp.setId(12);
        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
    }

    @PostMapping("/post")
    ResponseEntity<JSONObject> post(@RequestBody JSONObject object){
        object.put("unique","uniq");
        return new ResponseEntity<JSONObject>(object, HttpStatus.OK);
    }
}
