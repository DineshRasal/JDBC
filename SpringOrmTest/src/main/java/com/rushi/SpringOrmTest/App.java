package com.rushi.SpringOrmTest;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
   ApplicationContext context=new ClassPathXmlApllicationContext("com/rushi/SpringOrmTest/config.xml");
		ProductDao productDao=(ProductDao) context.getBean("productDao");
		
		Product product=new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("Great");
		product.setPrice(152000);
		productDao.create(product);
		
		productDao.update(product);
		productDao.delete(product);
		
		Product product=productDao.find(1);
		
		List<Product> products=productDao.findAll();
		
		System.out.println(products);
  }
}
