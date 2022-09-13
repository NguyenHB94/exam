package examspring.exam.service;

import examspring.exam.domain.Product;
import examspring.exam.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct() {
        return this.productRepository.findAll();
    }

    public Optional<Product> getProductById(Long productId) {
        return this.productRepository.findById(productId);
    }

    public Product createProduct(Product newProduct) {
        return this.productRepository.save(newProduct);
    }

    public Product updateProduct(Product product, Long productId) {
        return this.productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        this.productRepository.deleteById(productId);
    }
}
