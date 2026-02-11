package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department dt = new Department(1, "Police");

        Seller seller = new Seller(21, "Lucas", "lucaz@gmail.com", new Date(), 1000.00, dt);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);

    }
}
