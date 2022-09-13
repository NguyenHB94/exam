package examspring.exam.controller;


import examspring.exam.domain.Product;
import examspring.exam.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/exam")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable("id") Long productId) {
        var ret = this.productService.getProductById(productId);
        return ResponseEntity.ok(ret);
    }
}
