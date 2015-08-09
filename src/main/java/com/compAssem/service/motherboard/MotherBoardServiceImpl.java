package com.compAssem.service.motherboard;

import com.compAssem.dao.motherboard.MotherboardDaoImpl;
import com.compAssem.model.components.Motherboard;

import java.util.List;

/**
 * Created by amarendra on 09/08/15.
 */
public class MotherBoardServiceImpl {
    private MotherboardDaoImpl motherboardDao;

    public void setMotherboardDao(MotherboardDaoImpl motherboardDao) {
        this.motherboardDao = motherboardDao;
    }

    public List<Motherboard> findAllMotherboards(){
        return motherboardDao.findAll();
    }
}
