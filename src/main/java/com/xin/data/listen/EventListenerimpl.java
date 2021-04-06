package com.xin.data.listen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xin.data.client.abstracts.option.DeleteOption;
import com.xin.data.client.abstracts.option.InsertOption;
import com.xin.data.client.abstracts.option.UpdateOption;
import com.xin.data.client.core.DealCanalEventListener;

@Component
public class EventListenerimpl extends DealCanalEventListener{

    @Autowired
    public EventListenerimpl(@Qualifier("handleInsertOptoin") InsertOption insertOption,
            @Qualifier("handleDeleteOption") DeleteOption deleteOption, 
            @Qualifier("handleUpdateOption") UpdateOption updateOption) {
        super(insertOption, deleteOption, updateOption);
    }
}
