package com.umar.apps.client.component;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.axellience.vuegwt.core.client.component.hooks.HasCreated;
import com.umar.apps.client.Todo;
import jsinterop.annotations.JsProperty;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleTodoListComponent implements IsVueComponent, HasCreated {

    @Data @JsProperty
    List<Todo> todos = new ArrayList<>();

    @Override
    public void created() {
        todos.add(new Todo("Learn Java"));
        todos.add(new Todo("Learn Vue GWT"));
        todos.add(new Todo("Build Something Awesome"));
    }
}
