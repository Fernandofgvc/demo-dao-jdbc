package Application;

import java.util.List;

import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("=== Test 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== Test 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== Test 3: seller findAll =====");
        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }


    }
}
