class EmpSal{
    static int  empNo = 0, totalSalary = 0;
    int salary;
    EmpSal(int sal){
        salary = sal;
        totalSalary += salary;
        empNo++;
    }
    static void dispTotalSal(){
        System.out.println(totalSalary);
    }
    static void totalEmp(){
        System.out.println(empNo);
    }
}
public class TotalSalary {

    public static void main(String[] args) {
        EmpSal e1 = new EmpSal(5000);
        EmpSal.dispTotalSal();
        EmpSal.totalEmp();
        EmpSal e2 = new EmpSal(6000);
        EmpSal.dispTotalSal();
        EmpSal.totalEmp();
        EmpSal e3 = new EmpSal(7000);
        EmpSal.dispTotalSal();
        EmpSal.totalEmp();
    }    
}
