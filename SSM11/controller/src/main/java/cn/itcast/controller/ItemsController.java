package cn.itcast.controller;

import cn.itcast.domain.Item;
import cn.itcast.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private IItemsService itemsService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView modelAndView){
        List<Item> itemList = itemsService.findAll();
        modelAndView.addObject("item" , itemList);
        modelAndView.setViewName("itemDetail");
        return modelAndView;
    }

    @RequestMapping("/findById")
    public String findById(Model model){
        Item item = itemsService.findById(1);
        model.addAttribute("item" , item);
        return "itemDetail";
    }
}
