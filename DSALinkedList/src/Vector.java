import java.util.List;

public class Vector {
    /*
    Vector is synchronized.
    Thread safe.
    ArrayList is not thread safe.
    Synchronized is slow. Overhead. Devs don't want overhead if they don't want synchronize.
     */

    public static void main(String[] args){
        List<Employee> employeeList = new java.util.Vector<>();
    }
}
