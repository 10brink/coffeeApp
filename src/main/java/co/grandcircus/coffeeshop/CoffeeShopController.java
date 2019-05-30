package co.grandcircus.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.coffeeshop.model.Item;
import co.grandcircus.coffeeshop.model.ItemService;



@Controller
public class CoffeeShopController {
	@Autowired
	private person person;
	
	@Autowired
	CoffeeJdbcDao dao;
	
	@Autowired
	ItemService itemservice;


@RequestMapping("/") //forward slash is referencing landing page/home page
public ModelAndView index() {
	ModelAndView mv = new ModelAndView("home", "greeting", "Welcome to our Coffee Shop");
	return mv;
	
}

@PostMapping("newusr")
public ModelAndView formDetails() {

	return new ModelAndView("newPage");
}

@PostMapping("forminfo")
//consume data using requestparam that matches name attribute in the input fields	
public ModelAndView formDetails(@RequestParam("first") String fname,@RequestParam("last") String lname,@RequestParam("email") String email) {
person newPerson = new person(fname, lname);
	dao.addUser(fname, lname, email);
	return new ModelAndView("userSum", "nP", newPerson.getFirstName());
}

@RequestMapping("/about-page")
public ModelAndView about() {
	return new ModelAndView("about-page", "test",itemservice.getAllItems());
}
@RequestMapping("/search")
public ModelAndView search(@RequestParam("catSearch") String cat) {
	return new ModelAndView("about-page", "test",itemservice.searchByCat(cat));
}

@RequestMapping("/add-item")
public ModelAndView add(Item item){
	
	itemservice.addItems(item);
	return new ModelAndView("redirect:/about");
}

@RequestMapping("/listusers")
public ModelAndView add() {
	//System.out.println(dao.findAllUsers());
	return new ModelAndView("users", "users", dao.findAllUsers());
}


}