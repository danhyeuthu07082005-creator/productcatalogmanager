package java02.group1.productcatalogmanagementsystem.service;

import java02.group1.productcatalogmanagementsystem.dto.response.ProductResponse;
import java02.group1.productcatalogmanagementsystem.entity.Product;
import java02.group1.productcatalogmanagementsystem.repository.CategoryRepository;
import java02.group1.productcatalogmanagementsystem.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public List<ProductResponse> filterByCategory(Long categoryId) {

        return productRepository.findByCategory_Id(categoryId)
                .stream()
                .map(product -> {
                    ProductResponse dto = new ProductResponse();
                    dto.setId(product.getId());
                    dto.setName(product.getName());
                    dto.setDescription(product.getDescription());
                    dto.setPrice(BigDecimal.valueOf(product.getPrice()));
                    dto.setImageUrl(product.getImageUrl());
                    dto.setCategoryName(product.getCategory().getName());
                    return dto;
                })
                .toList();
    }

}
