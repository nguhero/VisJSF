package nguhero.service;

import nguhero.entity.Scott;
import nguhero.model.EmpSearch;

import java.util.List;
public interface EmpService {
    List<Scott> findAll();
    boolean findById(String id);
    List<Scott> find(EmpSearch empSearch);
    List<String> findDep();
    List<String> findMgr();
    void update(Scott emp);
    void del(Scott emp);
    void add(Scott emp);
}
