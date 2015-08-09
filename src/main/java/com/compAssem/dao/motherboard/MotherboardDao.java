package com.compAssem.dao.motherboard;

import com.compAssem.model.components.Cabinet;
import com.compAssem.model.components.Motherboard;
import com.compAssem.model.components.Processor;

import java.util.List;

/**
 * Created by amarendra on 09/08/15.
 */
public interface MotherboardDao {
    List<Motherboard> findMotherboardByProcessor(Processor processor);

    List<Motherboard> findMotherboardByCabinet(Cabinet cabinet);

    List<Motherboard> findAll();
}
