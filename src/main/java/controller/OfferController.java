package controller;

import model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.OffersService;

import java.util.List;

/**
 * Created by jihun on 2017. 2. 17..
 */
@Controller
public class OfferController {
    private OffersService offersService;

    @Autowired
    public void setOffersService(OffersService offersService) {
        this.offersService = offersService;
    }

    @RequestMapping("/offers")
    public String showOffers(Model model) {
        List<Offer> offers = offersService.getCurrent();

        model.addAttribute("offers", offers);

        return "offers";
    }

    @RequestMapping("/createoffer")
    public String createOffers(Model model) {
        return "createoffer";
    }
}
