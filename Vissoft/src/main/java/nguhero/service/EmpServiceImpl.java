package nguhero.service;

import nguhero.dao.EmpDAO;
import nguhero.entity.Scott;
import nguhero.model.EmpSearch;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class EmpServiceImpl implements EmpService{
    private EmpDAO empDAO;
    public EmpServiceImpl(EmpDAO empDAO){
        this.empDAO=empDAO;
    }

    public List<Scott> findAll() {
        return empDAO.findAll();
    }
    public boolean findById(String id){
        return empDAO.findById(id);
    }

    public List<Scott> find(EmpSearch empSearch) {
        return empDAO.find(empSearch);
    }

    public List<String> findDep() {
        return empDAO.findDep();
    }

    public List<String> findMgr() {
        return empDAO.findMgr();
    }

    public void update(Scott emp) {
       empDAO.update(emp);
    }

    public void del(Scott emp) {
        empDAO.del(emp);

    }

    public void add(Scott emp) {
        empDAO.add(emp);

    }
}
