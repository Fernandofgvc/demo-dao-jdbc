package Application;

import java.util.List;
import java.util.Scanner;

import Model.Dao.DaoFactory;
import Model.Dao.DepartmentDao;
import Model.Entities.Department;

public class App2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Test 1: department findById ===");
        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
        Department department = departmentDao.findById(6);
        System.out.println(department);

        System.out.println("=== Test 2: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== Test 3: department inset =====");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);;
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== Test 4: department update =====");
        Department dp2 = departmentDao.findById(1);
        dp2.setName("Food");
        departmentDao.update(dp2);
        System.out.println("Update completed");

        System.out.println("\n=== Test 5: department delete =====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
  }

}
