package nguhero.controller;

import nguhero.entity.Scott;
import nguhero.model.EmpSearch;
import nguhero.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;
import javax.faces.bean.ManagedBean;
import java.util.List;


@ManagedBean
@SessionScope
@Controller
public class EmpController {


    @Autowired
    private EmpService empService;
    private List<Scott> emps;
    private EmpSearch empSearch=new EmpSearch();
    private Scott emp=new Scott();
    private List<String> listDep,listMgr;
    public void initEmpSearch(){
        this.empSearch=new EmpSearch();
    }
    public void initEmp(){
        this.emp=new Scott();
    }
    public void initDepAndMgr(){
        this.listDep=empService.findDep();
        this.listMgr=empService.findMgr();
    }
    public String add() {
        return "add?faces-redirect=true";
    }

    public String save() {
        this.empService.add(emp);
        return "search?faces-redirect=true";
    }
    public String search(){
        return "search?faces-redirect=true";
    }

    public String edit(Scott emp) {
        this.emp = emp;
        return "edit?faces-redirect=true";
    }

    public String update() {
        this.empService.update(this.emp);
        return "search?faces-redirect=true";
    }
    public String delete(Scott emp) {
        this.empService.del(emp);
        return "search?faces-redirect=true";
    }
    public String cancel(){
        return "search?faces-redirect=true";
    }

    public String find() {
        this.emps=empService.find(empSearch);
        return "index?faces-redirect=true";
    }
    public EmpService getEmpService() {
        return empService;
    }

    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }

    public List<Scott> getEmps() {
        return emps;
    }

    public void setEmps(List<Scott> emps) {
        this.emps = emps;
    }

    public EmpSearch getEmpSearch() {
        return empSearch;
    }

    public void setEmpSearch(EmpSearch empSearch) {
        this.empSearch = empSearch;
    }

    public Scott getEmp() {
        return emp;
    }

    public void setEmp(Scott emp) {
        this.emp = emp;
    }

    public List<String> getListDep() {
        return listDep;
    }

    public void setListDep(List<String> listjob) {
        this.listDep = listjob;
    }

    public List<String> getListMgr() {
        return listMgr;
    }

    public void setListMgr(List<String> listMgr) {
        this.listMgr = listMgr;
    }

}
