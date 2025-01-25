package Application;

import Model.Dao.DaoFactory;
import Model.Dao.DepartmentDao;
import Model.Entities.Department;

public class App2 {
    public static void main(String[] args) throws Exception{
        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
        Department department = departmentDao.findById(6);
        System.out.println(department);
    }

}
