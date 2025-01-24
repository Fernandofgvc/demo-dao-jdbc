package Application;

import java.time.LocalDate;

import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        
        Department obj = new Department(1, "Books");


        Seller seller = new Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, obj);
        
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println(seller);
    }
}
