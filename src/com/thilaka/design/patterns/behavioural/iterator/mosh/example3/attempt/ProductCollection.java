package com.thilaka.design.patterns.behavioural.iterator.mosh.example3.attempt;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator<Product> createIterator(){
    return new ProductIterator();
  }

  public class ProductIterator implements Iterator<Product>{
    private int index;

    @Override
    public boolean hasNext() {
      return index < products.size();
    }

    @Override
    public Product current() {
      return products.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }

}
