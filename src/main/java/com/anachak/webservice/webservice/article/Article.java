package com.anachak.webservice.webservice.article;

import com.anachak.webservice.model.Todo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheasocheat on 4/6/17.
 */
@Path("article")
public class Article {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getArticle() {
        return "HELLO ARTICLE";
    }

    @GET
    @Path("/todo")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Todo> getTodo() {
        List<Todo> lstTodos = new ArrayList<>();
        Todo todo = null;
        for (int i = 1; i <= 10; i++) {
            todo = new Todo();
            todo.setId("" + i);
            todo.setSummary("Todo " + i);
            todo.setDescription("Desc " + i);
            lstTodos.add(todo);
        }
        return lstTodos;
    }
}
