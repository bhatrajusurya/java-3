public class Employee {
    int id;
    String empName;
    String domain;
    public Employee(int id,String empName, String domain){
        this.id=id;
        this.empName=empName;
        this.domain=domain;

    }
    @Override
    public String toString() {
        return "Employee[domin=" + domain + ", empName=" + empName + ", id=" + id + "]";
    }
    public int getId() {
        return id;
    }
    public void SetId(int id) {
        this.id = id;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }

    
}
class Zensar{
    public static void main(String[] args){
        Employee E = new Employee(id:6653, empName:"Kiran",domain:"Java");
        System.out.println(E);
    }
}