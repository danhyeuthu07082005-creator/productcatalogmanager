package java02.group1.productcatalogmanagementsystem.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import java02.group1.productcatalogmanagementsystem.dto.response.ProductResponse;
import java02.group1.productcatalogmanagementsystem.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SecurityRequirement(name = "api")
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class PublicProductController {
    private final ProductService productService;

    @GetMapping("/category/{id}")
    public ResponseEntity<List<ProductResponse>> filterByCategory(@PathVariable Long id) {
        return ResponseEntity.ok(productService.filterByCategory(id));
    }

}
