package com.compAssem.dao.motherboard;

import com.compAssem.model.components.Cabinet;
import com.compAssem.model.components.Motherboard;
import com.compAssem.model.components.Processor;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.Collections;
import java.util.List;

/**
 * Created by amarendra on 09/08/15.
 */
public class MotherboardDaoImpl implements MotherboardDao{

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Motherboard> findMotherboardByProcessor(Processor processor) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Motherboard.class);
        Criterion criterion = Restrictions.eq("processorSocket", processor.getProcessorSocket());
        criteria.add(criterion);
        List<Motherboard> motherboardList = criteria.list();
        return motherboardList;
    }

    @Override
    public List<Motherboard> findMotherboardByCabinet(Cabinet cabinet) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Motherboard.class);
        criteria.createAlias("cabinetType", "cabinetType");
        criteria.createAlias("cabinetType.cabinetSize", "cabinetSize");
        Criterion criterion = Restrictions.eq("cabinetSize", cabinet.getCabinetType().getCabinetSize());
        criteria.add(criterion);
        List<Motherboard> motherboardList = criteria.list();
        return motherboardList;
    }

    @Override
    public List<Motherboard> findAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Motherboard.class);
        List list = criteria.list();
        return list;
    }
}
