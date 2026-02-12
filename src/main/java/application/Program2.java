package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Teste numero 1: Department findById =====");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("=== Teste numero 2: Department findAll =====");
        List<Department> list = departmentDao.findAll();

        for (Department dep : list) {
            System.out.println(dep);
        }

        System.out.println("=== Teste numero 3: Department insert =====");
        Department newDep = new Department(null, "Science");
        departmentDao.insert(newDep);
        System.out.println("Inserted! New id = " + newDep.getId());

        System.out.println("=== Teste numero 4: Department update =====");
        department = departmentDao.findById(5);
        department.setName("Literature");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("=== Teste numero 5: Department delete =====");
        System.out.println("Enter a Id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Done! Department deleted!");

    }
}
