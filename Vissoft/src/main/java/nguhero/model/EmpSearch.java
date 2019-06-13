package nguhero.model;

public class EmpSearch {
    private String empno;
    private String ename;
    private String dep;
    private String mgr;
    private long salMin;
    private long salMax;
    public EmpSearch() {
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getMgr() {
        return mgr;
    }

    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    public long getSalMin() {
        return salMin;
    }

    public void setSalMin(long salMin) {
        this.salMin = salMin;
    }

    public long getSalMax() {
        return salMax;
    }

    public void setSalMax(long salMax) {
        this.salMax = salMax;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
