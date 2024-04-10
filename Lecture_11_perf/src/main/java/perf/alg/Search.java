package perf.alg;

import java.util.Set;

public class Search {

    public static void main(String[] args) {
        String[] products = generateDummyProducts(1000000);
        ProductSearcher searcher = new ProductSearchArray(products);
//        ProductSearcher searcher = new ProductSearchHashSet(products);
        long start = System.currentTimeMillis();
        boolean result = searcher.searchProduct("Specific Product Name");
        long endTime = System.currentTimeMillis();

        System.out.println("Result: " + result + ", time: " + (endTime - start) + "ms");
    }


    private interface ProductSearcher {
        boolean searchProduct(String productName);
    }

    private record ProductSearchArray(String[] products) implements ProductSearcher {

        @Override
        public boolean searchProduct(String productName) {
            for (String product : products) {
                if (product.equals(productName)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static class ProductSearchHashSet implements ProductSearcher {

        private final Set<String> products;

        public ProductSearchHashSet(String[] products) {
            this.products = Set.of(products);
        }

        @Override
        public boolean searchProduct(String productName) {
            return products.contains(productName);
        }
    }


    private static String[] generateDummyProducts(int numProducts) {
        String[] products = new String[numProducts];
        for (int i = 0; i < numProducts; i++) {
            products[i] = "Product " + i;
        }
        return products;
    }
}
