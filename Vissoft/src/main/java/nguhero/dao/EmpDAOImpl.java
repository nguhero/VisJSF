package nguhero.dao;

import nguhero.entity.Scott;
import nguhero.model.EmpSearch;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
@Repository
public class EmpDAOImpl implements EmpDAO{
    @PersistenceContext
    private EntityManager entityManager;

    //EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
    //EntityManager entityManager = entityManagerFactory.createEntityManager();
    public List<Scott> findAll() {
        return entityManager.createQuery("SELECT c FROM Scott c").getResultList();
    }
    public boolean findById(String id){
        return entityManager.createQuery("SELECT c from Scott c where empno=id").getResultList().size()==1;
    }
    public List<Scott> find(EmpSearch empSearch) {
        String str="SELECT c FROM Scott c where 1=1 ";
        if(!empSearch.getEmpno().equals("")){
            str+="and empno like :empno ";
        }
        if(!empSearch.getEname().equals("")){
            str+="and ename like :ename ";
        }
        if(!empSearch.getDep().equals("")){
            str+="and dep like :dep ";
        }
        if(!empSearch.getMgr().equals("")){
            str+="and mgr like :mgr ";
        }
        if(empSearch.getSalMax()!=0){
            str+="and sal between :salmin and :salmax ";
        }
        Query query=entityManager.createQuery(str);
        if(!empSearch.getEmpno().equals("")){
            query.setParameter("empno","%"+empSearch.getEmpno()+"%");
        }
        if(!empSearch.getEname().equals("")){
            query.setParameter("ename","%"+empSearch.getEname()+"%");
        }
        if(!empSearch.getDep().equals("")){
            query.setParameter("dep","%"+empSearch.getDep()+"%");
        }
        if(!empSearch.getMgr().equals("")){
            query.setParameter("mgr","%"+empSearch.getMgr()+"%");
        }
        if(empSearch.getSalMax()!=0){
            query.setParameter("salmin",empSearch.getSalMin());
            query.setParameter("salmax",empSearch.getSalMax());
        }
        return query.getResultList();
    }

    public List<String> findDep() {
        return entityManager.createQuery("select distinct c.dep from Scott as c").getResultList();
    }

    public List<String> findMgr() {
        return entityManager.createQuery(("select distinct c.ename from Scott as c")).getResultList();
    }


    public void update(Scott emp) {
     entityManager.merge(emp);
    }

    public void del(Scott emp) {
            entityManager.remove((entityManager.contains(emp)?emp:entityManager.merge(emp)));
    }

    public void add(Scott emp) {
            entityManager.persist(emp);
    }
}
