package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * Created by scottyvg on 2/20/17.
 */

@RestController
public class QuerystringController {

    @GetMapping("/individual-example")
    public String getIndividualParams(@RequestParam String filter) {
        return String.format("Filter is : %s", filter);
    }

    @GetMapping("/people")
    public String getPeople(
            @RequestParam("sort-by") String sortBy,
            @RequestParam(value = "sort-dir") String sortDirection) {
                return String.format("sortBy is %s and sortDirection is %s", sortBy, sortDirection);
    }

    @GetMapping("/vehicle")
    public String myCoolMethod(@RequestParam(value = "type", required = true) String type) {
        return type;
    }

    @GetMapping("/other")
    public String myCoolMethod(@RequestParam(value = "type", defaultValue = "car") String type) {
        return type;
    }

    @GetMapping("/map-example")
    public String getMapParams(@RequestParam Map querystring) {
        return querystring.toString();
    }

}

public class TaskInfo {
    private String sortBy;
    private String owner;

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

    @GetMapping("/tasks")
    public String getTasks(TaskInfo taskInfo) {
        return String.format("sort-by is %s; owner is %s", taskInfo.getSortBy(), taskInfo.getOwner());
    }

    @RequestMapping(value = "/", method = GET)
    public List<T> getAll(WebRequest webRequest){
        Map<String, String[]> params = webRequest.getParameterMap();
        //...
    }