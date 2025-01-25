package Application;

import java.util.List;

import Model.Dao.DaoFactory;
import Model.Dao.DepartmentDao;
import Model.Entities.Department;

public class App2 {
    public static void main(String[] args) throws Exception{

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
  }

}
