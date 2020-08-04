package com.umar.apps.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.google.gwt.core.client.EntryPoint;
import com.umar.apps.client.component.*;

public class RootGwtApp implements EntryPoint {
    @Override
    public void onModuleLoad() {
        VueGWT.init();
        SimpleLinkComponent simpleLinkComponent = Vue.attach("#simpleLinkContainerComponent", SimpleLinkComponentFactory.get());
        LinkComponent linkComponent = Vue.attach("#linkContainerComponent", LinkComponentFactory.get());
        Vue.attach("#simpleTodosContainerComponent",SimpleTodoListComponentFactory.get());
        Vue.attach("#exclamationComponentContainer", ExclamationComponentFactory.get());
        Vue.attach("#twoWayBindingVModelDirectiveContainer", MessageComponentFactory.get());
    }
}
