package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("newproduct")
	public String showProductEntryForm(){
		return "dataentry.jsp";
	}
	
	@RequestMapping("saveproduct")
	public String saveNewProduct(@RequestParam("pcode") int pcode, @RequestParam("pname") String pname, @RequestParam("price") int price){
		Product product=new Product();
		product.setPcode(pcode);
		product.setPname(pname);
		product.setPrice(price);
		ProductDAO dao=new ProductDAO();
		dao.saveProduct(product);
		return "success.jsp";
	}
	
}
