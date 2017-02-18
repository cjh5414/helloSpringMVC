package service;

import dao.OfferDAO;
import model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jihun on 2017. 2. 17..
 */
@Service
public class OffersService {

    private OfferDAO offerDAO;

    @Autowired
    public void setOfferDAO(OfferDAO offerDAO) {
        this.offerDAO = offerDAO;
    }

    public List<Offer> getCurrent() {

        return offerDAO.getOffers();
    }
}
