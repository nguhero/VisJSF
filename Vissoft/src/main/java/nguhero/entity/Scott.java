package nguhero.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Scott {


    private String empno;
    private String ename;
    private String job;
    private String mgr;
    private Date hiredate;
    private long sal;
    private String dep;

    @Id
    @Column(name = "EMPNO")
    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    @Basic
    @Column(name = "ENAME")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "JOB")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "MGR")
    public String getMgr() {
        return mgr;
    }

    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    @Basic
    @Column(name = "HIREDATE")
    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Basic
    @Column(name = "SAL")
    public long getSal() {
        return sal;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    @Basic
    @Column(name = "DEP")
    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Scott scott = (Scott) o;

        if (sal != scott.sal) return false;
        if (empno != null ? !empno.equals(scott.empno) : scott.empno != null) return false;
        if (ename != null ? !ename.equals(scott.ename) : scott.ename != null) return false;
        if (job != null ? !job.equals(scott.job) : scott.job != null) return false;
        if (mgr != null ? !mgr.equals(scott.mgr) : scott.mgr != null) return false;
        if (hiredate != null ? !hiredate.equals(scott.hiredate) : scott.hiredate != null) return false;
        if (dep != null ? !dep.equals(scott.dep) : scott.dep != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empno != null ? empno.hashCode() : 0;
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (mgr != null ? mgr.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (int) (sal ^ (sal >>> 32));
        result = 31 * result + (dep != null ? dep.hashCode() : 0);
        return result;
    }
}
