package huy.vu.spring.demo.bussiness.BussinessImpl;

import huy.vu.spring.demo.Entity.Hero;
import huy.vu.spring.demo.Request.CreateHeroRequest;
import huy.vu.spring.demo.Request.UpdateHeroRequest;
import huy.vu.spring.demo.Response.CreateHeroResponse;
import huy.vu.spring.demo.Response.FindHeroResponse;
import huy.vu.spring.demo.Response.ListHeroResponse;
import huy.vu.spring.demo.Response.MainResponse;
import huy.vu.spring.demo.Service.HeroService;
import huy.vu.spring.demo.bussiness.HeroBussiness;
import huy.vu.spring.demo.convert.HeroConvert;
import huy.vu.spring.demo.enums.BussinessExceptionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroBussinessImpl implements HeroBussiness {
    @Autowired
    HeroService heroService;


    @Override
    public MainResponse createHero(CreateHeroRequest request) throws Exception {
        Hero newHero = HeroConvert.convert(request);
        heroService.createHero(newHero);
        CreateHeroResponse data = new CreateHeroResponse();
        data.setHeroId(newHero.getId());
        MainResponse<CreateHeroResponse> response = new MainResponse<>();
        buildSuccess(response);
        response.setData(data);
        return response;
    }

    @Override
    public MainResponse updateHero(UpdateHeroRequest request) throws Exception {

        Hero hero = heroService.findById(request.getHeroId());
        HeroConvert.convertUpdate(request, hero);
        heroService.updateHero(hero);
        MainResponse response = new MainResponse();
        buildSuccess(response);
        return response;
    }

    @Override
    public MainResponse listHero() throws Exception {
        List<Hero> heroes = heroService.findAll();
        MainResponse response = new MainResponse();
        buildSuccess(response);
        ListHeroResponse data = new ListHeroResponse();
        data.setHeroes(heroes);
        response.setData(data);
        return response;
    }

    @Override
    public MainResponse findHeroById(Long id) throws Exception {
        Hero hero = heroService.findById(id);
        MainResponse response = new MainResponse();
        buildSuccess(response);
        FindHeroResponse data = new FindHeroResponse();
        data.setHero(hero);
        return response;
    }

    @Override
    public MainResponse deleteHero(Long id) throws Exception {
        Hero hero = heroService.findById(id);
        heroService.deleteHero(hero);
        MainResponse response = new MainResponse();
        buildSuccess(response);
        return response;
    }

    private void buildSuccess(MainResponse response){
        response.setCode(BussinessExceptionEnum.SUCCESS.getCode());
        response.setMsg(BussinessExceptionEnum.SUCCESS.getMsg());
    }

}
