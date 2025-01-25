package Application;

import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("=== Test 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
