package com.indigorobot;

import com.indigorobot.model.AddressBook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Controller
public class App {

  Map<Integer, AddressBook> addressBooks = new HashMap<Integer, AddressBook>();

  @RequestMapping("/welcome")
  public ModelAndView helloWorld() {
    String message = "<br>Hello world from within the application for mapping: /welcome";
    return new ModelAndView("welcome", "message", message);
  }

  @RequestMapping("/book")
  public @ResponseBody AddressBook getAddressBook() {
      AddressBook addressBook = new AddressBook();
      int id = 1;
      addressBook.setId(id);
      addressBook.setFirstName("hard-wired");
      addressBook.setLastName("entry");
      addressBooks.put(id, addressBook);
      return addressBook;
  }

}
