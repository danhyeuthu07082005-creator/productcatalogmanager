package java02.group1.productcatalogmanagementsystem.repository;

import java02.group1.productcatalogmanagementsystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    //Find Products by Categories
    List<Product> findByCategory_Id(Long categoryId);

}
