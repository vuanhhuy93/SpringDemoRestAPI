package huy.vu.spring.demo.bussiness;

import huy.vu.spring.demo.Request.CreateHeroRequest;
import huy.vu.spring.demo.Request.UpdateHeroRequest;
import huy.vu.spring.demo.Response.MainResponse;

public interface HeroBussiness {

    MainResponse createHero(CreateHeroRequest request) throws Exception;
    MainResponse updateHero(UpdateHeroRequest request) throws Exception;
    MainResponse listHero() throws Exception;
    MainResponse findHeroById(Long id) throws Exception;
    MainResponse deleteHero( Long id) throws Exception;
}
