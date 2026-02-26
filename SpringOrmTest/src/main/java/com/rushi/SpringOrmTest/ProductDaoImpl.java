package com.rushi.SpringOrmTest;

import java.util.List;

@Component(name="productDao")
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		Integer result=(Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
			
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
		
	}

	@Override
	public Product find(int id) {
		Product product=hibernateTemplate.get(Product.class, id);
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> products=hibernateTemplate.loadAll(Product.class);
		return products;
	}

}
