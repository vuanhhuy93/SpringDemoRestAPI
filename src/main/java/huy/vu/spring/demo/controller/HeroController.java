package huy.vu.spring.demo.controller;

import huy.vu.spring.demo.Request.CreateHeroRequest;
import huy.vu.spring.demo.Request.UpdateHeroRequest;
import huy.vu.spring.demo.Response.MainResponse;
import huy.vu.spring.demo.bussiness.HeroBussiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HeroController extends BaseController{
    @Autowired
    HeroBussiness heroBussiness;


    @RequestMapping(value = "/hero", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MainResponse> createHero(@RequestBody CreateHeroRequest request) throws Exception{
        return returnSuccess(heroBussiness.createHero(request));
    }

    @RequestMapping(value = "/hero", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MainResponse> updateHero(@RequestBody UpdateHeroRequest request) throws Exception{
        return returnSuccess(heroBussiness.updateHero(request));
    }

    @RequestMapping(value = "/hero/{id}", method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MainResponse> deleteHero(@PathVariable("id") Long id) throws Exception{
        return returnSuccess(heroBussiness.deleteHero(id));
    }

    @RequestMapping(value = "/hero", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MainResponse> getAll() throws Exception{
        return returnSuccess(heroBussiness.listHero());
    }
    @RequestMapping(value = "/hero/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MainResponse> findHeroByID(@PathVariable("id") Long id) throws Exception{
        return returnSuccess(heroBussiness.findHeroById(id));
    }
}
