package com.umar.apps.client.component;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;

@Component
public class MessageComponent implements IsVueComponent {

    @Data String message = "Default Message";
}
