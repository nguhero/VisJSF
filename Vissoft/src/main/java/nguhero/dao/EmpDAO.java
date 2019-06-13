package nguhero.dao;

import nguhero.entity.Scott;
import nguhero.model.EmpSearch;

import java.util.List;

public interface EmpDAO {
    List<Scott> findAll();
    List<Scott> find(EmpSearch empSearch);
    List<String> findDep();
    boolean findById(String id);
    List<String> findMgr();
    void update(Scott emp);
    void del(Scott emp);
    void add(Scott emp);
}
